const person = {
    firstName : ' ',
    lastName : ' ',

    get getName(){
        return `${this.firstName} ${this.lastName}`
    },

    set setName(value){
        const parts = value.split(' ');
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}

person.setName = 'Andre Onyszko';

console.log(person.getName);