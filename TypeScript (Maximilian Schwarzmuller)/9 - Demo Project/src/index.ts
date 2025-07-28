// Drag and Drop
interface Draggable {
    dragStartHandler(event: DragEvent): void;
    dragEndHandler(event: DragEvent): void;
}

interface DragTarget{
    dragOverHandler(event: DragEvent): void;
    dropHandler(event: DragEvent): void;
    dragLeaveHandler(event: DragEvent): void;
}

// Project Type
enum ProjectStatus{
    active,
    finished
}

class Project {
    constructor(public id: string, public title: string, public description: string, public people: number, public status: ProjectStatus){}
}

type Listeners<T> = (items: T[]) => void;

// Project State Management
class State<T>{
    protected listeners: Listeners<T>[] = [];

    addListener(fn: Listeners<T>){
        this.listeners.push(fn);
    }
}

class ProjectState extends State<Project>{
    private projects: Array<Project> = [];
    private static instance: ProjectState;

    static getInstance(){
        if(!this.instance) this.instance = new ProjectState();
        return this.instance;
    }

    addProject(title: string, description: string, people: number){
        this.projects.push(new Project(
            `project-${this.projects.length}`,
            title,
            description,
            people,
            ProjectStatus.active));

        this.updateListeners();
    }

    moveProject(projectId: string, newStatus: ProjectStatus){
        const project = this.projects.find(project => project.id === projectId);
        if(project && project.status !== newStatus){
            project.status = newStatus;
            this.updateListeners();
        }
    }

    updateListeners(){
        for(const fn of this.listeners){
            fn(this.projects.slice());
        }
    }
}

const projectState = ProjectState.getInstance();

// Validators
interface Validatable{
    value: string,
    required?: boolean,
    minLength?: number,
    maxLength?: number,
    min?: number,
    max?: number
}

function validate(obj: Validatable) {
    if(obj.required && !obj.value) return false;
    if(obj.minLength && obj.value.length < obj.minLength) return false;
    if(obj.maxLength && obj.value.length > obj.maxLength) return false;
    if(obj.min && +obj.value < obj.min) return false;
    if(obj.max && +obj.value > obj.max) return false;
    return true;
}

// Autobind
function autobind(_: any, _2: string, descriptor: PropertyDescriptor): PropertyDescriptor {
    const method = descriptor.value;
    return {
        get(){
            return method.bind(this);
        }
    }
}

// Base component class
abstract class Component<T extends HTMLElement, U extends HTMLElement>{
    templateEl: HTMLTemplateElement;
    rootEl: T;
    element: U;

    constructor(templateId: string, rootId: string, insertAtStart: boolean, elementId?: string){
        this.templateEl = document.querySelector(`#${templateId}`) as HTMLTemplateElement;
        this.rootEl = document.querySelector(`#${rootId}`) as T;
        this.element = document.importNode(this.templateEl.content, true).firstElementChild as U;
        if(elementId) this.element.id = elementId;

        this.attach(insertAtStart);
    }
    
    private attach(insertAtStart: boolean) {
        this.rootEl.insertAdjacentElement(insertAtStart? "afterbegin" : "beforeend", this.element);
    }

    abstract configure(): void;
    abstract renderComponent(): void;
}

class ProjectItem extends Component<HTMLUListElement, HTMLLIElement> implements Draggable{
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
    dragEndHandler(_: DragEvent): void {
        console.log(`Drag end`);
    }

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

// Project List Class
class ProjectList extends Component<HTMLDivElement, HTMLElement> implements DragTarget{
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

// Project Inputs Class
class ProjectInput extends Component<HTMLDivElement, HTMLFormElement> {
    titleEl: HTMLInputElement;
    descriptionEl: HTMLInputElement;
    peopleEl: HTMLInputElement;
    
    constructor(){
        super("project-input", "app", true, "user-input");
        this.titleEl = this.element.querySelector("#title") as HTMLInputElement;
        this.descriptionEl = this.element.querySelector("#description") as HTMLInputElement;
        this.peopleEl = this.element.querySelector("#people") as HTMLInputElement;
        this.configure();
    }
    
    configure(){
        this.element.addEventListener('submit', this.submitHandler);
    }

    renderComponent(){}
    
    private gatherUserInputs(): [string, string, number] | void {
        const title = this.titleEl.value;
        const description = this.descriptionEl.value;
        const people = this.peopleEl.value;

        if(
            !(validate({value: title, required: true, minLength: 5}) &&
            validate({value: description, required: true, minLength: 5}) &&
            validate({value: people, required: true, min: 1, max: 10}))
        ){
            alert("Invalid input, try again!");
            return;
        }

        return [title, description, +people];
    }

    @autobind
    private submitHandler(event: Event){
        event.preventDefault();

        const userInputs = this.gatherUserInputs();
        if(Array.isArray(userInputs)){
            projectState.addProject(...userInputs);
            this.clearInputs();
        }
    }

    private clearInputs(){
        this.titleEl.value = '';
        this.descriptionEl.value = '';
        this.peopleEl.value = '';
    }

}

new ProjectInput();
new ProjectList('active');
new ProjectList('finished');