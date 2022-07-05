package study.baseball;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BaseBallGameInputTest {

    @Test
    void 리스트_변환_테스트() {
        //given
        BaseBallGameInput input = new BaseBallGameInput(123);
        //when
        List<Integer> integers = input.mapNumbers();
        //then
        Assertions.assertThat(integers.size()).isEqualTo(3);
    }
}
