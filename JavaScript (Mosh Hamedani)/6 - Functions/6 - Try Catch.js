const person = {
    firstName : ' ',
    lastName : ' ',

    get getName(){
        return `${this.firstName} ${this.lastName}`
    },

    set setName(value){
        if(typeof value !== 'string') throw new Error('Invalid name');

        const parts = value.split(' ');
        if(parts.length !== 2) throw new Error('Enter first name and last name');

        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}

try{
    person.setName = 'Andre Onyszko';
}
catch(e){
    alert(e);
}

console.log(person.getName);