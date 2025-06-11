package entities;

public class Rectangle implements Shapes{
    private double base, heigth;

    public Rectangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return base*heigth;
    }
}
