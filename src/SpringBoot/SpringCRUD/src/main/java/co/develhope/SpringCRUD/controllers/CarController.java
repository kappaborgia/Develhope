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

    @GetMapping("/singleCar/{id}")
    //HACK /*
    //    public Car singleCar(Car car){
    //        if(carRepository.existsById(car.getId()) ){
    //            return carRepository.findById(car.getId()).orElse(null);
    //        } else {
    //            return new Car();
    //        }
    //    } */
    public Car singleCar(@PathVariable long id ){
        Car car = carRepository.getById(id);
        if(carRepository.existsById(car.getId())){
            return car;
        }else {
            return new Car();
        }
    }

    //FIXME il metodo restituisce valori null.
    @GetMapping("/ub/{id}")
    public Car updateModel(Car car) {
        if (carRepository.existsById(car.getId())) {
            car.setBrand("BMW");
            return car;
        } else {
            return new Car();
        }
    }
}
