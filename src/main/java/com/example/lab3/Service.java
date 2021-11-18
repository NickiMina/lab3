package com.example.lab3;




import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@org.springframework.stereotype.Service
public class Service {

public String convertToJson(String args){
return null;
}
public String printText(ParserFromString parser){
    return "upperLetters: "+parser.getUpperLetters()+"\r\n"+"lowerLetters: "
            +parser.getLowerLetters()+"\r\n"+ "numbers: "+parser.getNumber()+"\r\n"+"specialCharacters: "+parser.getSpecialCharacters();
}
public String printXml(ParserFromString parser){
    return null;
}

}
