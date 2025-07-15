const circle = {
    radius: 1,
    draw(){
        console.log('Drawing circle...');
    }
}


// let another = { color: 'blue' };
// for(let key in circle){
//     another[key] = circle[key];
// }

// let another = Object.assign({ color: 'red' }, circle);

let another = {
    color: 'yellow', 
    ...circle 
};

console.log(another)