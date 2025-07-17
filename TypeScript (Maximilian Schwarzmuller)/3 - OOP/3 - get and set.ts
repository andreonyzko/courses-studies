export {};

class User{
    constructor(private firstName: string, private lastName: string){}

    get fullName(){
        return `${this.firstName} ${this.lastName}`;
    }

    set setName(name: string){
        let fields = name.split(" ");
        this.firstName = fields[0];
        this.lastName = fields[1];
    }
}

const user = new User('Unknown', 'Unknown');

user.setName = 'Andre Onyszko';
console.log(`${user.fullName}`);