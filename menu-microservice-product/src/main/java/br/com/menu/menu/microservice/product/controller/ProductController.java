package br.com.menu.menu.microservice.product.controller;

import br.com.menu.menu.microservice.product.dto.ProductDto;
import br.com.menu.menu.microservice.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu/product")
public class ProductController {

    @Autowired
    public ProductService productService;

    @PostMapping("/create")
    public ProductDto createCategory(@RequestBody final ProductDto productDto){
        return productService.createProduct(productDto);
    }

    @GetMapping("/find/{id}")
    public ProductDto foundCategory(@PathVariable final Long id){
        return productService.findProduct(id);
    }

    @PutMapping("/update")
    public ProductDto updateCategory(@RequestBody ProductDto categoryDto) {
        return productService.updateProduct(categoryDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@RequestBody Long id) {
        productService.deleteProduct(id);
    }
}
