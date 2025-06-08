package ex001.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ex001.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void remContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double result = baseSalary;

        for(HourContract contract : contracts){
            LocalDate date = contract.getDate();
            if(date.getMonthValue() == month && date.getYear() == year){
                result += contract.TotalValue();
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDepartament: " + departament.getName();
    }
}
