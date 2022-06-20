package baseball;

public class Main {

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        InputView inputView = new InputView(baseballGame.getNUMBER_OF_DIGITS());
        ResultView resultView = new ResultView();

        String[] answer = baseballGame.getAnswer();
        String[] input = inputView.getInput();

        Count count = baseballGame.play(input, answer);
        Boolean result = resultView.printResult(count);
        while (!result) {
            input = inputView.getInput();
            count = baseballGame.play(input, answer);
            result = resultView.printResult(count);
        }
        resultView.chooseEndOrRestart();

    }
}
