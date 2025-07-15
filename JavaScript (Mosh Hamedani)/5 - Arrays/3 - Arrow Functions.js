const members = [
    {name: 'Andre', age: 20},
    {name: 'Kaua', age: 19}
]

let member = members.find( (member) => member.name === 'Kaua' );

console.log(member);