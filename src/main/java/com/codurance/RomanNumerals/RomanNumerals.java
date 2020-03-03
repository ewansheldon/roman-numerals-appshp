package com.codurance.RomanNumerals;

public class RomanNumerals {
  public String arabicToRoman(int number) {
    int arabic = number;
    String result = "";

    if (number >= 5) {
      result += "V";
      arabic -= 5;
    }

    for (int i = 0; i < arabic; i++) {
      result += "I";
    }

    return result;
  }
}
