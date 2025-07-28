import Component from "./component.js";
import { DragTarget } from "../models/drag-and-drop.js";
import { Project } from "../models/project.js";
import { autobind } from "../decorators/autobind.js";
import { projectState } from "../states/project-state.js";
import { ProjectStatus } from "../models/project.js";
import { ProjectItem } from "./project-item.js";

// Project List Class
export class ProjectList extends Component<HTMLDivElement, HTMLElement> implements DragTarget{
    assignProjects: Project[];

    constructor(private type: 'active' | 'finished'){
        super('project-list', 'app', false, `${type}-projects`);
        this.assignProjects = [];

        this.configure();
        this.renderComponent();
    }

    @autobind
    dragOverHandler(event: DragEvent): void {
        if(event.dataTransfer && event.dataTransfer.types[0] === 'text/plain'){
            event.preventDefault();
            const listEl = this.element.querySelector('ul')!;
            listEl.classList.add('droppable');
        }
    }

    @autobind
    dragLeaveHandler(_: DragEvent): void {
        const listEl = this.element.querySelector('ul')!;
        listEl.classList.remove('droppable');
    }

    @autobind
    dropHandler(event: DragEvent): void {
        const projectId = event.dataTransfer!.getData("text/plain");
        projectState.moveProject(projectId, this.type === 'active' ? ProjectStatus.active : ProjectStatus.finished);

        const listEl = this.element.querySelector('ul')!;
        listEl.classList.remove('droppable');
    }

    configure(){
        this.element.addEventListener('dragover', this.dragOverHandler);
        this.element.addEventListener('dragleave', this.dragLeaveHandler);
        this.element.addEventListener('drop', this.dropHandler);

        projectState.addListener((projects: Project[]) => {
            const relevantProjects = projects.filter(project => {
                return project.status === (this.type === 'active' ? ProjectStatus.active : ProjectStatus.finished);
            })
            this.assignProjects = relevantProjects;
            this.renderProject();
        });
    }

    renderComponent(){
        this.element.querySelector("ul")!.id= `${this.type}-projects-list`
        this.element.querySelector("h2")!.textContent = `${this.type.toUpperCase()} PROJECTS`;
    }

    private renderProject(){
        const listEl = document.querySelector(`#${this.type}-projects-list`)! as HTMLUListElement;
        listEl.innerText = '';
        for(const projectItem of this.assignProjects){
            new ProjectItem(this.element.querySelector('ul')!.id, projectItem);
        }
    }
}