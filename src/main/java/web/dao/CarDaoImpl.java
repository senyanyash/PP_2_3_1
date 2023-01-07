package web.dao;


import web.model.Car;

import java.util.Arrays;
import java.util.List;


public class CarDaoImpl implements CarDao {

    private List<Car> cars = Arrays.asList(new Car("toyota", "red", 1111),
            new Car("honda", "black", 2222),
            new Car("subaru", "blue", 3333),
            new Car("uaz", "green", 4444),
            new Car("bmw", "white", 5555));
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
