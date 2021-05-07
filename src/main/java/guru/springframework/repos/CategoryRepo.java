package guru.springframework.repos;

import guru.springframework.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CategoryRepo extends CrudRepository<Category, Long> {


     Optional<Category> findByDescription(String description);
}
