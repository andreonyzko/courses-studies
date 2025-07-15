const array = [1, 2, 3, 4, 5, 6, 2, 2]

console.log(getMax(array));


function getMax(array) {
    // const another = [ ...array ];
    // return another.sort()[array.length - 1];

    return array.reduce((a, c) => (c > a) ? c : a)
}
