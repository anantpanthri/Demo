package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepo;

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepo.findAll().forEach(cars::add);
        return cars;
    }

    public void addCar(Car car){
        carRepo.save(car);
    }
}
