package baseball;


import java.util.Random;

public class BaseballGame {

    private String[] answer;

    private final int NUMBER_OF_DIGITS = 3;
    private final int ANSWER_MIN = 1;
    private final int ANSWER_MAX = 9;

    public BaseballGame() {
        this.answer = createAnswer();
    }

    private String[] createAnswer() {
        Random random = new Random();
        String[] answer = new String[NUMBER_OF_DIGITS];
        for (int i = 0; i < 3; i++) {
            answer[i] = String.valueOf(random.nextInt(ANSWER_MAX) + ANSWER_MIN);
        }
        return answer;
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

    public int getANSWER_MIN() {
        return ANSWER_MIN;
    }

    public int getANSWER_MAX() {
        return ANSWER_MAX;
    }

    public static class Count {
        private int strikeCnt;
        private int ballCnt;

        public Count() {
            this.strikeCnt = 0;
            this.ballCnt = 0;
        }

        public Count(int strikeCnt, int ballCnt) {
            this.strikeCnt = strikeCnt;
            this.ballCnt = ballCnt;
        }

        public void plusStrikeCnt() {
            this.strikeCnt += 1;
        }

        public void plusBallCnt() {
            this.ballCnt += 1;
        }

        public int getStrikeCnt() {
            return strikeCnt;
        }

        public void setStrikeCnt(int strikeCnt) {
            this.strikeCnt = strikeCnt;
        }

        public int getBallCnt() {
            return ballCnt;
        }

        public void setBallCnt(int ballCnt) {
            this.ballCnt = ballCnt;
        }
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
