package com.example.lab3;

import org.springframework.web.client.RestTemplate;

public class StringService {
    public ParserFromString parser;

    public ParserFromString getAnswer(String args){
        final String uri = "http://localhost:8080/checkString/"+args;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        parser = new ParserFromString();
        parser.setAllVariables(result);
        return parser;
    }

}
