package app.productservice.controllers;

import app.productservice.entities.ProductEntity;
import app.productservice.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private ProductRepository productRepository;

    public TestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/allproducts")
    public List<ProductEntity> allproduct(){
        return productRepository.findAll();
    }
}
