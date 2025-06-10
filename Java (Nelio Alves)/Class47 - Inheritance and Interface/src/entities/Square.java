package entities;

import entities.enums.ShapeColor;

public class Square extends AbstractShape {
    private double side;

    public Square(ShapeColor color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Double area() {
        return side*side;
    }
}
