package web.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static web.config.AppInit.carList;

public class CarDaoImpl implements CarDao {
    private final List<Car> cars = carList();
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
