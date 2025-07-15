const message = 'Hello World!';
const another = new String('       Hello World!          ');

console.log( message.length );
console.log( message[0] );

console.log( message.includes('llo Wor') );
console.log( message.includes('llo word') );

console.log( message.startsWith('Hello') );
console.log( message.endsWith('World!') );

console.log( message.replace('Hello', 'Hi') );
console.log( message.toUpperCase() );
console.log( message.toLowerCase() );

console.log( another.trimStart() );
console.log( another.trimEnd() );
console.log( another.trim() );

console.log( message.split(' '));