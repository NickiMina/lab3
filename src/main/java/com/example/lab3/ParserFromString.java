package com.example.lab3;

public class ParserFromString {
    public int upperLetters;
    public int lowerLetters;
    public int number;
    public int specialCharacters;

   public void setAllVariables(String received){
       String substring=received.substring(14,15);
       upperLetters=Integer.parseInt(substring);
       lowerLetters=Integer.parseInt(received.substring(31,32));
       number=Integer.parseInt(received.substring(43,44));
       specialCharacters=Integer.parseInt(received.substring(65,66));
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
