package app.productservice;

import app.productservice.entities.ProductEntity;
import app.productservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            ProductEntity product1 = new ProductEntity();
            product1.setName("Produit 1");

            ProductEntity product2 = new ProductEntity();
            product2.setName("Produit 2");

            ProductEntity product3 = new ProductEntity();
            product3.setName("Produit 3");

            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);

            System.out.println("Trois produits ont été ajoutés au démarrage de l'application.");
            System.out.println(productRepository.findAll());
        };
    }
}
