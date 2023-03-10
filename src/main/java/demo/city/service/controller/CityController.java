package demo.city.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/hello-docker")
    public String helloDocker(){
        return "Hello Docker";
    }
}