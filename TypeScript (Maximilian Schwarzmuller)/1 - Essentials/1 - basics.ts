let userName: string;
let userAge: 20;
let legalAge: boolean;

userName = 'Andre';
legalAge = true;

// -------------------------------

function add(a: number, b = 10) {
    return a + b;
};
add(5);
add(5, 21);