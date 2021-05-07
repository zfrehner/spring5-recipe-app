package guru.springframework.repos;

import guru.springframework.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepo extends CrudRepository<UnitOfMeasure, Long> {


    Optional<UnitOfMeasure> findByDescription(String description);
}
