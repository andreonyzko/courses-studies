package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    static DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException{
        if(checkin.isBefore(LocalDate.now()) || checkin.isBefore(LocalDate.now())){
            throw new DomainException("Reservation dates must be future dates");
        }
        if(checkout.isBefore(checkin)){
            throw new DomainException("Check-out date can't be before check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public int duration(){
        return (int)ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException{
        if(checkin.isBefore(LocalDate.now()) || checkin.isBefore(LocalDate.now())){
            throw new DomainException("Reservation dates must be future dates");
        }
        if(checkout.isBefore(checkin)){
            throw new DomainException("Check-out date can't be before check-in date");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room "
        + roomNumber
        + ", checkin: "
        + checkin.format(dateformat)
        + ", checkout: "
        + checkout.format(dateformat)
        + ", "
        + duration()
        + " nights.";
    }
}
