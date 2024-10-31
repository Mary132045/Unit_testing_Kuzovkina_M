package seminars.seminar_01;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeworkFromLecture {

    // Первая часть

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    @Test
    public void testSquareRootPositive() {
        assertEquals(5.0, squareRoot(25), 0.001);
    }

    @Test
    public void testSquareRootZero() {
        assertEquals(0, squareRoot(0), 0.001);
    }

//    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        squareRoot(-5);
    }

    // Вторая часть

    @Test
    public void testDivideByZero() {
        assertEquals(Double.POSITIVE_INFINITY, divide(5.0, 0.0), 0.001);
    }

    private double divide(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    // Третья часть

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");

        // Пример с использованием условий:
        if (list.size() != 3 || !list.contains("abc") || !list.contains("def") || !list.contains("xyz")) {
            System.out.println("Test failed");
        }

        // Пример с использованием assert:
        assert list.size() == 3 : "List size is not 3";
        assert list.contains("abc") : "List does not contain 'abc'";
        assert list.contains("def") : "List does not contain 'def'";
        assert list.contains("xyz") : "List does not contain 'xyz'";

        // Пример с использованием AssertJ:
        assertThat(list).hasSize(3).contains("abc", "def").doesNotContain("xyz");
    }
}
