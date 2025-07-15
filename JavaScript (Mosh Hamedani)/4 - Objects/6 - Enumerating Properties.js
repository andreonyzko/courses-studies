function Circle(radius){
    this.radius = radius;
    this.draw = function (){ console.log("Drawing circle...") }
}

let circle = new Circle(1);

for(let key in circle){ 
    console.log(key, circle[key]);
}

for(let key of Object.keys(circle)){
    console.log(key, circle[key]);
}

for(let entries of Object.entries(circle)){
    console.log(entries);
}

if('radius' in circle) 
    console.log('Circle has radius');

if( !('color' in circle) ) 
    console.log('Circle has not color');