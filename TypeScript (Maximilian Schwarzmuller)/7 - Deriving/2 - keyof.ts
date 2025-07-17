type User = {name: string, age: number};
type UserKeys = keyof User;

let validKey: UserKeys;
validKey = "name";
validKey = "age";

// --------------------------------------

function getProp<T extends object>(obj:T, key:keyof T) {
    let value = obj[key];

    return value;
}

let user: User = {
    name: 'Andre',
    age: 20
}

getProp<User>(user, "name");