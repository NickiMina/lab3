package com.example.lab3;


@org.springframework.stereotype.Service
public class Service {

public String prnt(String type, String result){

    if(type.equals("1")){
        return"json";
    }
    else if(type.equals("2")){
        return "xml";
    }
    else if(type.equals("3")){
        return "csv";
    }
    else{
        return "bledny typ";
    }

}


}
