const numbers = [4, 8, 1, 6, 3, 9];
console.log(numbers);

numbers.sort();
console.log(numbers);

numbers.reverse();
console.log(numbers);

// ----------------------------
const students = [
    {id: 1, name: 'Kadu'},
    {id: 4, name: 'Lucas'},
    {id: 2, name: 'Andre'}
]

students.sort((a, b) => {
    // a > b: 1
    // a < b: -1
    // a === b: 0

    const nameA = a.name.toUpperCase();
    const nameB = b.name.toUpperCase();

    if(nameA > nameB) return 1;
    if(nameA < nameB) return -1;
    return 0;
});

console.log(students);