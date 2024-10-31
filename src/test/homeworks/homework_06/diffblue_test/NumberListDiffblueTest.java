package homeworks.homework_06.diffblue_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import main.java.homeworks.homework_06.NumberList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NumberListDiffblueTest {
    /**
     * Method under test: {@link NumberList#getAverage()}
     */
    @Test
    void testGetAverage() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);

        // Act and Assert
        assertEquals(2.0d, (new NumberList(numbers)).getAverage());
    }

    /**
     * Method under test: {@link NumberList#getNumbers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNumbers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   main.java.homeworks.homework_06.NumberList.getNumbers().
        //   The arrange section threw
        //   java.lang.IllegalArgumentException: Список не должен быть пустым
        //       at main.java.homeworks.homework_06.NumberList.<init>(NumberList.java:13)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        NumberList numberList = null;

        // Act
        List<Integer> actualNumbers = numberList.getNumbers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NumberList#NumberList(List)}
     */
    @Test
    void testNewNumberList() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new NumberList(new ArrayList<>()));
        assertThrows(IllegalArgumentException.class, () -> new NumberList(null));
    }

    /**
     * Method under test: {@link NumberList#NumberList(List)}
     */
    @Test
    void testNewNumberList2() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        // Act
        NumberList actualNumberList = new NumberList(numbers);

        // Assert
        List<Integer> numbers2 = actualNumberList.getNumbers();
        assertEquals(1, numbers2.size());
        assertEquals(10, numbers2.get(0).intValue());
        assertEquals(10.0d, actualNumberList.getAverage());
        assertSame(numbers, numbers2);
    }

    /**
     * Method under test: {@link NumberList#NumberList(List)}
     */
    @Test
    void testNewNumberList3() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new NumberList(numbers));
    }

    /**
     * Method under test: {@link NumberList#NumberList(List)}
     */
    @Test
    void testNewNumberList4() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        // Act
        NumberList actualNumberList = new NumberList(numbers);

        // Assert
        assertEquals(1.5d, actualNumberList.getAverage());
        assertSame(numbers, actualNumberList.getNumbers());
    }
}
