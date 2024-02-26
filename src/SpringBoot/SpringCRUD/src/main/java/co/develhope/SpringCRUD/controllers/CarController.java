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

    @PostMapping // crea un oggetto car
    public Car createCar(@RequestBody Car car){
        Car carSaved = carRepository.saveAndFlush(car);
        return carSaved;
    }

    @GetMapping("/all") // ritorna tutta la lista di car create in precedenza
    public List<Car> returnAllCar(){
        List<Car> carList = carRepository.findAll();
        return  carList;
    }

    @GetMapping("/{id}") //ritorna un sigolo oggetto car specificato tramite la chiamata di rete
    //REVIEW
    //    public Car singleCar(Car car){
    //        if(carRepository.existsById(car.getId()) ){
    //            return carRepository.findById(car.getId()).orElse(null);
    //        } else {
    //            return new Car();
    //        }
    //    }
    public Car singleCar(@PathVariable long id ){
        Car car = carRepository.getById(id);
        if(carRepository.existsById(car.getId())){
            return car;
        }else {
            return new Car();
        }
    }


    @PutMapping("/{id}") // modifica il tipo di brand di un singolo oggetto car
    public Car updateModel(@PathVariable long id, @RequestBody Car car) {
        car.setId(id);
        Car newCar = carRepository.saveAndFlush(car);
        return newCar;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        carRepository.deleteById(id);
    }

    @DeleteMapping
    public void deleteMultipleById(@RequestParam List<Long> id){
        carRepository.deleteAllById(id);
    }
}
