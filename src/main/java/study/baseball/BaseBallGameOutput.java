package study.baseball;

public class BaseBallGameOutput {

    private static final String startMessage = "숫자를 입력해 주세요 : ";
    private static final String retryMessage = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";

    public void startPrint() {
        System.out.println(startMessage);
    }

    public void retryPrint() {
        System.out.println(retryMessage);
    }

    public void scorePrint(Score score) {
        System.out.println(score.toString());
    }


}
