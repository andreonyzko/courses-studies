const numbers = [-1, 4, -8, 1, 6, -3, 9];

const positives = numbers.filter(value => value >= 0);
const negatives = numbers.filter(value => value <= 0);

console.log(numbers);
console.log(positives);
console.log(negatives);