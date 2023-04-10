package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private int id;
    private LocalDate bookingDate;
    private int bookingDay;
    private Customer customer;
    private Car car;

    public Booking() {
    }

    public Booking(int id, LocalDate bookingDate, int bookingDay, Customer customer, Car car) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.bookingDay = bookingDay;
        this.customer = customer;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(int bookingDay) {
        this.bookingDay = bookingDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
