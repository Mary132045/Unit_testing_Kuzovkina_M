package main.java.homeworks.homework_06;

public class NumberListComparator {
    public static String compareAverages(NumberList list1, NumberList list2) {
        double avg1 = list1.getAverage();
        double avg2 = list2.getAverage();

        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg2 > avg1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения списков равны";
        }
    }
}
