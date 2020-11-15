package ru.geekbrains.spring.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Создаю контекст спринга и передаю ему класс, который пометил аннтоацией Configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Создаю новый экземпляр класса через контекст, что бы зарегистрировать класс в спринге
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService.getProductList());

        CartService cartService = context.getBean("cartService", CartService.class);
        cartService.addProduct(1);
        cartService.addProduct(2);
        cartService.addProduct(2);
        cartService.addProduct(4);
        System.out.println(cartService.getAmountPrice());

    }
}
