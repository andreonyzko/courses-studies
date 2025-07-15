function newCircle(radius) {
    return {
        radius,
        draw(){ console.log("Drawing circle...") }
    };
}

let c1 = newCircle(1);
let c2 = newCircle(2);

console.log(c1);
console.log(c2);