import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfValueRangeExceptionTest {
    @Test
    void testThrowing(){
        Exception ex = null;
        try {
            throw new OutOfValueRangeException();
        } catch (OutOfValueRangeException e) {
            ex = e;
            Assertions.assertTrue(e instanceof OutOfValueRangeException);
        }
        try {
            throw new OutOfValueRangeException("Test");
        } catch (OutOfValueRangeException e) {
            ex = e;
            Assertions.assertTrue(e instanceof OutOfValueRangeException);
        }
        if (ex == null) {
            Assertions.fail("Nichts Geworfen!");
        }
    }
}
