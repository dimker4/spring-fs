package ru.geekbrains.spring.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Создаю контекст спринга и передаю ему класс, который пометил аннтоацией Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Создаю новый экземпляр класса через контекст, что бы зарегистрировать класс в спринге
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService.getProductList());

    }
}
