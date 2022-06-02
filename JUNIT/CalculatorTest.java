import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }


    @ParameterizedTest
    @CsvSource({"11,22,+,33",
            "11,22,+e,33",
            "11,22,-,-11",
            "11,2,*,22",
            "22,2,/,11",
            "23,11,%,1",
            "21,11,x,1"})
    void calc(String numberA, String numberB, String operator, int expected){
        Exception ex = null;
        int actual = 0;
        try {
            actual = calculator.calc(numberA, numberB, operator);
        }catch (Exception e){
            ex = e;
            Assertions.assertTrue(e instanceof NotAnOperatorException);
        }
        if(ex == null){
            Assertions.assertEquals(expected, actual);
        }


    }
    @ParameterizedTest
    @CsvSource({"111111111111111111,111111111111111111 liegt nicht im gültigen Bereich für Integer!",
                "1234567, 1234567",
                "-5,-5"})
    void toInt(String input, String expected){
        String result = "";
        int rInt = 0;
        try {
            rInt = calculator.castToInt(input);
        }catch( OutOfValueRangeException e){
            result = e.getMessage();
        }
        if( result == ""){
            result =Integer.toString(rInt);
        }
        Assertions.assertEquals(expected, result);
    }





}
