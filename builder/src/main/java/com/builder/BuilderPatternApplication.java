package com.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.builder.model.Product;
import com.builder.service.ProductService;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BuilderPatternApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BuilderPatternApplication.class, args);

        // Contoh penggunaan pola Builder
        ProductService productService = context.getBean(ProductService.class);
        Product product = productService.createProduct(1L, "Product 1", "Description of Product 1", 99.99);
        System.out.println("Product created: " + product.toString());
    }
}