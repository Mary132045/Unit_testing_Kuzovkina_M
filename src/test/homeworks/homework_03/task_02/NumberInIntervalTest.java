package homeworks.homework_03.task_02;

import main.java.homeworks.homework_03.task_02.NumberInInterval;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberInIntervalTest {

    @Test
    public void testNumberInIntervalPositiveBoundaryNumber() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(26)).isTrue();
        assertThat(checker.numberInInterval(99)).isTrue();
    }

    @Test
    public void testNumberInIntervalNegativeBoundaryNumber() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(25)).isFalse();
        assertThat(checker.numberInInterval(100)).isFalse();
    }
}
