package br.com.menu.menu.microservice.category.repository;

import br.com.menu.menu.microservice.category.model.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

}
