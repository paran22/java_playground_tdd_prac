package baseball;

public class BallCount {
    private int strikeCnt;
    private int ballCnt;

    public BallCount() {
        this.strikeCnt = 0;
        this.ballCnt = 0;
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

    public int getBallCnt() {
        return ballCnt;
    }

}