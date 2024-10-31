package main.java.seminars.seminar_04.hotel;

public class Main {

    /*
    4.4.
    Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
    Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId), который обычно проверяет, доступен ли номер в отеле.
    Вам необходимо проверить правильность работы класса BookingService, который использует HotelService для бронирования номера, если он доступен.
     */

    public static void main(String[] args) {

        // Создание реального экземпляра HotelService
        HotelService realHotelService = new HotelService();

        // Создание экземпляра BookingService с реальным HotelService
        BookingService bookingService = new BookingService(realHotelService);

        // Пытаемся забронировать доступный номер (например, номер 2)
        if (bookingService.bookRoom(2)) {
            System.out.println("Успешно забронирован номер 2!");
        } else {
            System.out.println("Не удалось забронировать номер 2.");
        }

        // Пытаемся забронировать недоступный номер (например, номер 3)
        if (bookingService.bookRoom(3)) {
            System.out.println("Успешно забронирован номер 3!");
        } else {
            System.out.println("Не удалось забронировать номер 3.");
        }
    }
}
