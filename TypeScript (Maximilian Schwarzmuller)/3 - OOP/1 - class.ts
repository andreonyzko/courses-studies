// class User {
//     id: number;
//     name: string;

//     constructor(id: number, name: string) {
//         this.id = id;
//         this.name = "Max";
//     }
// }

export {};

class User{
    constructor(public readonly id: number, public name: string, private age: number){}
}

const user = new User(1, 'Andre', 20);
const user2 = new User(2, 'Kaua', 20);
console.log(user, user2);