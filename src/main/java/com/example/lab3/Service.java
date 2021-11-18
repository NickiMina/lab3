package com.example.lab3;




import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@org.springframework.stereotype.Service
public class Service {

public String convertToJson(ParserFromString parser){
    String str = """ 
        {
        "upperLetters": %d,
        "lowerLetters": %d,
        "numbers": %d,
        "specialCharacters": %d
        }
        """;
    return String.format(str,parser.getUpperLetters(),parser.getLowerLetters(), parser.getNumber(), parser.getSpecialCharacters());

}
public String convertToTxt(ParserFromString parser){
    return "upperLetters: "+parser.getUpperLetters()+"\r\n"+"lowerLetters: "
            +parser.getLowerLetters()+"\r\n"+ "numbers: "+parser.getNumber()+"\r\n"+"specialCharacters: "+parser.getSpecialCharacters();
}
public String convertToXml(ParserFromString parser){
    String str = """
        <Response>
        <Upper_letters>%d</Upper_letters>,
        <Lower_letters>%d</Lower_letters>,
        <Numbers>%d</Numbers>,
        <Special_characters>%d</Special_characters>,
        </Response>
        """;
    return String.format(str,parser.getUpperLetters(),parser.getLowerLetters(), parser.getNumber(), parser.getSpecialCharacters());

}
public String convertToCsv(ParserFromString parser){
    String str = """
        Upper_letters,Lower_letters, Numbers, Special_characters
        %d,%d,%d,%d
        """;
    return String.format(str,parser.getUpperLetters(),parser.getLowerLetters(), parser.getNumber(), parser.getSpecialCharacters());
}

}
