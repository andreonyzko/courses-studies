const numbers = [-1, 4, -8, 1, 6, -3, 9];

// let sum = 0;
// for(let number of numbers) sum += number;
// console.log(sum);

const sum = numbers.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
console.log(sum);