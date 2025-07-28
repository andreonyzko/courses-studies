import Component from './component.js';
import * as Validation from '../util/validation.js';
import { autobind as AutoBind } from '../decorators/autobind.js';
import { projectState } from '../states/project-state.js';

// Project Inputs Class
export class ProjectInput extends Component<HTMLDivElement, HTMLFormElement> {
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
            !(Validation.validate({value: title, required: true, minLength: 5}) &&
            Validation.validate({value: description, required: true, minLength: 5}) &&
            Validation. validate({value: people, required: true, min: 1, max: 10}))
        ){
            alert("Invalid input, try again!");
            return;
        }

        return [title, description, +people];
    }

    @AutoBind
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