package baseball;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        String[] inputArray = input.split("");

        BaseballGame baseballGame = new BaseballGame();
//        baseballGame.play(inputArray);
    }
}
