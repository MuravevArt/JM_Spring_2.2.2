package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("carsList", carService.getCars(count));
        return "cars";
    }

}
