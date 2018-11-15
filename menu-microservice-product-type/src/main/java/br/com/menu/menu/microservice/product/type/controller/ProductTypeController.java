package br.com.menu.menu.microservice.product.type.controller;

import br.com.menu.menu.microservice.product.type.model.ProductTypeEntity;
import br.com.menu.menu.microservice.product.type.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @PostMapping("/create")
    public ProductTypeEntity createProductType(@RequestBody ProductTypeEntity productTypeEntity ){
        return productTypeService.createProductType(productTypeEntity);
    }
}
