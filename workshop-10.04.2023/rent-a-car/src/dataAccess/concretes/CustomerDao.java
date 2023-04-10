package dataAccess.concretes;

import dataAccess.abstracts.ICustomerDao;
import entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements ICustomerDao {
    List<Customer> customerList=new ArrayList<>();

    public CustomerDao(){
        Customer customer=new Customer(1,"Muhammed","Keleşş","1234","Adana",30);
        customerList.add(customer);
    }


    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public Customer getById(int id) {
        return customerList.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public Customer update(Customer customer) {
        Customer customer1=getById(customer.getId());
        customerList.remove(customer1);
        customerList.add(customer);
        return customer;
    }

    @Override
    public void delete(int id) {
        customerList.remove(id);
    }
}
