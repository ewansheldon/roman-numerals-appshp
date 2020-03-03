package com.codurance.RomanNumerals;

public class RomanNumerals {
  public String arabicToRoman(int number) {
    int arabic = number;
    String result = "";



    int hundreds = arabic / 100;
    for (int i = 0; i < hundreds; i++) {
      result += "C";
      arabic -= 100;
    }

    int fifties = arabic / 50;
    for (int i = 0; i < fifties; i++) {
      result += "L";
      arabic -= 50;
    }

    int tens = arabic / 10;
    for (int i = 0; i < tens; i++) {
      result += "X";
      arabic -= 10;
    }

    int fives = arabic / 5;
    for (int i = 0; i < fives; i++) {
      result += "V";
      arabic -= 5;
    }

    int ones = arabic / 1;
    for (int i = 0; i < ones; i++) {
      result += "I";
      arabic -= 1;
    }

    return result;
  }
}
