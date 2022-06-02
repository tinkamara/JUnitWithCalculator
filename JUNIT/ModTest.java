import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ModTest {

    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }

    @Test
    void mod(){
        int result = 0;
        try {
            result = calculator.mod("42", "20");
        }catch (Exception e){
            Assertions.fail("Hier hätte keine Ausnahme geworfen werden sollen!");
        }
        Assertions.assertEquals(2,result);

    }
    @Test
    void modByZero(){
        int result = 0;
        try {
            result = calculator.mod("40", "0");
        }catch (Exception e){
            Assertions.assertTrue(e instanceof DivideByZeroException);
        }
        Assertions.assertEquals(0,result);

    }
}
