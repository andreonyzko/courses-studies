// Class decorator
function classDecorator(target: Function) {
    console.log(`Logging Class...`);
    console.log(target);
}

function Template(source: string, parentId: string) {
    return <T extends {new(...args: any[]): {title: string}}>(target: T) => {
        return class extends target{
            constructor(...args: any[]){
                super(...args);
                const parent = document.querySelector(parentId);
                if(parent){
                    parent.innerHTML = source;
                    parent.querySelector('h1')!.textContent = this.title;
                }
            }            
        }
    }
}

// Method decorator
function methodDecorator(target: any, name: string, descriptor: PropertyDescriptor) {
    console.log(`Method Decorator`);
    console.log(target);
    console.log(name);
    console.log(descriptor);
}

// Acessor decorator
function AcessorDecorator(target: any, name: string, descriptor: PropertyDescriptor) {
    console.log(`Acessor Decorator`);
    console.log(target);
    console.log(name);
    console.log(descriptor);
}

// Field decorator
function FieldDecorator(target: any, name: string) {
    console.log(`Property/Field Decorator`);
    console.log(name, target);
}

// Parameter decorator
function ParamDecorator(target: any, name: string, position: number) {
    console.log(`Parameter Decorator`);
    console.log(target);
    console.log(name);
    console.log(`Position: ${position}`);
}

@classDecorator
@Template('<h1>Hello World!</h1>', '#root')
class Product{
    @FieldDecorator
    title: string;
    price: number;

    constructor(title: string, price: number){
        this.title = title;
        this.price = price;
    }

    @AcessorDecorator
    set setPrice(price: number){
        this.price = price;
    }

    @methodDecorator
    getPriceWithTax(@ParamDecorator tax: number){
        return this.price * (1 + tax);
    }
}

const product = new Product("R7 5700X3D", 1200);

// ----------------------------------------------------

function Autobind(target: any, name: string, descriptor: PropertyDescriptor) {
    const originalMethod = descriptor.value;
    const newDescriptor: PropertyDescriptor = {
        get(){
            return originalMethod.bind(this);
        }
    }

    return newDescriptor;
}

class Printer{
    message = "Hello World!"

    @Autobind
    showMessage(){
        console.log(this.message);
    }
}

const printer = new Printer();
document.querySelector("button")!.addEventListener('click', printer.showMessage)

// -----------------------------------

interface ValidatorConfig {
    [prop: string]: {
        [validatable: string]: string[];
    }
}

const registeredValidators: ValidatorConfig = {};

function Required(target: any, name: string) {
    registeredValidators[target.constructor.name] = {
        ...registeredValidators[target.constructor.name],
        [name] : ['required']
    }
}

function PositiveNumber(target: any, name: string) {
    registeredValidators[target.constructor.name] = {
        ...registeredValidators[target.constructor.name],
        [name] : ['positive']
    }
}

function validate(obj: any) {
    const objValidators = registeredValidators[obj.constructor.name];
    if(!objValidators) return true;

    for(let prop in objValidators){
        for(let validator of objValidators[prop]){
            if(validator === 'required' && !obj[prop]) return false;
            else if(validator === 'positive' && obj[prop] < 1) return false;
        }
    }

    return true;
}

class Course{
    @Required
    title: string;

    @PositiveNumber
    price: number;

    constructor(title: string, price: number){
        this.title = title;
        this.price = price;
    }
}

const courseForm = document.querySelector('form')!;

courseForm.addEventListener('submit', event => {
    event.preventDefault();

    const titleEl = courseForm.querySelector("#title") as HTMLInputElement;
    const priceEl = courseForm.querySelector("#price") as HTMLInputElement;
    const title = titleEl.value, price = +priceEl.value;

    const newCourse = new Course(title, price);

    if(!validate(newCourse)){
        alert(`Invalid inputs, try again!`);
        return;
    }

    console.log(newCourse);
})
