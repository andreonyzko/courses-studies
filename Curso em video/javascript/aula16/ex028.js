function fatorial(number) {
    let result=1
    for(let i=number; i>=1; i--){
        result *= i
    }
    return result
}

console.log(fatorial(6))