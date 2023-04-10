import entities.Booking;
import entities.Car;
import entities.Customer;
import services.abstracts.BookingServices;
import services.abstracts.CarServices;
import services.abstracts.CustomerServices;
import services.concretes.BookingManager;
import services.concretes.CarManager;
import services.concretes.CustomerManager;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate time=LocalDate.now().plusYears(0);
        Car car1=new Car(2,"Ford",1000,2010,"Beyaz");
        Customer customer1=new Customer(2,"Necati","Keleş","100","Ankara",25);
        Booking booking1=new Booking(2,time,10,customer1,car1);

        BookingServices bookingManager=new BookingManager();
        CustomerServices customerManager=new CustomerManager();
        CarServices carManager=new CarManager();

        carManager.add(car1);
        carManager.getAll();
        carManager.getById(car1.getId());
        carManager.update(new Car(1,"Fiat2",250,2015,"Siyah"));
        carManager.getById(1);
        carManager.delete(1);

        customerManager.add(customer1);
        customerManager.getAll();
        customerManager.getById(booking1.getId());
        customerManager.update(new Customer(1,"Ahmet","Kaya","4321","Antalya",20));
        customerManager.getById(1);
        customerManager.delete(1);

        bookingManager.add(booking1);
        bookingManager.getAll();
        bookingManager.getById(booking1.getId());
        bookingManager.update((new Booking(1, LocalDate.now(),20,customer1,car1)));
        bookingManager.getById(1);
        bookingManager.delete(1);
    }
}