package baseball;

public class Main {

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        InputView inputView = new InputView(baseballGame.getNUMBER_OF_DIGITS());
        ResultView resultView = new ResultView();

        String[] answer = baseballGame.getAnswer();
        String[] input = inputView.getInput();

        BallCount ballCount = baseballGame.getBallCount(input, answer);
        Boolean result = resultView.printResult(ballCount);
        while (!result) {
            input = inputView.getInput();
            ballCount = baseballGame.getBallCount(input, answer);
            result = resultView.printResult(ballCount);
        }
        resultView.chooseEndOrRestart();

    }
}
