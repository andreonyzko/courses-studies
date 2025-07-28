// Base component class
export default abstract class Component<T extends HTMLElement, U extends HTMLElement>{
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