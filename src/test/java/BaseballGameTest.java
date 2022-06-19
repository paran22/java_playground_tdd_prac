import baseball.BaseballGame;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BaseballGameTest {

    private String answer;
    private BaseballGame baseballGame = new BaseballGame();

    @BeforeEach
    void setUp() {
        answer = "145";
    }

    @Test
    void whenInputMatchOneNumWithRightPosition() {
        String input = "145";
        String[] inputArray = input.split("");
        String[] answerArray = answer.split("");
        BaseballGame.Count count = baseballGame.play(inputArray, answerArray);
        System.out.println(count.getStrikeCnt() + "/" + count.getBallCnt());
    }

    @Test
    void whenInputMatchOneNumWithWrongPosition() {

    }

    @Test
    void whenInputNotMatchAnyNum() {

    }
}
