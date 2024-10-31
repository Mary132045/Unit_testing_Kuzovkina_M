package seminars.seminar_04.message;

import main.java.seminars.seminar_04.message.MessageService;
import main.java.seminars.seminar_04.message.NotificationService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {

    @Test
    public void testNotify() {

        // Создаём мок
        MessageService messageService = mock(MessageService.class);

        // Создаём объект класса, который хотим протестировать, передавая мок в качестве зависимости
        NotificationService notificationService = new NotificationService(messageService);

        // Вызываем метод, который хотим протестировать
        notificationService.sendNotification("Привет", "Анна");

        // Проверяем, был ли вызван метод с правильными аргументами
        verify(messageService, times(1)).sendMessage("Привет", "Анна");
    }
}