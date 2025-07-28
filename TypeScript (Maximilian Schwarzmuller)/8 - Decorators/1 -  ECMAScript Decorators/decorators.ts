// Class Decorator
function logger<T extends new (...args: any[]) => any>(target: T, ctx: ClassDecoratorContext) {
    console.log(`Logger Decorator`);
    console.log(target);
    console.log(ctx);

    return class extends target{
        age = 20;

        constructor(...args: any[]){
            super(...args);
            console.log(`Class constructor`);
            console.log(this);
        }
    }
}

// Method Decorator
function autobind(target: Function, ctx: ClassMethodDecoratorContext) {
    ctx.addInitializer(function (this: any) {
        this[ctx.name] = this[ctx.name].bind(this);
    });

    return function(this: any){
        target.apply(this);
        console.log(`Have a good day :)`);
    }
}

// Field Decorator
function replacer(value:string) {
    return (target: undefined, ctx: ClassFieldDecoratorContext) => {
        console.log(target);
        console.log(ctx);

        return () => value;
    }
}

@logger
class Person {
    @replacer("Andre Onyszko")
    name = "Andre";

    @autobind
    greet(){
        console.log(`Hi, my name is ${this.name}`);
    }
}

const person = new Person();
const greet = person.greet;
greet();