package ru.geekbrains.spring.lesson1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration // указываем, что класс является конфигурацией
@ComponentScan({"ru.geekbrains.spring.lesson1"}) // Указываем спрингу где искать наши компоненты
public class AppConfig {
}
