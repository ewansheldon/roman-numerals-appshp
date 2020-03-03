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
        ONE_THOUSAND("M", 1000),
        FIVE_HUNDRED("D", 500),
        ONE_HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
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
