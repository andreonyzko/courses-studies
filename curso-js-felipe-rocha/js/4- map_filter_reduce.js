// Map
let numbers = [1, 2, 3, 4, 5];
let multipledTwo = numbers.map(function(item){ // Vai manipular cada item da lista
    return item*2; 
})
console.log(multipledTwo);


// Filter
let ages= [18, 20, 24, 19, 19, 20, 21, 18, 18, 24];
let filteredAges = ages.filter(function(item){ // Vai filtrar cada elemento da lista com base em uma condição
    return item%2 == 0;
});
console.log(filteredAges);


// Reduce
let sumOfAges = ages.reduce(function(item, soma){ // Vai fazer a soma dos itens da lista
    return soma + item;
})
console.log(sumOfAges)