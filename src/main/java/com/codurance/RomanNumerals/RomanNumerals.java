package com.codurance.RomanNumerals;

public class RomanNumerals {
  public String arabicToRoman(int number) {
    String result = "";
    for (int i = 0; i < number; i++) {
      result += "I";
    }
//    if(number == 3) return "III";
//    if(number == 2) return "II";
//    return "I";
    return result;
  }
}
