package com.codurance.roman_numeral_converter;

public class RomanNumeral {
  public String romanFrom(int arabic) {
    String roman = "";
    while (arabic >= 1) {
      roman += "I";
      arabic -= 1;
    }
    return roman;
  }
}
