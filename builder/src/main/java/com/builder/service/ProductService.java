package com.builder.service;

import org.springframework.stereotype.Service;

import com.builder.builder.ConcreteProductBuilder;
import com.builder.model.Product;

@Service
public class ProductService {
    public Product createProduct(Long id, String name, String description, double price) {
        return new ConcreteProductBuilder()
                .setId(id)
                .setName(name)
                .setDescription(description)
                .setPrice(price)
                .build();
    }
}
