package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
    public String arabicToRoman(int arabic) {
        String roman = "";

        for (int i = 0; i < arabic; i++) {
            while (arabic >= romanNumerals.TEN.arabic) {
                roman += romanNumerals.TEN.roman;
                arabic -= romanNumerals.TEN.arabic;
            }
            if (arabic >= romanNumerals.FIVE.arabic) {
                roman += romanNumerals.FIVE.roman;
                arabic -= romanNumerals.FIVE.arabic;
            }
            if (arabic >= romanNumerals.ONE.arabic) {
                roman += romanNumerals.ONE.roman;
            }
        }

        return roman;
    }

    private enum romanNumerals {
        TEN ("X", 10),
        FIVE ("V", 5),
        ONE ("I", 1);

        public String roman;
        public int arabic;

        romanNumerals(String roman, int arabic) {
            this.roman = roman;
            this.arabic = arabic;
        }
    }
}
