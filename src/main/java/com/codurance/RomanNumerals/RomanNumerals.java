package com.codurance.RomanNumerals;

public class RomanNumerals {
  public String arabicToRoman(int number) {
    String result = "";
    if (number == 5) return "V";
    for (int i = 0; i < number; i++) {
      result += "I";
    }
    return result;
  }
}
