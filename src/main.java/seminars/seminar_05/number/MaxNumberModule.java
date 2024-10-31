package main.java.seminars.seminar_05.number;

import java.util.List;

public class MaxNumberModule {

    public int findMaxNumber(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

}
