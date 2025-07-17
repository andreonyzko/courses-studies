type Obj = {
    [prop: string]: string | number;
}

let obj: Record<string, string | number>;

const person: Obj = {};
person.name = 'Andre';
person.age = 20;