function sum(n1: number, n2: number): number {
    return n1 + n2;
};

function log(message: string){
    console.log(message);
};

function throwError(errorMsg: string): never{
    console.log(errorMsg);
    throw new Error(errorMsg);
};

// --------------------------------------------------

function performJob(cb: (m: string) => void){
    cb('Job done');
};
performJob((msg: string) => console.log(msg));

// --------------------------------------------------

type User = {
    name: string,
    age: number,
    greet: () => string
};

let user: User = {
    name: 'Andre',
    age: 20,
    greet(){
        return `Hello, ${this.name}!`;
    }
};