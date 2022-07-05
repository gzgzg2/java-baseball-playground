package study.baseball;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseBallGameInput {
    private final Integer inValue;

    public BaseBallGameInput(Integer inValue) {
        this.inValue = inValue;
    }

    public List<Integer> mapNumbers() {
        return Stream.of(String.valueOf(inValue).split(""))
                     .mapToInt(Integer::parseInt)
                     .boxed()
                     .collect(Collectors.toList());
    }
}
