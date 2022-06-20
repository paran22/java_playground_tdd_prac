package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    private BaseballGame baseballGame = new BaseballGame();

    @Test
    void createAnswer() {
        Assertions.assertThat(baseballGame.getAnswer()).isNotEmpty();
    }
}
