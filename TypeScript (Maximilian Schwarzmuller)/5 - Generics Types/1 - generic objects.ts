export{}

let names: Array<string> = ['Andre', 'Kaua'];

type Obj<T, U> = {
    [prop: string]: T | U;
}

let user: Obj<string, number> = {};
user.name = "Andre";
user.country = 20;