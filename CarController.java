package com.carsales.controller;


////////////////

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.carsales.entity.Car;
import com.carsales.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("cars", service.getAllCars());
        model.addAttribute("car", new Car());
        return "index";
    }

    @PostMapping("/save")
    public String saveCar(@ModelAttribute Car car) {
        service.saveCar(car);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        service.deleteCar(id);
        return "redirect:/";
    }
}
