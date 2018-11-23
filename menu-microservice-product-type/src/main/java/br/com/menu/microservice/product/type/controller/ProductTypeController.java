package br.com.menu.microservice.product.type.controller;

import br.com.menu.microservice.product.type.dto.ProductTypeDto;
import br.com.menu.microservice.product.type.service.ProductTypeService;
import br.com.menu.standard.logging.MenuLogger;
import br.com.menu.standard.logging.MenuLoggerFactory;
import br.com.menu.standard.logging.MicroserviceLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    private static final MenuLogger logger = MenuLoggerFactory.getInstace(ProductTypeController.class, MicroserviceLogger.PRODUCT_TYPE);

    @PostMapping("/create")
    public ProductTypeDto createProductType(@RequestBody final ProductTypeDto productTypeDto ) {
        logger.info("Creating product type.");
        return productTypeService.createProductType(productTypeDto);
    }

    @GetMapping("/find/{id}")
    public ProductTypeDto findProductType(@PathVariable final long id) {
        logger.info("Finding product type.");
        return productTypeService.findProductType(id);
    }

    @PutMapping("/update")
    public ProductTypeDto updateProductType(@RequestBody final ProductTypeDto productTypeDto) {
        logger.info("Updating product type.");
        return productTypeService.createProductType(productTypeDto);
    }

    @DeleteMapping("/delete")
    public void deleteProductType(@PathVariable final Long id) {
        logger.info("Deleting product type.");
        productTypeService.deleteProductType(id);
    }

    @GetMapping("/list")
    public List<ProductTypeDto> listProductType(){
        logger.info("Finding all product types.");
        return productTypeService.listProductType();
    }
}
