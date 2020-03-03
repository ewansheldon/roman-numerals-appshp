package com.codurance.roman_numeral_converter;

public class RomanNumeral {
  public String romanFrom(int arabic) {
    String roman = "";

    for (romanNumerals numeral: romanNumerals.values()) {
      while (arabic >= numeral.arabic) {
        roman += numeral.roman;
        arabic -= numeral.arabic;
      }
    }
    return roman;
  }

  private enum romanNumerals {
    FIVE("V", 5),
    ONE("I", 1);

    private final String roman;
    private final int arabic;

    romanNumerals(String roman, int arabic) {
      this.roman = roman;
      this.arabic = arabic;
    }
  }
}
