package seminars.seminar_03;

import main.java.seminars.seminar_03.SomeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SomeServiceTest {

    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }


    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    void multipleThreeNotFiveReturnsFizz(int n) {
        Assertions.assertEquals("Fizz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 55})
    void multipleFiveNotThreeReturnsBuzz(int n) {
        Assertions.assertEquals("Buzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 225, 3375})
    void multipleThreeAndFiveReturnsFizzBuzz(int n) {
        Assertions.assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 41, 43})
    void notMultipleOfThreeOfFieReturnsNumber(int n) {
        Assertions.assertEquals(Integer.toString(n), someService.fizzBuzz(n));
    }


    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в
     * начале ни в конце массива
     */

    @Test
    void first6arrayShouldReturnTrue() {
        Assertions.assertTrue(someService.firstLast6(new int[]{6, 3, 5, 3}));
    }

    @Test
    void last6arrayShouldReturnTrue() {
        Assertions.assertTrue(someService.firstLast6(new int[]{2, 345, 6}));
    }

    @Test
    void noLast6arrayShouldReturnFalse() {
        Assertions.assertFalse(someService.firstLast6(new int[]{2, 345, 2}));
    }


    /**
     * 3.3. Метод подсчета скидки
     */

    @Test
    void insufficientCoverageTest() {
        System.out.println(this.someService.calculatingDiscount(2000.0, 10));
        assertThat(this.someService.calculatingDiscount(2000.0, 50)).isEqualTo(1000.0);
        assertThat(this.someService.calculatingDiscount(2000.0, 100)).isEqualTo(0.0);
        assertThat(this.someService.calculatingDiscount(2000.0, 0)).isEqualTo(2000.0);

        assertThatThrownBy(() -> {
            someService.calculatingDiscount(2000.0, 110);
        }).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // скидка больше 100%

        assertThatThrownBy(() -> {
            someService.calculatingDiscount(2000.0, -10);
        }).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // скидка меньше 100%

        assertThatThrownBy(() -> {
            someService.calculatingDiscount(-2000.0, 10);
        }).isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void calculatingCorrectDiscount() {
        // Тесты на корректность результата
        // Ожидаемый результат: Метод возвращает верную сумму с учётом скидки
        org.assertj.core.api.Assertions.assertThat(someService.calculatingDiscount(1000.0, 25)).isEqualTo(750.0);
        org.assertj.core.api.Assertions.assertThat(someService.calculatingDiscount(1000.0, 100)).isEqualTo(0.0);
        org.assertj.core.api.Assertions.assertThat(someService.calculatingDiscount(1000.0, 0)).isEqualTo(1000.0);
    }

    @Test
    void negativePurchaseAmountReturnException() {
        // Отрицательные числа (сумма покупки)
        // Ожидаемый результат: Метод выбрасывает исключение ArithmeticException -> "Сумма покупки не может быть отрицательной"
        assertThatThrownBy(() -> {
            someService.calculatingDiscount(-1000.0, 50);
        }).isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void negativePurchaseDiscountReturnException() {
        // Отрицательные числа (сумма скидки)
        // Ожидаемый результат: Метод выбрасывает исключение ArithmeticException -> "Скидка должна быть в диапазоне от 0 до 100%"
        assertThatThrownBy(() -> {
            someService.calculatingDiscount(1000.0, -10);
        }).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void discountMore100ReturnException() {
        // Процент скидки > 100
        // Ожидаемый результат: Метод выбрасывает исключение ArithmeticException -> "Скидка должна быть в диапазоне от 0 до 100%"
        assertThatThrownBy(() -> {
            someService.calculatingDiscount(1000.0, 101);
        }).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */
    @Test
    void luckySumReturnSumWithout13() {
        assertThat(SomeService.luckySum(2, 3, 13)).isEqualTo(5);
        assertThat(SomeService.luckySum(2, 13, 9)).isEqualTo(11);
        assertThat(SomeService.luckySum(13, 9, 9)).isEqualTo(18);
        assertThat(SomeService.luckySum(9, 9, 9)).isEqualTo(27);
        assertThat(SomeService.luckySum(13, 13, 13)).isEqualTo(0);
    }


    /**
     * 3.5. Примените подход TDD для создания нового класса MoodAnalyser, который оценивает настроение выраженное во фразах.
     */








}
