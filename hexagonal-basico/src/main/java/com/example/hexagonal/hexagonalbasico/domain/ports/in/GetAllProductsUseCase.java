package com.example.hexagonal.hexagonalbasico.domain.ports.in;

import com.example.hexagonal.hexagonalbasico.domain.model.Product;
import java.util.List;

public interface GetAllProductsUseCase {

    List<Product> getAllProducts();

}
