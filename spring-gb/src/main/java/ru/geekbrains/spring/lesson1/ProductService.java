package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Component;

import java.util.List;

@Component // Говорим о том, что класс будет являться компонентом спринга
public class ProductService {

    ProductRepository productRepository;

    public ProductService (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList () {
        return productRepository.findAll();
    }
}
