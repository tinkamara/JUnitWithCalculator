package ExampleForCodeCoverageStatement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ForLogicalMissTest {
    
    @ParameterizedTest
    @CsvSource({"5,4"})
    void allTestcasesForOneHundredPositive(int a , int b){
        Assertions.assertEquals("This is a positive result",ForLogicalMiss.allTestCasesForOneHundred(a,b));
    }
    @ParameterizedTest
    @CsvSource({"-5,+5","-5,4"})
    void allTestcasesForOneHundredNeagtive(int a , int b){
        Assertions.assertEquals("This is a negative result",ForLogicalMiss.allTestCasesForOneHundred(a,b));
    }
    /*
    Ist 0 negativ <- Logischer Fehler
     */

}