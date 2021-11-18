package com.example.lab3;

public class ParserFromString {
    public int upperLetters;
    public int lowerLetters;
    public int number;
    public int specialCharacters;
    public String received;

    public ParserFromString(String gotFromHost) {
        this.received=gotFromHost;
    }

   public void setAllVariables(String received){
       String substring=received.substring(13,14);//28,29,30//38,39,40//58.59
       upperLetters=Integer.parseInt(substring);
       lowerLetters=Integer.parseInt(received.substring(28,29));
       number=Integer.parseInt(received.substring(38,39));
       specialCharacters=Integer.parseInt(received.substring(58,59));
   }
    public int getUpperLetters() {
        return upperLetters;
    }

    public int getLowerLetters() {
        return lowerLetters;
    }

    public int getNumber() {
        return number;
    }

    public int getSpecialCharacters() {
        return specialCharacters;
    }
}
