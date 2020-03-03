package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
    public String arabicToRoman(int arabic) {
        String roman = "";

        for (int i = 0; i < arabic; i++) {
            while (arabic >= 10) {
                roman += "X";
                arabic -= 10;
            }
            if (arabic >= 5) {
                roman += "V";
                arabic -= 5;
            }
            if (arabic > 0) {
                roman += "I";
            }
        }

        return roman;
    }
}
