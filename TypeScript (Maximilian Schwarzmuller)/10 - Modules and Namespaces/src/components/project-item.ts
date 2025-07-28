import Component from "./component.js";
import { Draggable } from "../models/drag-and-drop.js";
import { Project } from "../models/project.js";
import { autobind } from "../decorators/autobind.js";

export class ProjectItem extends Component<HTMLUListElement, HTMLLIElement> implements Draggable{
    private project: Project;

    get persons(){
        return this.project.people + (this.project.people === 1 ? ' person' : ' persons'); 
    }
    
    constructor(rootId:string, project: Project){
        super('single-project', rootId, false, project.id.toString());
        this.project = project;

        this.configure();
        this.renderComponent();
    }

    @autobind
    dragStartHandler(event: DragEvent): void {
        event.dataTransfer!.setData('text/plain', this.element.id);
        event.dataTransfer!.effectAllowed = 'move';
    }

    @autobind
    dragEndHandler(_: DragEvent): void {}

    configure(){
        this.element.addEventListener('dragstart', this.dragStartHandler);
        this.element.addEventListener('dragend', this.dragEndHandler);
    }

    renderComponent(){
        this.element.querySelector('h2')!.textContent = this.project.title;
        this.element.querySelector('h3')!.textContent = this.persons + " assigned";
        this.element.querySelector('p')!.textContent = this.project.description;
    }
}