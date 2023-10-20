import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTests {

    @Before
    public void setup() {
        System.out.println("This will be called before every method");
    }

    @Test
    public void findmax() {
        var result = Calculator.findMax(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, Calculator.findMax(new int[]{1, 4, 3, -7, 2}));
        assertEquals(5, result);
    }

    @Test
    public void playFizzBuzz_whenArgumentIs3_ReturnFizz() {
        var calculator = new Calculator();
        var result = calculator.playFizzBuzz(3);
        assertEquals("Should return Fizz", "Fizz", result);
    }

    @Test
    @Ignore
    public void playFizzBuzz_whenArgumentIs5_ReturnBuzz() {
        var calculator = new Calculator();
        var result = calculator.playFizzBuzz(5);
        assertEquals("Should return Buzz", "Buzz", result);
    }


}
