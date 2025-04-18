class Pessoa{
    constructor(name, lastname, age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    getFullName(){
        console.log(`${this.name} ${this.lastname}`);
    }

    speak(message="Hello World!"){
        console.log(`${this.name}: ${message}`);
    }

    static static_speak(message="Hello World!"){
        console.log(message);
    }
}

let person = new Pessoa('André', 'Onyszko', '20');
console.log(person);
person.getFullName();
person.speak("Olá Mundo!");
Pessoa.static_speak();

// Heranças

class Animal{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }

    speak(){
        console.log(`${this.name} made some noise!`);
    }
}

class Bird extends Animal{
    constructor(name, age){
        super(name, age);
    }

    speak(){
        console.log(`${this.name} sang!`);
    }
}

const nicky = new Bird("Nicky", 3);
console.log(nicky);
nicky.speak();