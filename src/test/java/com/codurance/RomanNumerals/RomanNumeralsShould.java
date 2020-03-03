package com.codurance.RomanNumerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsShould {
  RomanNumerals romanNumerals;

  @Before
  public void setUp() {
    romanNumerals = new RomanNumerals();
  }

  @Test
  public void one_returns_I() {
    String roman = romanNumerals.arabicToRoman(1);
    assertEquals("I", roman);
  }

  @Test
  public void two_returns_II() {
    String roman = romanNumerals.arabicToRoman(2);
    assertEquals("II", roman);
  }

  @Test
  public void three_returns_III() {
    String roman = romanNumerals.arabicToRoman(3);
    assertEquals("III", roman);
  }

  @Test
  public void five_returns_V() {
    String roman = romanNumerals.arabicToRoman(5);
    assertEquals("V", roman);
  }

  @Test
  public void six_returns_VI() {
    String roman = romanNumerals.arabicToRoman(6);
    assertEquals("VI", roman);
  }

  @Test
  public void seven_returns_VII() {
    String roman = romanNumerals.arabicToRoman(7);
    assertEquals("VII", roman);
  }

  @Test
  public void eight_returns_VIII() {
    String roman = romanNumerals.arabicToRoman(8);
    assertEquals("VIII", roman);
  }

  @Test
  public void ten_returns_X() {
    String roman = romanNumerals.arabicToRoman(10);
    assertEquals("X", roman);
  }

  @Test
  public void twenty_returns_XX() {
    String roman = romanNumerals.arabicToRoman(20);
    assertEquals("XX", roman);
  }

  @Test
  public void thirty_returns_XXX() {
    String roman = romanNumerals.arabicToRoman(30);
    assertEquals("XXX", roman);
  }

  @Test
  public void fifty_returns_L() {
    String roman = romanNumerals.arabicToRoman(50);
    assertEquals("L", roman);
  }

  @Test
  public void sixty_returns_LX() {
    String roman = romanNumerals.arabicToRoman(60);
    assertEquals("LX", roman);
  }

  @Test
  public void seventy_returns_LXX() {
    String roman = romanNumerals.arabicToRoman(70);
    assertEquals("LXX", roman);
  }

  @Test
  public void eighty_returns_LXXX() {
    String roman = romanNumerals.arabicToRoman(80);
    assertEquals("LXXX", roman);
  }

  @Test
  public void one_hundred_returns_C() {
    String roman = romanNumerals.arabicToRoman(100);
    assertEquals("C", roman);
  }

  @Test
  public void two_hundred_returns_CC() {
    String roman = romanNumerals.arabicToRoman(200);
    assertEquals("CC", roman);
  }

  @Test
  public void three_hundred_returns_CCC() {
    String roman = romanNumerals.arabicToRoman(300);
    assertEquals("CCC", roman);
  }
}
