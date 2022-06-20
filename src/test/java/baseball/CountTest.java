package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountTest {

    private String tempAnswer;
    private String[] tempAnswerArray;
    private BaseballGame baseballGame = new BaseballGame();

    @BeforeEach
    void createAnswerForTest() {
        tempAnswer = "713";
        tempAnswerArray = tempAnswer.split("");
        baseballGame.setAnswer(tempAnswerArray);
    }

    @Test
    void whenInputMatchOneNumWithRightPosition() {
        String input = "216";
        String[] inputArray = input.split("");
        Count count = baseballGame.play(inputArray, tempAnswerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(1);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(0);
    }

    @Test
    void whenInputMatchOneNumWithWrongPosition() {
        String input = "145";
        String[] inputArray = input.split("");
        Count count = baseballGame.play(inputArray, tempAnswerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(0);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(1);
    }

    @Test
    void whenInputMatchOneNumWithRightAndOneNumWithWrong() {
        String input = "123";
        String[] inputArray = input.split("");
        Count count = baseballGame.play(inputArray, tempAnswerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(1);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(1);
    }

    @Test
    void whenInputNotMatchAnyNum() {
        String input = "249";
        String[] inputArray = input.split("");
        Count count = baseballGame.play(inputArray, tempAnswerArray);

        Assertions.assertThat(count.getStrikeCnt()).isEqualTo(0);
        Assertions.assertThat(count.getBallCnt()).isEqualTo(0);
    }
}
