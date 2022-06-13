import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    void calculator() {
        Calculator calculator = new Calculator();
        String input = "2 + 3 * 4 / 2";
        String result = calculator.calculate(input);
        Assertions.assertEquals(result, "10");
    }
}
