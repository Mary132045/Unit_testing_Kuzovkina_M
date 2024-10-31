package main.java.seminars.seminar_01;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println(sum(2147483647, 1));
        System.out.println(correctedSum(2147483647, 1));
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int correctedSum(int a, int b) {
        long result = (long) a + b;
        assert (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) : "Integer overflow";
        return (int) result;
    }

}
