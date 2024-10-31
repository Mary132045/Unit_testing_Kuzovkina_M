package main.java.lessons.lesson_02;

import java.util.Scanner;

public class Calculator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println("Результат операции: " + result);
    }

    public static char getOperator() {
        System.out.println("Введите операцию: ");
        char operation = SCANNER.next().charAt(0);
        return operation;
    }

    public static int getOperandOld() {
        System.out.println("Введите число: ");
        int operand;
        if (SCANNER.hasNextInt()) {
            operand = SCANNER.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз");
            if (SCANNER.hasNext()) {
                SCANNER.next();
                operand = getOperand();
            } else {
                throw new IllegalStateException("Ошибка в вводимых данных");
            }
        }
        return operand;
    }

    public static int getOperand() {
        System.out.println("Введите число: ");
        while (true) {
            if (SCANNER.hasNextInt()) {
                return SCANNER.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз");
                SCANNER.next();
            }
        }
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
