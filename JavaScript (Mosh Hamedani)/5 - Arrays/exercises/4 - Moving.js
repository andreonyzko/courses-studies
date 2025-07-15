const array = [1, 2, 3, 4, 5, 6]

const output = move(array, 0, 6)

console.log(output);

function move(array, index, offset) {
    if(index + offset >= array.length){
        console.log(`Invalid offset`);
        return;
    }

    const output = [...array];
    const element = output.splice(index, 1)[0];
    output.splice(index + offset, 0, element);
    return output;
}