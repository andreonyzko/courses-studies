"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
// Class decorator
function classDecorator(target) {
    console.log(`Logging Class...`);
    console.log(target);
}
function Template(source, parentId) {
    return (target) => {
        return class extends target {
            constructor(...args) {
                super(...args);
                const parent = document.querySelector(parentId);
                if (parent) {
                    parent.innerHTML = source;
                    parent.querySelector('h1').textContent = this.title;
                }
            }
        };
    };
}
// Method decorator
function methodDecorator(target, name, descriptor) {
    console.log(`Method Decorator`);
    console.log(target);
    console.log(name);
    console.log(descriptor);
}
// Acessor decorator
function AcessorDecorator(target, name, descriptor) {
    console.log(`Acessor Decorator`);
    console.log(target);
    console.log(name);
    console.log(descriptor);
}
// Field decorator
function FieldDecorator(target, name) {
    console.log(`Property/Field Decorator`);
    console.log(name, target);
}
// Parameter decorator
function ParamDecorator(target, name, position) {
    console.log(`Parameter Decorator`);
    console.log(target);
    console.log(name);
    console.log(`Position: ${position}`);
}
let Product = class Product {
    constructor(title, price) {
        this.title = title;
        this.price = price;
    }
    set setPrice(price) {
        this.price = price;
    }
    getPriceWithTax(tax) {
        return this.price * (1 + tax);
    }
};
__decorate([
    FieldDecorator
], Product.prototype, "title", void 0);
__decorate([
    AcessorDecorator
], Product.prototype, "setPrice", null);
__decorate([
    methodDecorator,
    __param(0, ParamDecorator)
], Product.prototype, "getPriceWithTax", null);
Product = __decorate([
    classDecorator,
    Template('<h1>Hello World!</h1>', '#root')
], Product);
const product = new Product("R7 5700X3D", 1200);
// ----------------------------------------------------
function Autobind(target, name, descriptor) {
    const originalMethod = descriptor.value;
    const newDescriptor = {
        get() {
            return originalMethod.bind(this);
        }
    };
    return newDescriptor;
}
class Printer {
    constructor() {
        this.message = "Hello World!";
    }
    showMessage() {
        console.log(this.message);
    }
}
__decorate([
    Autobind
], Printer.prototype, "showMessage", null);
const printer = new Printer();
document.querySelector("button").addEventListener('click', printer.showMessage);
const registeredValidators = {};
function Required(target, name) {
    registeredValidators[target.constructor.name] = Object.assign(Object.assign({}, registeredValidators[target.constructor.name]), { [name]: ['required'] });
}
function PositiveNumber(target, name) {
    registeredValidators[target.constructor.name] = Object.assign(Object.assign({}, registeredValidators[target.constructor.name]), { [name]: ['positive'] });
}
function validate(obj) {
    const objValidators = registeredValidators[obj.constructor.name];
    if (!objValidators)
        return true;
    for (let prop in objValidators) {
        for (let validator of objValidators[prop]) {
            if (validator === 'required' && !obj[prop])
                return false;
            else if (validator === 'positive' && obj[prop] < 1)
                return false;
        }
    }
    return true;
}
class Course {
    constructor(title, price) {
        this.title = title;
        this.price = price;
    }
}
__decorate([
    Required
], Course.prototype, "title", void 0);
__decorate([
    PositiveNumber
], Course.prototype, "price", void 0);
const courseForm = document.querySelector('form');
courseForm.addEventListener('submit', event => {
    event.preventDefault();
    const titleEl = courseForm.querySelector("#title");
    const priceEl = courseForm.querySelector("#price");
    const title = titleEl.value, price = +priceEl.value;
    const newCourse = new Course(title, price);
    if (!validate(newCourse)) {
        alert(`Invalid inputs, try again!`);
        return;
    }
    console.log(newCourse);
});
