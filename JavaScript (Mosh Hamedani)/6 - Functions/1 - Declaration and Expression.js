// Declaration
function walk() {
    console.log('walk');
}

// Expression
let run = function run() {
    console.log('run');
}

// Anonymous Expression
run = function(){
    console.log('run');
}

walk();
run();