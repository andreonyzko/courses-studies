// Strings
let frase = "André Onyszko"
console.log(frase);

let tamanho = frase.length;
console.log(tamanho);

let caracter_na_posicao = frase.charAt(3);
console.log(caracter_na_posicao);

// Pega a primeira posição de uma ocorrencia
console.log(frase.indexOf("n"));

// Pega a ultima posição de uma ocorrencia
console.log(frase.lastIndexOf("n"));

// Fatia a string conforme as posições passadas
console.log(frase.slice(0,5));

// Procura uma substring
console.log(frase.substring(6,13));

// Substitui uma substring por outra
console.log(frase.replace("André", "Andreonyz"))

// Converte para maiusculo e minusculo
console.log(frase.toUpperCase());
console.log(frase.toLowerCase());

console.log(frase.join())

// Fatia a string de acordo com a ocorrencia de um caractere
console.log(frase.split(' '));