package study.baseball;

public class Score {
    public static final int GAME_OVER_COUNT = 3;
    private Integer strike = 0;
    private Integer ball = 0;

    public int strike() {
        return this.strike;
    }

    public int ball() {
        return this.ball;
    }

    public void add(BallStatus ballStatus) {
        if (ballStatus.isStrike()) {
            this.strike += 1;
        }
        if (ballStatus.isBall()) {
            this.ball += 1;
        }
    }

    public boolean isGameOver() {
        return this.strike == GAME_OVER_COUNT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isEmptyStrike() && isEmptyBall()) {
            sb.append("낫싱");
        }
        if (!isEmptyBall()) {
            sb.append(ball).append("볼");
        }
        if (!isEmptyStrike()) {
            sb.append(strike).append("스트라이크");
        }
        return sb.toString();
    }

    private boolean isEmptyStrike() {
        return strike == 0;
    }

    private boolean isEmptyBall() {
        return ball == 0;
    }
}
