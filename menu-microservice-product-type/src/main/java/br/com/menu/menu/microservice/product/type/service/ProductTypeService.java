package br.com.menu.menu.microservice.product.type.service;

import br.com.menu.menu.microservice.product.type.model.ProductTypeEntity;
import br.com.menu.menu.microservice.product.type.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    public ProductTypeEntity createProductType(ProductTypeEntity productTypeEntity) {
        return productTypeRepository.save(productTypeEntity);
    }
}
