import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void calculateStartWithPositiveNum() {
        String input = "2 + 3 * 4 / 2";
        int result = calculator.calculate(input);
        Assertions.assertEquals(result, 10);
    }

    @Test
    void calculateStartWithNegativeNum() {
        String input = "-19 + 7 / 4";
        int result = calculator.calculate(input);
        Assertions.assertEquals(result, -3);
    }

    @Test
    void calculateIfInputOnlyOneNum() {
        String input = "3";
        int result = calculator.calculate(input);
        Assertions.assertEquals(result, 3);
    }

}
