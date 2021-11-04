package com.example.lab3;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping("/nowy/{args}/{type}")
    public String getString(@PathVariable String args, @PathVariable String type)
    {
        final String uri = "http://localhost:8080/checkString/"+args;

      RestTemplate restTemplate = new RestTemplate();
      String result = restTemplate.getForObject(uri, String.class);

      return service.printText(args);
    }
    @GetMapping(value = "/{args}/1", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getText(@PathVariable String args){
        return service.printText(args);
    }
    @GetMapping(value = "/{args}/2", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getJson(@PathVariable String args){
        return service.convertToJson(args);
    }

}
