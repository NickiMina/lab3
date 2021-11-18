package com.example.lab3;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    private Service service;

    public StringService stringservice=new StringService();
    public ParserFromString parserFromString;
    public Controller(Service service) {
       this.service = service;
    }
    @GetMapping("/nowy/{args}/txt")
    public String getString(@PathVariable String args)
    {
        parserFromString=stringservice.getAnswer(args);
        return service.convertToTxt(parserFromString);
    }
    @GetMapping("/nowy/{args}/json")//do poprawy
    public String getJson(@PathVariable String args){
        parserFromString=stringservice.getAnswer(args);
        return service.convertToJson(parserFromString);
    }
    @GetMapping("/nowy/{args}/xml")
    public String getXml(@PathVariable String args){
        parserFromString=stringservice.getAnswer(args);
        return service.convertToXml(parserFromString);
    }
    @GetMapping("/nowy/{args}/csv")
    public String getCsv(@PathVariable String args){
        parserFromString=stringservice.getAnswer(args);
        return service.convertToCsv(parserFromString);
    }

}
