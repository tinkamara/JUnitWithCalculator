package ExampleForCodeCoverageStatement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PrintSumTest {
    @ParameterizedTest
    @CsvSource({"1,2","5,-3"})
    void twoNumbersHaveToBePositive(int a, int b){
        PrintSum twoNumbers = new PrintSum(a,b);
        assertEquals("positive",twoNumbers.printTheSum());
    }

    @ParameterizedTest
    @CsvSource({"2,-3","-3,-5"})
    void twoNumbersHaveToBeNegative(int a, int b){
        PrintSum twoNumbers = new PrintSum(a,b);
        assertEquals("negative",twoNumbers.printTheSum());
    }
    /*
    @ParameterizedTest
    @CsvSource({"3,-3","5,-5"})
    void twoNumbersHaveToBeNeutral(int a, int b){
        PrintSum twoNumbers = new PrintSum(a,b);
        assertEquals("The result is neither positive nor negative",twoNumbers.printTheSum());
    }
     */
}