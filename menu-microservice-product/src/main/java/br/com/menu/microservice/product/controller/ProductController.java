package br.com.menu.microservice.product.controller;

import br.com.menu.microservice.product.dto.ProductRequestDto;
import br.com.menu.microservice.product.dto.ProductResponseDto;
import br.com.menu.microservice.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu/product")
public class ProductController {

    @Autowired
    public ProductService productService;

    @PostMapping("/create")
    public ProductResponseDto createCategory(@RequestBody final ProductRequestDto productDto){
        return productService.createProduct(productDto);
    }

    @GetMapping("/find/{id}")
    public ProductRequestDto foundCategory(@PathVariable final Long id){
        return productService.findProduct(id);
    }

    @PutMapping("/update")
    public ProductRequestDto updateCategory(@RequestBody ProductRequestDto categoryDto) {
        return productService.updateProduct(categoryDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@RequestBody Long id) {
        productService.deleteProduct(id);
    }
}
