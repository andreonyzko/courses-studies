const array = [1, 2, 3, 4, 5, 6, 2, 2]

try{
    console.log( countOccurrences(array, 2) )
}
catch(e) {
    console.log(e.message);
}

function countOccurrences(array, search) {
    if(!Array.isArray(array)) throw new Error('Invalid Array');
    return array.filter(element => element === search).length;
}