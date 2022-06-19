import baseball.BaseballGame;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BaseballGameTest {

    private String answer;
    private String[] answerArray;
    private BaseballGame baseballGame = new BaseballGame();

    @BeforeEach
    void setUp() {
        answer = "713";
        answerArray = answer.split("");
    }

    @Test
    void whenInputMatchOneNumWithRightPosition() {
        String input = "216";
        String[] inputArray = input.split("");
        BaseballGame.Count count = baseballGame.play(inputArray, answerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(1);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(0);
    }

    @Test
    void whenInputMatchOneNumWithWrongPosition() {
        String input = "145";
        String[] inputArray = input.split("");
        BaseballGame.Count count = baseballGame.play(inputArray, answerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(0);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(1);
    }

    @Test
    void whenInputMatchOneNumWithRightAndOneNumWithWrong() {
        String input = "123";
        String[] inputArray = input.split("");
        BaseballGame.Count count = baseballGame.play(inputArray, answerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(1);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(1);
    }

    @Test
    void whenInputNotMatchAnyNum() {
        String input = "249";
        String[] inputArray = input.split("");
        BaseballGame.Count count = baseballGame.play(inputArray, answerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(0);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(0);
    }

    @Test
    void createAnswer() {
        Assertions.assertThat(baseballGame.getAnswer()).isNotEmpty();
    }
}
