package main.java.homeworks.homework_06;

import java.util.List;

public class NumberList {
    private List<Integer> numbers;

    public NumberList(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Список не должен быть null");
        }
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        for (Object obj : numbers) {
            if (!(obj instanceof Integer)) {
                throw new IllegalArgumentException("Список должен содержать только целые числа");
            }
        }
        this.numbers = numbers;
    }

    public double getAverage() {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
