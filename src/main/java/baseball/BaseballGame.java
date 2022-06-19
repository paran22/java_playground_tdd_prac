package baseball;


public class BaseballGame {

    private final int NUMBER_CNT = 3;

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

        for (int i = 0; i < NUMBER_CNT; i++) {
            if (inputArray[i].equals(answerArray[i])) {
                count.plusStrikeCnt();
                continue;
            }
            for (int j = 0; j < NUMBER_CNT; j++) {
                if (answerArray[j].equals(inputArray[i])) {
                    count.plusBallCnt();
                }
            }
        }
        return count;
    }
}
