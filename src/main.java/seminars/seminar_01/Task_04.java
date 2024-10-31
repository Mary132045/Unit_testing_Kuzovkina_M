package main.java.seminars.seminar_01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task_04 {
    public static void main(String[] args) {
        happyNY();
        correctedHappyNY();
    }

    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime());
        assert currentDateTime.equals("01/01/2025 00:00:00") : "Еще 2024 год :(";
        System.out.println("С новым годом!");
    }

    public static void correctedHappyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateTime = dateFormat.format(calendar.getTime());
        assert currentDateTime.equals("01/01/2025") : "Еще 2024 год :(";
        if (currentDateTime.equals("01/01/2025")) {
            System.out.println("С новым годом!");
        } else {
            System.out.println("Ещё 2024 год :(");
        }

    }

}
