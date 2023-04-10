package services.abstracts;

import entities.Car;

import java.util.List;

public interface CarServices {
    void add(Car car);
    List<Car> getAll();
    Car getById(int id);
    Car update(Car car);
    void delete(int id);
}
