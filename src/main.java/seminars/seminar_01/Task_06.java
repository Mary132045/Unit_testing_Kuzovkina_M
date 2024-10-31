package main.java.seminars.seminar_01;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task_06 {
    public static void main(String[] args) {
        expectedValue();
        correctedExpectedValue();
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static void expectedValue() {
        assertThat(5).isEqualTo(sum(2, 3));
    }

    public static void correctedExpectedValue() {
        assertThat(sum(2, 3)).isEqualTo(5);
    }
}
