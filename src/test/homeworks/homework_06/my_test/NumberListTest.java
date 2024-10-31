package homeworks.homework_06.my_test;

import main.java.homeworks.homework_06.NumberList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberListTest {

    @Test
    public void testConstructorValidList() {
        NumberList numberList = new NumberList(Arrays.asList(1, 2, 3, 4, 5));
        assertNotNull(numberList.getNumbers());
        assertEquals(5, numberList.getNumbers().size());
        assertEquals(3.0, numberList.getAverage());
    }

    @Test
    public void testConstructorEmptyList() {
        try {
            new NumberList(Collections.emptyList());
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Список не должен быть пустым", e.getMessage());
        }
    }

    @Test
    public void testConstructorNullList() {
        try {
            new NumberList(null);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Список не должен быть null", e.getMessage());
        }
    }

    @Test
    public void testConstructorWithNonInteger() {
        List<Object> numbers = Arrays.asList(1, 2, "three");
        try {
            new NumberList((List<Integer>) (List<?>) numbers);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Список должен содержать только целые числа", e.getMessage());
        }
    }

    @Test
    public void testGetAverage() {
        NumberList numberList = new NumberList(Arrays.asList(1, 2, 3));
        assertEquals(2.0, numberList.getAverage());
    }

    @Test
    public void testGetAverageWithSingleElement() {
        NumberList numberList = new NumberList(Arrays.asList(7));
        assertEquals(7.0, numberList.getAverage());
    }
}
