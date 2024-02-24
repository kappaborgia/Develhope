package co.develhope.SpringCRUD.controllers;

import co.develhope.SpringCRUD.etities.Car;
import co.develhope.SpringCRUD.repository.CarRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public List<Car> returnAllCar(){
        List<Car> carList = carRepository.findAll();
        return  carList;
    }

    @GetMapping("/singleCar")
    public Car singleCar(Car car){
        if(carRepository.existsById(car.getId()) ){
            return car;
        } else {
            return null;
        }
    }

    @GetMapping("/ub")
    public Car updateModel(Car car){
        car.setBrand("BMW");
        return car;
    }
}

// TODO per ritornare un singolo oggetto car, nell GetMapping usare le graffe per specificare tramite id l'oggeto da ritornare.