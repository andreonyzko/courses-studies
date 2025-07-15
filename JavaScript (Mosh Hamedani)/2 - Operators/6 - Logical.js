console.log("true and true: " + (true && true) );
console.log("true and false: " + (true && false) );
console.log("true or false: " + (true || false) );
console.log("false or false: " + (false || false) );

let highIncome = true;
let goodCreditScore = true;
let canLoan = highIncome && goodCreditScore;

console.log("Good Score: " + goodCreditScore );
console.log("High Income: " + highIncome );
console.log("Can lend money? " + canLoan );
console.log("Application refused? " + !canLoan );

// Falsy (false) -> undefined, null, 0, false, '', NaN
// If not falsy, it's truthy

let userTheme;
let defaultTheme = 'light';
console.log("Theme: " + (userTheme || defaultTheme) );
userTheme = 'dark';
console.log("Theme: " + (userTheme || defaultTheme) );