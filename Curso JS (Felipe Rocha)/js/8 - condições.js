// Condições
// == -> compara valor
// === -> compara valor e tipo

let soma = 1+2;

// If
if(soma === 2) console.log(`A soma é 2`);
else console.log(`A soma não é 2`);

// Else-if
let soma2 = 2+3;
if(soma === 3 && soma2 === 5) console.log('A primeira soma é 3 e a segunda é 5')
else if(soma === 3 || soma2 === 5) console.log('A primeira soma é 3 ou a segunda é 5')
else console.log('Nem a primeira soma é 3 e nem a segunda é 5')

// Ternary Operator
console.log(
(soma === 3 && soma2 === 5)? "A primeira soma é 3 e a segunda é 5" : 
(soma === 3 || soma2 === 5)? "A primeira soma é 3 ou a segunda é 5": 
"Nem a primeira soma é 3 e nem a segunda é 5"
)

// Switch Case
let carro = 'Tesla'
switch (carro){
    case "Uno":
        console.log('Uninho é potente');
        break;
    
    case 'Kwid':
        console.log('Kwid no asfalto, antena pro alto!');
        break;

    case 'Tesla':
        console.log('Nem carro isso é...');
        break;
    
    default:
        console.log("Carro desconhecido");
        break;
}