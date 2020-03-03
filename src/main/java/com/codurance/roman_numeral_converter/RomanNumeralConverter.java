package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
    public String arabicToRoman(int arabic) {
        String roman = "";

        for (romanNumerals numeral : romanNumerals.values()){
            while (arabic >= numeral.arabic) {
                roman += numeral.roman;
                arabic -= numeral.arabic;
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
