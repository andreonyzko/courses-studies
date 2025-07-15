function countTruthy(array){
    let count = 0;
    for(let value of array){
        value ? count++ : count;
    }

    return count;
}

let array = [0, null, 5, 1, 2, 3]
console.log(countTruthy(array));