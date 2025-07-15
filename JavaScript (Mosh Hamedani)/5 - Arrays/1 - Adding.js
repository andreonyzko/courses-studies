const numbers = [3, 4];

// Start
numbers.unshift(1,2);

// End
numbers.push(5,6);

// Middle
numbers.splice(2, 0, 'a', 'b')

console.log(numbers);