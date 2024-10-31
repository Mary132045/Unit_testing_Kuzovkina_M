package seminars.seminar_04;

import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class MainTest {

    /**
     * 4.0. Проверка работы Mockito
     */
     @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
      @Test
      public void iteratorWillReturnHelloWorld() {

          // Arrange (подготавливаем тестовые данные, создаём Mock-объект и настраиваем его поведение)
          Iterator iteratorMock = mock(Iterator.class);
          when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");

          // Act (выполняем действия, которые хотим протестировать - тут вызов метода next() дважды)
          String result = iteratorMock.next() + " " + iteratorMock.next();

          // Assert (проверяем результат - Mock-объект вернул ожидаемое значение)
          assertEquals("Hello World", result);
      }
}