package study.baseball;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    private List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = new ArrayList<>();
    }

    public RandomNumbers(List<Integer> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public void setUpRandomNumbers() {
        SecureRandom secureRandom = new SecureRandom();
        while (randomNumbers.size() < 3) {
            randomNumbers.add(secureRandom.nextInt(9) + 1);
        }
    }

    public List<Integer> randomNumbers() {
        return randomNumbers;
    }
}
