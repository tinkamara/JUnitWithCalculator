import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SubTest {
    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }

    void sub(){
        int result = 0;
        try {
            result = calculator.sub("40", "20");
        }catch (Exception e){
            Assertions.fail("Hier hätte keine Ausnahme geworfen werden sollen!");
        }
        Assertions.assertEquals(20,result);

    }
    @Test
    void subOutOfRange(){
        int result = 0;
        try {
            result = calculator.sub("-2147483648", "200000");
        }catch (Exception e){
            Assertions.assertTrue(e instanceof OutOfValueRangeException);
        }
        Assertions.assertEquals(0,result);

    }
}
