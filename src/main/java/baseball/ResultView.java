package baseball;

import java.util.Scanner;

public class ResultView {

    public Boolean printResult(BallCount ballCount) {
        int strikeCnt = ballCount.getStrikeCnt();
        int ballCnt = ballCount.getBallCnt();
        if (strikeCnt == 0) {
            System.out.println(ballCnt + "볼");
            return false;
        }
        if (ballCnt == 0) {
            System.out.println(strikeCnt + "스트라이크");
            return false;
        }

        if (strikeCnt == 3) {
            System.out.println(strikeCnt + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }

        System.out.println(ballCnt + "볼 " + strikeCnt + "스트라이크");
        return false;
    }

    public void chooseEndOrRestart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = scanner.nextLine();

        if (input.equals("2")) {
            return;
        }
        restart();
    }

    private void restart() {
        String[] args = new String[]{""};
        Main.main(args);
    }
}
