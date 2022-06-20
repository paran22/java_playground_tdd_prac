package baseball;

import java.util.Scanner;

public class ResultView {

    public Boolean printResult(BallCount ballCount) {
        int strikeCnt = ballCount.getStrikeCnt();
        int ballCnt = ballCount.getBallCnt();

        if (strikeCnt == 0) {
            return resultOnlyWithBallCnt(ballCnt);
        }
        if (ballCnt == 0) {
            return resultOnlyWithStrikeCnt(strikeCnt);
        }

        if (strikeCnt == 3) {
            return resultWhenAllMatch();
        }

        return resultBallAndStrike(ballCnt, strikeCnt);

    }

    private Boolean resultBallAndStrike(int ballCnt, int strikeCnt) {
        System.out.println(ballCnt + "볼 " + strikeCnt + "스트라이크");
        return false;
    }

    private Boolean resultWhenAllMatch() {
        System.out.println("3스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return true;
    }

    private Boolean resultOnlyWithStrikeCnt(int strikeCnt) {
        System.out.println(strikeCnt + "스트라이크");
        return false;
    }

    private Boolean resultOnlyWithBallCnt(int ballCnt) {
        System.out.println(ballCnt + "볼");
        return false;
    }

    public void chooseEndOrRestart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = scanner.nextLine();

        if (input.equals("2")) {
            return;
        }

        BaseballGame baseballGame = new BaseballGame();
        baseballGame.startGame();
    }
}
