package com.example.lab3;




import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@org.springframework.stereotype.Service
public class Service {

public String convertToJson(String args){
    JSONParser parser = new JSONParser();
    try {
        JSONObject json = (JSONObject) parser.parse(args);
        return json.toString();
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return "blad";
}
public String printText(String args){
    return args;
}


}
