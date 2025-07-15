function showNumbers(number){
    for(let i = 0; i <= number; i++){
        const message = i % 2 === 0 ? 'EVEN' : 'ODD';
        console.log(i, message);
    }
}

showNumbers(10);