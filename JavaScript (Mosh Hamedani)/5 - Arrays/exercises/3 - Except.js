const array = [1, 2, 3, 4, 5, 6]

except(array, [1, 2])

console.log(array);

function except(array, exclude) {
    for(let element of exclude){
        array.splice(array.indexOf(element), 1);
    }
}