package seminars.seminar_05.number;

import main.java.seminars.seminar_05.number.MaxNumberModule;
import main.java.seminars.seminar_05.number.RandomNumberModule;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    // RandomNumberGenerator
    @Test
    public void testRandomGeneratorNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        int[] numbers = generator.generateRandomNumbers(10);

        // Проверяем что размер массива, возвращаемого функцией, равен ожидаемому
        assertEquals(10, numbers.length);

    }

    // MaxNumberModule
    @Test
    public void testFindMaxNumber() {
        MaxNumberModule finder = new MaxNumberModule();

        // Создаём тестовый массив
        int[] numbers = {8, 6, 1, 9, 5, 3, 10, 2, 4, 7};

        // Проверяем, что функция находит ожидаемое максимальное число в массиве
        assertEquals(10, finder.findMaxNumber(numbers));
    }

    // IntegrationTest
    @Test
    public void testFindMaxInGeneratedNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        MaxNumberModule finder = new MaxNumberModule();

        // Генерируем массив случайных чисел
        int[] numbers = generator.generateRandomNumbers(10);

        // Находим максимальное число в массиве
        int maxNumber = finder.findMaxNumber(numbers);

        // Сортируем массив, чтобы было легко определить максимальное число
        Arrays.sort(numbers);

        // Проверяем, что найденное максимальное число равно максимальному числу в отсортированном массиве
        assertEquals(numbers[numbers.length-1], maxNumber);
    }
}