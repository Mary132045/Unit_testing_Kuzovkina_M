package main.java.lessons.lesson_01;

public class Calculator {

    public static void main(String[] args) {
        System.out.printf("Результат операции: %s\n", calculation(2, 2, '+'));
        System.out.printf("Результат операции: %s\n", calculation(4, 2, '-'));
        System.out.printf("Результат операции: %s\n", calculation(8, 2, '/'));
        System.out.printf("Результат операции: %s\n", calculation(3, 2, '*'));
        System.out.println("_______________________________________________________________________________");

        System.out.printf("Результат операции: %s\n", calculation(8, 2, '_'));
//        System.out.printf("Результат операции: %s\n", calculation(8, 0, '/'));
//        System.out.printf("Результат операции: %s\n", calculation(12345678910, 0, '+'));
        System.out.printf("Результат операции: %s\n", calculation(1234567891, 10, '*'));
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
}
