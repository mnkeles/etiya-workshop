package dataAccess.abstracts;

import entities.Booking;

import java.util.List;

public interface IBookingDao {
    void add(Booking booking);
    List<Booking> getAll();
    Booking getById(int id);
    Booking update(Booking booking);
    void delete(int id);
}
