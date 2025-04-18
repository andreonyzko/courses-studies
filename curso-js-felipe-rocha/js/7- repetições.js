let i=0;
let carros = ["Uno", "Pegout", "Kwid"];

// WHILE
while(i<10){
    console.log(i);
    i++;
}

// DO-WHILE
i=0;
do{
    console.log(i);
    i++;
}while(i<10)

// FOR
for(let i=0; i < carros.length; i++) console.log(carros[i]);
for(car of carros) console.log(car);
for(i in carros) console.log(carros[i]); // Melhor
carros.forEach(function(car){
    console.log(car)
})

let aluno = {
    ra: 2653613,
    nome: 'André'
}

for(atributo in aluno) console.log(aluno[atributo]);