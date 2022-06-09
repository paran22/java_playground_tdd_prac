package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split_case1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1");
    }

    @Test
    void split_case2() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        String testWord = "(1,2)";
        String actual = testWord.substring(testWord.indexOf("1"), testWord.indexOf("2")+1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String의 charAt()에서 없는 인덱스를 요구했을 때 에러 발생")
    void charAt() {
        String testword = "abc";
        assertThatThrownBy(() -> {
            char wordIndexOne = testword.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
