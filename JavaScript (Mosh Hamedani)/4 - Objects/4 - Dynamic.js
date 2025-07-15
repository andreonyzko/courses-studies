function Circle(radius){
    this.radius = radius;
    this.draw = function (){ console.log("Drawing circle...") };
}

const circle = new Circle(1);

circle.color = 'red';
circle.border = null;
delete circle.border;

console.log(circle);