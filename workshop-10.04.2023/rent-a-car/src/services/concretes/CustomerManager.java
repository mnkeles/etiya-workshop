package services.concretes;

import dataAccess.abstracts.ICustomerDao;
import dataAccess.concretes.CustomerDao;
import entities.Customer;
import services.abstracts.CustomerServices;

import java.util.List;

public class CustomerManager implements CustomerServices {
    private ICustomerDao customerDao=new CustomerDao();

    @Override
    public void add(Customer customer) {
        if (customer.getAge() < 18) {
            System.out.println("Yaşı 18'den küçük olamaz.");
            return;
        }
        customerDao.add(customer);

    }

    @Override
    public List<Customer> getAll() {
        for(Customer customers: customerDao.getAll()){
            System.out.println(customers.getFirstName()+"-"+customers.getLastName()+"-"+customers.getAge());
        }
        return customerDao.getAll();

    }

    @Override
    public Customer getById(int id) {
        Customer customer=customerDao.getById(id);
        System.out.println(customer.getFirstName()+"-"+customer.getLastName()+"-"+customer.getAge());
        return customerDao.getById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerDao.update(customer);
    }

    @Override
    public void delete(int id) {
        customerDao.delete(id);

    }
}
