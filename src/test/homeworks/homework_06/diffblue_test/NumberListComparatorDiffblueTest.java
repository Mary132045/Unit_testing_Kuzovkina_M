package homeworks.homework_06.diffblue_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import main.java.homeworks.homework_06.NumberList;
import main.java.homeworks.homework_06.NumberListComparator;
import org.junit.jupiter.api.Test;

class NumberListComparatorDiffblueTest {
    /**
     * Method under test:
     * {@link NumberListComparator#compareAverages(NumberList, NumberList)}
     */
    @Test
    void testCompareAverages() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        NumberList list1 = new NumberList(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(2);

        // Act and Assert
        assertEquals("Средние значения списков равны",
                NumberListComparator.compareAverages(list1, new NumberList(numbers2)));
    }

    /**
     * Method under test:
     * {@link NumberListComparator#compareAverages(NumberList, NumberList)}
     */
    @Test
    void testCompareAverages2() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        NumberList list1 = new NumberList(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);

        // Act and Assert
        assertEquals("Первый список имеет большее среднее значение",
                NumberListComparator.compareAverages(list1, new NumberList(numbers2)));
    }

    /**
     * Method under test:
     * {@link NumberListComparator#compareAverages(NumberList, NumberList)}
     */
    @Test
    void testCompareAverages3() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        NumberList list1 = new NumberList(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(2);

        // Act and Assert
        assertEquals("Второй список имеет большее среднее значение",
                NumberListComparator.compareAverages(list1, new NumberList(numbers2)));
    }
}
