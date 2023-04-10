package services.concretes;

import dataAccess.abstracts.ICarDao;
import dataAccess.concretes.CarDao;
import entities.Car;
import services.abstracts.CarServices;

import java.util.List;

public class CarManager implements CarServices {

    private ICarDao carDao=new CarDao();
    @Override
    public void add(Car car) {
        if(car.getProductionYear()<=2000){
            System.out.println("Üretim yılı 2000'dan küçük olamaz.");
            return;
        }
        carDao.add(car);

    }

    @Override
    public List<Car> getAll() {
        for(Car cars: carDao.getAll()){
            System.out.println(cars.getId()+" "+ cars.getModel());
        }
        return  carDao.getAll();
    }

    @Override
    public Car getById(int id) {
        Car car=carDao.getById(id);
        System.out.println(car.getId()+" "+ car.getModel());
        return carDao.getById(id);
    }

    @Override
    public Car update(Car car) {
        carDao.update(car);
        return car;
    }

    @Override
    public void delete(int id) {
        carDao.delete(id);

    }
}
