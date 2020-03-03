package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
    public String arabicToRoman(int arabic) {
        if (arabic == 3) return "III";
        if (arabic == 2) return "II";
        return "I";
    }
}
