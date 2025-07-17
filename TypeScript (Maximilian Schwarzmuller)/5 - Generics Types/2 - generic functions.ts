function merge<T extends object>(a: T, b: T) {
    return {...a, ...b};
}

const letters = merge({name: 'Andre'}, {age: 20});