package seminars.seminar_04.database;


import main.java.seminars.seminar_04.database.DataProcessor;
import main.java.seminars.seminar_04.database.Database;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {

    @Test
    public void testProcessData() {

        // Создаём мок для Database
        Database database = mock(Database.class);

        // Настраиваем поведение мока
        when(database.query(anyString())).thenReturn(Arrays.asList("First", "Second", "Third"));

        // Создаём объект класса, который хотим протестировать, передавая мок в качестве зависимости
        DataProcessor dataProcessor = new DataProcessor(database);

        // Вызываем метод, который хотим протестировать
        List<String> resultSize = dataProcessor.processData("SELECT * FROM table");

        // Проверяем результат
        assertEquals(3, resultSize.size());
    }
}