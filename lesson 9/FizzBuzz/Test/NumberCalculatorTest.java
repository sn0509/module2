import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCalculatorTest {
    @Test

    void numberCalculator() {
        int number=15;
        String expected= "FizzBuzz";
        String result = NumberCalculator.numberCalculator(15);

        assertEquals(expected, result);
    }

    @Test

    void numberCalculator1() {
        int number=0;
        String expected= "0";
        assertEquals(expected, number);
    }

    @Test

    void numberCalculator2() {
        int number=6;
        String expected= "Fizz";
        assertEquals(expected, number);
    }

    @Test

    void numberCalculator3() {
        int number=5;
        String expected= "Buzz";
        assertEquals(expected, number);
    }

}