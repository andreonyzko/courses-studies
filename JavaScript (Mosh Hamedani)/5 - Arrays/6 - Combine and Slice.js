const first = [1, 2, 3];
const second = [4, 5, 6];

// const combined = first.concat(second);
const combined = [...first, 'a', ...second, 'b'];

const sliced = combined.slice(2,4);
const sliced2 = combined.slice(4);

// const copy = combined.slice();
const copy = [...combined];

console.log(first);
console.log(second);
console.log(combined);
console.log(sliced);
console.log(sliced2);
console.log(copy);