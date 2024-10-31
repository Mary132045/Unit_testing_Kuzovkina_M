package main.java.seminars.seminar_05.number;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public int[] generateRandomNumbers(int arraySize) {
        Random random = new Random();
        int[] randomNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randomNumbers[i] = random.nextInt();
        }
        return randomNumbers;
    }

}
