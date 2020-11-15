package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
        double amount = 0;
        for(Product product: cart) {
            amount += product.getPrice();
        }
        return amount;
    }
}
