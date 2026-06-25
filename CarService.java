package com.carsales.service;


////////;;;;////


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsales.entity.Car;
import com.carsales.repository.CarRepository;


@Service
public class CarService {

    @Autowired
    private CarRepository repo;

    public List<Car> getAllCars() {
        return repo.findAll();
    }

    public Car saveCar(Car car) {
        return repo.save(car);
    }

    public void deleteCar(Long id) {
        repo.deleteById(id);
    }
}
