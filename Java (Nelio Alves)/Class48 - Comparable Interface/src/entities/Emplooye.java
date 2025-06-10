package entities;

public class Emplooye implements Comparable<Emplooye>{
    private String name;
    private Double salary;
    
    public Emplooye(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", salary);
    }

    @Override
    public int compareTo(Emplooye o) {
        return -salary.compareTo(o.getSalary());
    }
}
