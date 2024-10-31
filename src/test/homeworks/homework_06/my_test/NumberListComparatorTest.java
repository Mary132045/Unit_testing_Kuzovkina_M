package homeworks.homework_06.my_test;

import main.java.homeworks.homework_06.NumberList;
import main.java.homeworks.homework_06.NumberListComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class NumberListComparatorTest {

    @Test
    public void testCompareAveragesFirstGreater() {
        NumberList list1 = new NumberList(Arrays.asList(1, 2, 3, 4, 5));
        NumberList list2 = new NumberList(Arrays.asList(1, 2, 3));
        assertEquals("Первый список имеет большее среднее значение", NumberListComparator.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAveragesSecondGreater() {
        NumberList list1 = new NumberList(Arrays.asList(1, 2, 3));
        NumberList list2 = new NumberList(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals("Второй список имеет большее среднее значение", NumberListComparator.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAveragesEqual() {
        NumberList list1 = new NumberList(Arrays.asList(2, 3, 4));
        NumberList list2 = new NumberList(Arrays.asList(1, 5));
        assertEquals("Средние значения списков равны", NumberListComparator.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAveragesWithEmptyLists() {
        NumberList list1 = new NumberList(Arrays.asList(1, 2, 3));
        NumberList list2 = new NumberList(Arrays.asList(1, 2, 3));
        assertEquals("Средние значения списков равны", NumberListComparator.compareAverages(list1, list2));
    }
}
