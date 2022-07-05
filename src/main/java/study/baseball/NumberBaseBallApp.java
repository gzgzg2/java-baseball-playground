package study.baseball;

import java.util.Scanner;

public class NumberBaseBallApp {

    private Boolean run;
    private Scanner scanner;
    
    public NumberBaseBallApp(Boolean run, Scanner scanner) {
        this.run = run;
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        NumberBaseBallApp app = new NumberBaseBallApp(true, new Scanner(System.in));
        BaseBallGameOutput output = new BaseBallGameOutput();
        Balls computerBalls = app.makeComputerBalls();
        while(app.isRun()) {
            output.startPrint();
            BaseBallGameInput input = new BaseBallGameInput(app.scanner.nextInt());
            Score score = computerBalls.play(input.mapNumbers());
            output.scorePrint(score);
            if(score.isGameOver()) {
                output.retryPrint();
                int retryValue = app.scanner.nextInt();
                app.changeRunState(retryValue);
                computerBalls = app.makeComputerBalls();
            }
        }
    }

    private Balls makeComputerBalls() {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.setUpRandomNumbers();
        return new Balls(randomNumbers.randomNumbers());
    }

    private boolean isRun() {
        return run;
    }

    private void changeRunState(Integer value) {
        if(value == 2) {
            run = false;
        }
    }


}
