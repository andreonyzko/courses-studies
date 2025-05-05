var age = 65
console.log(`Voce tem ${idade} anos`)
if(age<16){
    console.log(`Não vota`)
} else if(age<18 || age>65){
    console.log(`Voto não obrigatório`)
} else if(age>=18){
    console.log(`Voto obrigatório`)
}