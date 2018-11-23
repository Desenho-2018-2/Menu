package br.com.menu.microservice.product.controller;

import br.com.menu.microservice.product.dto.ProductRequestDto;
import br.com.menu.microservice.product.dto.ProductResponseDto;
import br.com.menu.microservice.product.service.ProductService;
import br.com.menu.standard.logging.MenuLogger;
import br.com.menu.standard.logging.MenuLoggerFactory;
import br.com.menu.standard.logging.MicroserviceLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu/product")
public class ProductController {

    @Autowired
    public ProductService productService;

    private final MenuLogger logger = MenuLoggerFactory.getInstace(ProductController.class, MicroserviceLogger.PRODUCT);

    @PostMapping("/create")
    public ProductResponseDto createCategory(@RequestBody final ProductRequestDto productDto){
        logger.info("Creating category object.");
        return productService.createProduct(productDto);
    }

    @GetMapping("/find/{id}")
    public ProductRequestDto findCategory(@PathVariable final Long id){
        logger.info("Finding category object.");
        return productService.findProduct(id);
    }

    @PutMapping("/update")
    public ProductRequestDto updateCategory(@RequestBody ProductRequestDto categoryDto) {
        logger.info("Updating category object.");
        return productService.updateProduct(categoryDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@RequestBody Long id) {
        logger.info("Deleting category object.");
        productService.deleteProduct(id);
    }

//    @GetMapping("/all")
//    public List<ProductResponseDto> list(){
//        return productService.list();
//    }

}
