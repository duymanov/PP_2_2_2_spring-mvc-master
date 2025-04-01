package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {


private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCar(@RequestParam(value = "count",defaultValue = "5") int count, Model model){
        List<Car> cars = carService.getCountCars(count);
        model.addAttribute("message","Welcome to page with cars");
        model.addAttribute("cars", cars );
        return "cars";
    }

}
