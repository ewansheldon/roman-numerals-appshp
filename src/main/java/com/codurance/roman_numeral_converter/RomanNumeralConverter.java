package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
    public String arabicToRoman(int arabic) {
        String roman = "";

        for (int i = 0; i < arabic; i++) {
            roman += "I";
        }

        return roman;
    }
}
