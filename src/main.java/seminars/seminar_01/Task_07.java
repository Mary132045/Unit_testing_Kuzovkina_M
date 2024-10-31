package main.java.seminars.seminar_01;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task_07 {
    public static void main(String[] args) {
        String[] colors = {"aqua", "orange", "green", "violet", "yellow", "blue", "gold"};
        testingJavaCollectionsAssertJ(colors);
    }

    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()                               // Массив не должен быть пустым
                .hasSize(7)                         // Размер массива должен быть равен 7
                .doesNotHaveDuplicates()                    // Массив не должен содержать повторяющихся элементов
                .contains("orange", "green", "violet")      // Массив должен содержать следующие элементы
                .endsWith("gold")                       // Последним элементом массива должен быть следующий элемент "..."
                .startsWith("aqua")                         // Первым элементом массива должен быть следующий элемент "..."
                .containsSequence("yellow", "blue")         // В массиве должна соблюдаться такая последовательность элементов
                .doesNotContain("red", "black");    // Массив не должен содержать следующих элементов
    }


}
