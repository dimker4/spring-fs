package ru.geekbrains.spring.lesson1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype") // Говорим, что бы при каждом создании экземпляра у нас возвращался новый экземпляр
public class CartService {
    private ProductRepository productRepository;
    private List<Product> cart = new ArrayList<>();

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(long id) {
        cart.add(productRepository.getProductById(id));
    }

    public void removeProduct(long id) {
        cart.removeIf(product -> product.getId() == id);
    }

    public double getAmountPrice () {
        return cart.stream().mapToDouble(Product::getPrice).sum();
    }
}
