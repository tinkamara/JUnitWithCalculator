import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

public class BlackboxTest {


    @ParameterizedTest
    @CsvSource({"11,22,+,33",
            "11,22,+e,33",
                "11,22,-,-11",
                "11,2,*,22",
                "22,2,/,11",
                "23,11,%,1",
                "12345678,12345678,*,Ergebnis liegt nicht im gültigen Bereich für Integer!",
                "2147483648,21,+e,2147483648 liegt nicht im gültigen Bereich für Integer!",
                "-2147483648,21,-,Ergebnis liegt nicht im gültigen Bereich für Integer!",
                "2147483648,21,*,2147483648 liegt nicht im gültigen Bereich für Integer!",
                "2147483648,21,/,2147483648 liegt nicht im gültigen Bereich für Integer!",
                "2147483648,21,%,2147483648 liegt nicht im gültigen Bereich für Integer!",
                "2147483648,21,+,2147483648 liegt nicht im gültigen Bereich für Integer!",
                "2147483647,3,+e,Ergebnis liegt nicht im gültigen Bereich für Integer!",
                "-2147483647,21,-,Ergebnis liegt nicht im gültigen Bereich für Integer!",
                "2147483648,21,+,2147483648 liegt nicht im gültigen Bereich für Integer!",
                "2147483647,3,+,-2147483646",
                "11,22,x,x ist keine gültige Rechenoperation!",
                "11,0,/,Man kann nicht durch null teilen!",
            "11,0,%,Man kann nicht durch null teilen!"})
     void calculate(String numberA, String numberB, String operator, String expected){
       String resultString = Calculate.calculate(numberA, numberB, operator);
        Assertions.assertEquals(expected, resultString);
    }
}
