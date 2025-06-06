package ex002;

public class Emplooye {
    public String name;
    public double grossSalary, tax;
    
    public void increaseSalary(double percentage){
        grossSalary += grossSalary*percentage/100;
    }

    @Override
    public String toString(){
        return name + ", $" + String.format("%.2f", (grossSalary-tax));
    }
}
