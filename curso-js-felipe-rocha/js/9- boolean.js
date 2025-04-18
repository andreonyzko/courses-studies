// Truth & Falsy
let string_vazia='', zero=0, nulo=null, indefinido=undefined;
console.log(`${!!string_vazia}, ${!!zero}, ${!!nulo}, ${!!indefinido}`); // Todos false

let listavazia= [], objvazio= {};
console.log(`${!!listavazia}`); // Lista e objeto vazios é true

console.log(`${!string_vazia}, ${!listavazia}`); // ! Inverte os valores