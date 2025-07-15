function fizzBuzz(input){
    if(typeof(input) !== 'number') return 'Not a number';

    if (input % 3 === 0 || input % 5 === 0){
        let message = '';
        if(input % 3 === 0) message += 'Fizz';
        if(input % 5 === 0) message += 'Buzz';
        return message;
    }

    else return input;
}

console.log(fizzBuzz(17));