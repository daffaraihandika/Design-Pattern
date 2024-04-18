package com.builder.builder;

import com.builder.model.Product;

public interface ProductBuilder {
    Product build();
    ProductBuilder setId(Long id);
    ProductBuilder setName(String name);
    ProductBuilder setDescription(String description);
    ProductBuilder setPrice(double price);
}
