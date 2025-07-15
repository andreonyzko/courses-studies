const array = [1, 2, 3, 4, 5, 6]

console.log(includes(array, 7));

function includes(array, element) {
    for(let i of array){
        if(i === element) return true;
    }
    return false;
}