import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotAnOperatorExceptionTest {
    @Test
    void testThrowing(){
        Exception ex = null;
        try {
            throw new NotAnOperatorException("Example");
        } catch (NotAnOperatorException e) {
            ex = e;
            Assertions.assertTrue(e instanceof NotAnOperatorException);
        }
        if (ex == null) {
            Assertions.fail("Nichts Geworfen!");
        }
    }
}
