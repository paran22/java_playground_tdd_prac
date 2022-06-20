package baseball;

public class BallCount {
    private int strikeCnt;
    private int ballCnt;

    public BallCount() {
        this.strikeCnt = 0;
        this.ballCnt = 0;
    }

    public BallCount(int strikeCnt, int ballCnt) {
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