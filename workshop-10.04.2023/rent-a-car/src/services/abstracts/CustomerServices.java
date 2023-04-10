package services.abstracts;

import entities.Car;
import entities.Customer;

import java.util.List;

public interface CustomerServices {
    void add(Customer customer);
    List<Customer> getAll();
    Customer getById(int id);
    Customer update(Customer customer);
    void delete(int id);
}
