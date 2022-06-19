package baseball;

import java.util.Scanner;

public class InputView {
    private String[] inputArray;

    public InputView(int numberOfDigit) {
        this.inputArray = new String[numberOfDigit];
    }

    public String[] getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        String[] inputArray = input.split("");

        return inputArray;
    }

    public String[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(String[] inputArray) {
        this.inputArray = inputArray;
    }
}
