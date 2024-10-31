package main.java.seminars.seminar_04.database;

import java.util.List;

public class Main {

    /*
        4.6. Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
        Условие: У вас есть класс Database с методом public List<String> query(String sql),
        который выполняет SQL-запрос и возвращает результат.
        Вам необходимо проверить правильность работы класса DataProcessor, который использует
        Database для выполнения запроса и обработки результатов.

     */
    public static void main(String[] args) {
        // Создаём экземпляр класса Database
        Database database = new Database();

        // Создаём экземпляр класса DataProcessor, передавая в конструктор database
        DataProcessor dataProcessor = new DataProcessor(database);

        // Вызываем метод processData и выводим результаты
        List<String> data = dataProcessor.processData("SELECT * FROM table");
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
