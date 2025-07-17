export {};

class User{
    constructor(protected firstName: string, private lastName: string){}

    get fullName(){
        return `${this.firstName} ${this.lastName}`;
    }

    set setName(name: string){
        let fields = name.split(" ");
        this.firstName = fields[0];
        this.lastName = fields[1];
    }
}

class Employee extends User{
    constructor(private jobTitle: string, ...rest: string[]){
        super(rest[0], rest[1]);
    }

    work(){
        console.log(`${this.firstName} is working...`)
    }
}

const employee = new Employee('Developer', 'Andre', 'Onysz');

employee.setName = 'Andre Onyszko';
employee.work();