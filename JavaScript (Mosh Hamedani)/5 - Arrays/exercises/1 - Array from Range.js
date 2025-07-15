const numbers = arrayFromRange(1,4);
console.log(numbers);

function arrayFromRange(min, max) {
    const array = [];
    for(let i = min; i <= max; i++){
        array.push(i);
    }

    return array;
}