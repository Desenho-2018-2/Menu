package br.com.menu.menu.microservice.product.type.repository;

import br.com.menu.menu.microservice.product.type.model.ProductTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductTypeEntity, Long> {
}
