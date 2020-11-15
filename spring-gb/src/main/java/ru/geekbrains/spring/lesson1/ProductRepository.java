package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();


    @PostConstruct
    public void init() {
        productList.add(new Product(1l, "apple", 50.0));
        productList.add(new Product(2l, "lemon", 75.0));
        productList.add(new Product(3l, "orange", 100.0));
        productList.add(new Product(4l, "potato", 25.0));
        productList.add(new Product(5l, "watermelon", 125.0));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(productList);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }
}
