package main.java.seminars.seminar_03.homework_from_lecture;

import java.util.Scanner;

public class Calculator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println("Результат операции: " + result);


        // TODO домашнее задание с лекции

        // Проверка максимального и минимального значения, которое может хранить тип int
        assert Integer.MAX_VALUE == Calculator.calculation(Integer.MAX_VALUE - 1, 1, '+');
        assert Integer.MIN_VALUE == Calculator.calculation(Integer.MIN_VALUE + 1, -1, '+');

        // Проверка переполнения
        try {
            Calculator.calculation(Integer.MAX_VALUE, 1, '+');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (ArithmeticException e) {
            assert true; // Мы ожидаем исключение ArithmeticException при переполнении
        }
        try {
            Calculator.calculation(Integer.MIN_VALUE, -1, '+');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (ArithmeticException e) {
            assert true; // Мы ожидаем исключение ArithmeticException при переполнении
        }

        // Проверка деления на ноль
        try {
            Calculator.calculation(1, 0, '/');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (ArithmeticException e) {
            assert true; // Мы ожидаем исключение ArithmeticException при делении на ноль
        }

        // Проверка неправильного оператора
        try {
            Calculator.calculation(1, 1, 'a');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (IllegalStateException e) {
            assert true; // Мы ожидаем исключение IllegalStateException при использовании неправильного оператора
        }
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

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double computeLengthCircle(int r) {
        return 2 * Math.PI * r;
    }
}
