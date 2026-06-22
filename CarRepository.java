package com.carsales.repository;



//////////


import org.springframework.data.jpa.repository.JpaRepository;
import com.carsales.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
