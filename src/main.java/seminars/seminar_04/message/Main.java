package main.java.seminars.seminar_04.message;

public class Main {

    /*
      4.5. Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
      Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String recipient),
      который отправляет сообщение получателю.
      Вам необходимо проверить правильность работы класса NotificationService,
      который использует MessageService для отправки уведомлений.
    */
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        NotificationService notificationService = new NotificationService(messageService);

        notificationService.sendNotification("Привет!", "Анна");
    }
}
