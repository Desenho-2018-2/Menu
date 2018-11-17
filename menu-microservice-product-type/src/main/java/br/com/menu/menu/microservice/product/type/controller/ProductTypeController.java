package br.com.menu.menu.microservice.product.type.controller;

import br.com.menu.menu.microservice.product.type.dto.ProductTypeDto;
import br.com.menu.menu.microservice.product.type.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @PostMapping("/create")
    public ProductTypeDto createProductType(@RequestBody final ProductTypeDto productTypeDto ) {
        return productTypeService.createProductType(productTypeDto);
    }

    @GetMapping("/find/{id}")
    public ProductTypeDto findProductType(@PathVariable final long id) {
        return productTypeService.findProductType(id);
    }

    @PutMapping("/update")
    public ProductTypeDto updateProductType(@RequestBody final ProductTypeDto productTypeDto) {
        return productTypeService.createProductType(productTypeDto);
    }

    @DeleteMapping("/delete")
    public void deleteProductType(@PathVariable final Long id) {
        productTypeService.deleteProductType(id);
    }

    @GetMapping("/list")
    public List<ProductTypeDto> listProductType(){
        return productTypeService.listProductType();
    }
}
