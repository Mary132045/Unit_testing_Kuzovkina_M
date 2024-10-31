package main.java.homeworks.homework_03.task_02;

public class NumberInInterval {

    // Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true,
    // если попадает и false - если нет.
    // Покрыть тестами метод на 100%

    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
