let person: {
    name: string,
    age: number,
    hobbies: Array<string>,
    address: {
        number: number,
        street: string,
        district: string,
        city: string
    }
};

person = {
    name: 'Andre',
    age: 20,
    hobbies: ['Video Games', 'Programming'],
    address: {
        number: 101,
        street: 'Street 1',
        district: 'Brooklyn',
        city: 'NY'
    }
};

// ---------------------------------------------

let address: Record<string, string | number>;

address = {
    number: 101,
    street: 'Street 1',
    district: 'Brooklyn',
    city: 'NY'
};