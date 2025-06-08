package entities;

public final class Individual extends Payer {
    private double healthExpenditures;

    public Individual(String name, double anualIncome, double spentHealth) {
        super(name, anualIncome);
        this.healthExpenditures = spentHealth;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxpaid() {
        double result;
        if(anualIncome < 20000){
            result = anualIncome * 0.15;
        }
        else{
            result = anualIncome * 0.25;
        }

        if(healthExpenditures > 0){
            result -= healthExpenditures * 0.5;
        }

        return result;
    }
}
