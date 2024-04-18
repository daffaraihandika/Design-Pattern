package com.builder.builder;

import com.builder.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ConcreteProductBuilder implements ProductBuilder {
    private Long id;
    private String name;
    private String description;
    private double price;

    @Override
    public Product build() {
        return new Product(id, name, description, price);
    }

    @Override
    public ProductBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
}
