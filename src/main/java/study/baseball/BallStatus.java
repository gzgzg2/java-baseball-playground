package study.baseball;

public enum BallStatus {
    BALL, STRIKE, NOTHING;

    public boolean isBall() {
        return this == BALL;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isNotNothing() {
        return this != NOTHING;
    }
}
