package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    public static List<Car> carList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("toyota", "red", 1111));
        cars.add(new Car("honda", "black", 2222));
        cars.add(new Car("subaru", "blue", 3333));
        cars.add(new Car("uaz", "green", 4444));
        cars.add(new Car("bmw", "white", 5555));
        return cars;
    }
}