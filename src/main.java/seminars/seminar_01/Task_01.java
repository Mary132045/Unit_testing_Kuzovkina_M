package main.java.seminars.seminar_01;

import static org.assertj.core.api.Assertions.*;

public class Task_01 {
    public static void main(String[] args) {
        assertConditionA();
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
