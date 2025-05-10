function parimp(n) {
    if(n%2 == 0){
        return 'numero par!';
    } else{
        return 'numero impar!'
    }
}

let number = 12
console.log(`${number} é um ${parimp(number)}`)