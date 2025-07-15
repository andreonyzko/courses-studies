const circle = {
    radius: 2,
    get area(){
        return Math.PI * this.radius**2;
    }
}

console.log(circle.area)