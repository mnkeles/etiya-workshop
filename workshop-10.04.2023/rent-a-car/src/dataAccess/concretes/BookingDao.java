package dataAccess.concretes;

import dataAccess.abstracts.IBookingDao;
import entities.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingDao implements IBookingDao {
    List<Booking> bookingList=new ArrayList<>();

    public BookingDao(){
        Booking booking=new Booking(1, LocalDate.now(),10,null,null);
        bookingList.add(booking);
    }
    @Override
    public void add(Booking booking) {
        bookingList.add(booking);

    }

    @Override
    public List<Booking> getAll() {
        return bookingList;
    }

    @Override
    public Booking getById(int id) {
        return bookingList.stream()
                .filter(booking -> booking.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public Booking update(Booking booking) {
        Booking booking1=getById(booking.getId());
        bookingList.remove(booking1);
        bookingList.add(booking);
        return booking;
    }

    @Override
    public void delete(int id) {
        bookingList.remove(id);

    }
}
