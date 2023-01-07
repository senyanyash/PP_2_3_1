package web.controller;

import org.springframework.ui.ModelMap;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars;
        if (count > 5) {
            cars = carService.getCars();
        } else {
            cars = carService.getCars().subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }

}
