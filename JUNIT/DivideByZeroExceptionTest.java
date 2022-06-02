import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideByZeroExceptionTest {
    @Test
    void testThrowing(){
        Exception ex = null;
        try {
            throw new DivideByZeroException();
        } catch (DivideByZeroException e) {
            ex = e;
            Assertions.assertTrue(e instanceof DivideByZeroException);
        }
        if (ex == null) {
            Assertions.fail("Nichts Geworfen!");
        }
    }
}
