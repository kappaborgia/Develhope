package co.develhope.SpringCRUD.controllers;

import co.develhope.SpringCRUD.etities.Car;
import co.develhope.SpringCRUD.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @PostMapping
    public Car createCar(@RequestBody Car car){
        Car carSaved = carRepository.saveAndFlush(car);
        return carSaved;

    }
}
