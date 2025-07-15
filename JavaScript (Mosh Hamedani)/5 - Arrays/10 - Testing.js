const numbers = [-1, 4, 8, 1, 6, 3, 9];

const allPositives = numbers.every(value => value >= 0);
const somePositive = numbers.some(value => value >= 0);

console.log(numbers);
console.log(`Are all elements positive? ${allPositives}`);
console.log(`Is there some positive element? ${somePositive}`);