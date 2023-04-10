package dataAccess.concretes;

import dataAccess.abstracts.ICarDao;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao implements ICarDao {
    List<Car> carList = new ArrayList<>();

    public CarDao() {
        Car car1 = new Car(1, "Fiat", 200, 2010, "Siyah");
        carList.add(car1);
    }


    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }

    @Override
    public Car getById(int id) {
        return carList.stream()
                .filter(car -> car.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public Car update(Car car) {
        Car car1 = getById(car.getId());
        carList.remove(car1);
        carList.add(car);
        return car;
    }

    @Override
    public void delete(int id) {
        carList.remove(id);
    }
}
