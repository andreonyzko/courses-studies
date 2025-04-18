function sum(n1, n2=10){ // n2 recebe 10 se não passado
    return n1 + n2;
}
console.log(sum(1,2));

// Arrow Function
let sumArrow = (n1, n2= 10) => n1+n2;
console.log(sumArrow(1));