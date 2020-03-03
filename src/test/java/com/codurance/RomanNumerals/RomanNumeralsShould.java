package com.codurance.RomanNumerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsShould {
  RomanNumerals romanNumerals;

  @Before
  public void setUp() {
    romanNumerals = new RomanNumerals();
  }

  
  @Test
  public void one_returns_I() {
    String roman = romanNumerals.arabicToRoman(1);
    Assert.assertEquals("I", roman);
  }

  @Test
  public void two_returns_II() {
    String roman = romanNumerals.arabicToRoman(2);
    Assert.assertEquals("II", roman);
  }

  @Test
  public void three_returns_III() {
    String roman = romanNumerals.arabicToRoman(3);
    Assert.assertEquals("III", roman);
  }

  @Test
  public void five_returns_V() {
    String roman = romanNumerals.arabicToRoman(5);
    Assert.assertEquals("V", roman);
  }
}
