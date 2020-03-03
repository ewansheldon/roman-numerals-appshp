package com.codurance.roman_numeral_converter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralShould {
  @ParameterizedTest
  @CsvSource({
          "1,I",
          "2,II",
          "3,III"
  })
  void convert_integer_to_roman_numeral(int arabic, String romanNumeral) {
    RomanNumeral converter = new RomanNumeral();
    Assert.assertEquals(romanNumeral, converter.romanFrom(arabic));
  }
}
