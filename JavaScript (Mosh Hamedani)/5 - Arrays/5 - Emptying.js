let numbers = [1, 2, 3, 4, 5, 6, 7];
console.log(numbers);

numbers = [];
numbers.length = 0;
numbers.splice(0, numbers.length);
while(numbers.length > 0) numbers.pop();

console.log(numbers);