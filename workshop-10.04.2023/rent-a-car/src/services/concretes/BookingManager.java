package services.concretes;

import dataAccess.abstracts.IBookingDao;
import dataAccess.concretes.BookingDao;
import entities.Booking;
import services.abstracts.BookingServices;

import java.time.LocalDateTime;
import java.util.List;

public class BookingManager implements BookingServices {
    private IBookingDao bookingDao=new BookingDao();

    @Override
    public void add(Booking booking) {
        if (booking.getBookingDate().getYear() < LocalDateTime.now().getYear()) {
            System.out.println("Kiralama yılı bulunduğumuz yıldan  önce olamaz.");
            return;
        }
        bookingDao.add(booking);
    }

    @Override
    public List<Booking> getAll() {
        for(Booking bookings: bookingDao.getAll()){
            System.out.println(bookings.getId()+"-"+bookings.getBookingDate());
        }

       return bookingDao.getAll();
    }

    @Override
    public Booking getById(int id) {
        Booking booking=bookingDao.getById(id);
        System.out.println(booking.getCustomer().getFirstName()+"-"+booking.getCar().getModel()
                +"-"+ booking.getBookingDate());
        return bookingDao.getById(id);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingDao.update(booking);
    }

    @Override
    public void delete(int id) {
        bookingDao.delete(id);
    }
}
