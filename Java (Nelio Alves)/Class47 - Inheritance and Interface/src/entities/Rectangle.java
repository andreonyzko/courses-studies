package entities;

import entities.enums.ShapeColor;

public class Rectangle extends AbstractShape{
    private double base, height;

    public Rectangle(ShapeColor color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return base*height;
    }
}
