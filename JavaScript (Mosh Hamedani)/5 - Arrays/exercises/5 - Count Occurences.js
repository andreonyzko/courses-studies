const array = [1, 2, 3, 4, 5, 6, 2, 2]

console.log( countOccurrences(array, 2) )

function countOccurrences(array, search) {
    // return array.reduce((accumulator, currentValue) =>  accumulator + (currentValue === search ? 1 : 0), 0);
    return array.filter(element => element === search).length;
}