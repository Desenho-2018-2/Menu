package br.com.menu.menu.microservice.category.repository;

import br.com.menu.menu.microservice.category.model.CategoryEntity;
import br.com.menu.menu.microservice.category.model.CategoryEntityPk;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, CategoryEntityPk> {

    @Query("SELECT c FROM CategoryEntity c WHERE c.categoryId = :categoryId")
    CategoryEntity findByOneId(@Param("categoryId") Long categoryId);

}
