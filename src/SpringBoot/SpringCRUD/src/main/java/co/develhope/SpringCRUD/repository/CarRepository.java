package co.develhope.SpringCRUD.repository;

import co.develhope.SpringCRUD.etities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
