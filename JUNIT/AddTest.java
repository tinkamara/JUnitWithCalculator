import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AddTest {
    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }

    @Test
    void add(){
        int result = 0;
        try {
            result = calculator.add("2147483647", "20");
        }catch (Exception e){
            Assertions.fail("Hier hätte keine Ausnahme geworfen werden sollen!");
        }
        Assertions.assertEquals(-2147483629,result);

    }
    @Test
    void addOutOfRange(){
        int result = 0;
        try {
            result = calculator.add("40", "20");
        }catch (Exception e){
            Assertions.fail("Hier hätte keine Ausnahme geworfen werden sollen!");
        }
        Assertions.assertEquals(60,result);

    }

    @Test
    void addExact(){
        int result = 0;
        try {
            result = calculator.addExact("40", "20");
        }catch (Exception e){
            Assertions.fail("Hier hätte keine Ausnahme geworfen werden sollen!");
        }
        Assertions.assertEquals(60,result);

    }
    @Test
    void addExactOutOfRange(){
        int result = 0;
        try {
            result = calculator.addExact("2147483647", "200000");
        }catch (Exception e){
            Assertions.assertTrue(e instanceof OutOfValueRangeException);
        }
        Assertions.assertEquals(0,result);

    }

}
