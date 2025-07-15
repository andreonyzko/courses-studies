const numbers = [1, 2, 3, 1, 4]
console.log(numbers);

console.log(numbers.indexOf('a'));
console.log(numbers.indexOf(1));
console.log(numbers.indexOf(1,2));
console.log(numbers.lastIndexOf(1));

console.log(numbers.includes('a'));
console.log(numbers.includes(1));

// ------------------------------
const members = [
    {name: 'Andre', age: 20},
    {name: 'Kaua', age: 19}
]

let member = members.find( function(member) { return member.name === 'Kaua' } );
let memberIndex = members.findIndex( function(member) { return member.name === 'Kaua' } );

console.log(memberIndex, member);