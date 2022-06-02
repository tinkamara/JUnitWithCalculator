import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MultTest {

    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }

    @Test
    void mult(){
        int result = 0;
        try {
            result = calculator.mult("40", "20");
        }catch (Exception e){
            Assertions.fail("Hier hätte keine Ausnahme geworfen werden sollen!");
        }
        Assertions.assertEquals(800,result);

    }
    @Test
    void multOutOfRange(){
        int result = 0;
        try {
            result = calculator.mult("4000000", "200000");
        }catch (Exception e){
            Assertions.assertTrue(e instanceof OutOfValueRangeException);
        }
        Assertions.assertEquals(0,result);

    }
}
