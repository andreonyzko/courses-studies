function sum(discount, ...args) {
    const total = args.reduce((accumulator, currentValue) => accumulator + currentValue);

    return total - total * discount / 100; 
}

console.log( sum(10, 2, 3, 4, 5, 6, 7) )