function Circle(radius){
    this.radius = radius;
    this.draw = function (){ console.log("Drawing circle...") };
}

const circle = new Circle(1);
console.log(circle);