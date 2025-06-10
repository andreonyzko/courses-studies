package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
    private double pricePerHour, pricePerDay;
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental carRental) {
        double duration = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        duration = Math.ceil(duration/60);

        double basicPayment, tax;

        if(duration < 12) basicPayment = pricePerHour*duration;
        else basicPayment = pricePerDay*Math.ceil(duration/24);

        tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
