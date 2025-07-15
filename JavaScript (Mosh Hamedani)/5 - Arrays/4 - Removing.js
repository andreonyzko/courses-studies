const numbers = [1, 2, 3, 4, 5, 6, 7];
console.log(numbers);

// Start
const first = numbers.shift();
console.log(`Removed first number: ${first}`);

// End
const last = numbers.pop();
console.log(`Removed last number: ${last}`)

// Middle
const middle = numbers.splice(2, 2);
console.log(`Removed numbers ${middle}`);

console.log(numbers);