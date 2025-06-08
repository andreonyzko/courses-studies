package entities;

public final class Company extends Payer{
    private int employees;

    public Company(String name, double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double taxpaid() {
        if(employees > 10){
            return anualIncome * 0.14;
        }
        else{
            return anualIncome * 0.16;
        }
    }
}
