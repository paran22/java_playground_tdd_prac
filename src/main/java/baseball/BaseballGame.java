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

    public int getNUMBER_OF_DIGITS() {
        return NUMBER_OF_DIGITS;
    }

    public int getANSWER_MAX() {
        return ANSWER_MAX;
    }


    public Count play(String[] inputArray, String[] answerArray) {
        Count count = new Count();

        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            if (inputArray[i].equals(answerArray[i])) {
                count.plusStrikeCnt();
                continue;
            }
            for (int j = 0; j < NUMBER_OF_DIGITS; j++) {
                if (answerArray[j].equals(inputArray[i])) {
                    count.plusBallCnt();
                }
            }
        }
        return count;
    }
}
