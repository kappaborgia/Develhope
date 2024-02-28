package co.develhope.springrepository1.Repositories;

import co.develhope.springrepository1.Entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarsRepository extends JpaRepository<Cars, Long> {
}
