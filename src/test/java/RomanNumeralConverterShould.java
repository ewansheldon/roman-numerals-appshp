import com.codurance.roman_numeral_converter.RomanNumeralConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterShould {
    @ParameterizedTest
    @CsvSource({
            "I,1",
            "II,2",
            "III,3",
            "V,5",
            "VI,6",
            "VII,7",
            "VIII,8",
            "X,10",
            "XX,20",
            "XXX,30",
    })
    public void converts_arabic_int_to_roman_string(String roman, int arabic) {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String converted = converter.arabicToRoman(arabic);
        assertEquals(roman, converted);
    }
}
