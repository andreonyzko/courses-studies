export {};

class User{
    constructor(public readonly id: number, public name: string, private age: number){}

    greet(){
        console.log(`Hello ${this.name}!`);
    }
}

const user = new User(1, 'Andre', 20);
const user2 = new User(2, 'Kaua', 20);

user.greet();
user2.greet();