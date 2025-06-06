package entities;
public class Triangle {
    public double a, b, c;

    public double area(){
        return a*b/2.0;
    }

    public void showArea(double area){
        System.out.println("Triangle Area is " + area);
    }
}
