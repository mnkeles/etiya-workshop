package services.abstracts;

import entities.Booking;
import entities.Car;

import java.util.List;

public interface BookingServices {
    void add(Booking booking);
    List<Booking> getAll();
    Booking getById(int id);
    Booking update(Booking booking);
    void delete(int id);
}
