package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseballGame {

    private String[] answer;

    private final int NUMBER_OF_DIGITS = 3;
    private final int ANSWER_MAX = 9;

    public BaseballGame() {
        this.answer = createAnswer();
    }

    private String[] createAnswer() {
        List<String> targets = createTargetForAnswer();
        String[] answer = selectAnswerInTargets(targets);
        return answer;
    }

    private String[] selectAnswerInTargets(List<String> targets) {
        Random random = new Random();
        String[] answer = new String[NUMBER_OF_DIGITS];
        for (int i = 0; i < NUMBER_OF_DIGITS
                ; i++) {
            int index = random.nextInt(targets.size() - i);
            answer[i] = targets.get(index);
            targets.remove(index);
        }
        return answer;
    }

    private List<String> createTargetForAnswer() {
        List<String> target = new ArrayList<>();
        for(int i = 0; i < ANSWER_MAX; i++) {
            target.add(String.valueOf(i));
        }
        return target;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }


    public BallCount getBallCount(String[] inputArray, String[] answerArray) {
        BallCount ballCount = new BallCount();

        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            if (inputArray[i].equals(answerArray[i])) {
                ballCount.plusStrikeCnt();
                continue;
            }
            for (int j = 0; j < NUMBER_OF_DIGITS; j++) {
                if (answerArray[j].equals(inputArray[i])) {
                    ballCount.plusBallCnt();
                }
            }
        }
        return ballCount;
    }

    public void startGame() {
        InputView inputView = new InputView(NUMBER_OF_DIGITS);
        ResultView resultView = new ResultView();

        String[] answer = getAnswer();
        String[] input = inputView.getInput();

        BallCount ballCount = getBallCount(input, answer);
        Boolean result = resultView.printResult(ballCount);
        while (!result) {
            input = inputView.getInput();
            ballCount = getBallCount(input, answer);
            result = resultView.printResult(ballCount);
        }
        resultView.chooseEndOrRestart();
    }
}
