import java.util.Scanner;

public class Calculator {

    public int calculate(String input) {
        String[] inputs = input.split(" ");
        int result = Integer.parseInt(inputs[0]);
        int number = result;

        for (int i = 2; i < inputs.length; i+=2) {
            number = Integer.parseInt(inputs[i]);
            if (inputs[i - 1].equals("+")) {
                result += number;
            } else if (inputs[i - 1].equals("-")) {
                result -= number;
            } else if (inputs[i - 1].equals("*")) {
                result *= number;
            } else if (inputs[i - 1].equals("/")) {
                result /= number;
            }
        }
        return result;
    }

    public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Calculator calculator = new Calculator();
        int result = calculator.calculate(input);
        System.out.println(result);
    }
}
