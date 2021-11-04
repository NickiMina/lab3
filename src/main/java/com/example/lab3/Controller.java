package com.example.lab3;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping("/nowy/{type}")
    public String getString(@PathVariable String type)
    {
        //final String uri = "http://localhost:8080/checkString/NazwaPliku12!(";

       // RestTemplate restTemplate = new RestTemplate();
        //String result = restTemplate.getForObject(uri, String.class);

       return service.prnt(type);
    }

}
