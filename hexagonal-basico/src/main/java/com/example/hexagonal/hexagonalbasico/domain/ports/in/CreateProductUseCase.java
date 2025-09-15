package com.example.hexagonal.hexagonalbasico.domain.ports.in;

import com.example.hexagonal.hexagonalbasico.domain.model.Product;

public interface CreateProductUseCase {

    Product createProduct(Product product);

}
