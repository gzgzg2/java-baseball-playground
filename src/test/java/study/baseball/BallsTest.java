package study.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
class BallsTest {

    private Balls computerBalls;

    @BeforeEach
    void setUp() {
        computerBalls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    @DisplayName("게임종료 실패 테스트")
    void isNotGameOver() {
        Score score = computerBalls.play(Arrays.asList(1, 2, 7));
        assertThat(score.isGameOver()).isFalse();
    }

    @Test
    @DisplayName("게임종료 테스트")
    void isGameOver() {
        Score score = computerBalls.play(Arrays.asList(1, 2, 3));
        assertThat(score.strike()).isEqualTo(3);
        assertThat(score.isGameOver()).isTrue();
    }

    @Test
    @DisplayName("3스트라이크")
    void allStrike() {
        Score score = computerBalls.play(Arrays.asList(1, 2, 3));
        assertThat(score.strike()).isEqualTo(3);
    }

    @Test
    @DisplayName("2볼 1스트라이크")
    void twoBall_oneStrike() {
        Score score = computerBalls.play(Arrays.asList(1, 3, 2));
        assertThat(score.strike()).isEqualTo(1);
        assertThat(score.ball()).isEqualTo(2);
    }

    @Test
    @DisplayName("1볼 1스트라이크")
    void oneBall_oneStrike() {
        Score score = computerBalls.play(Arrays.asList(1, 4, 2));
        assertThat(score.strike()).isEqualTo(1);
        assertThat(score.ball()).isEqualTo(1);

    }

    @Test
    @DisplayName("낫싱 테스트")
    void nothing() {
        assertThat(computerBalls.play(new Ball(2 ,5))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    @DisplayName("볼 테스트")
    void ball() {
        assertThat(computerBalls.play(new Ball(2 ,1))).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("스트라이크 테스트")
    void strike() {
        assertThat(computerBalls.play(new Ball(2 ,2))).isEqualTo(BallStatus.STRIKE);
    }

}
