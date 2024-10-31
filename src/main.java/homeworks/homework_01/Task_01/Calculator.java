package main.java.homeworks.homework_01.Task_01;

public class Calculator {

    public double calculateDiscount(double purchaseAmount, double discountAmount) throws ArithmeticException {
        double discountedPurchaseAmount;

        if (purchaseAmount < 0 || discountAmount < 0) {
            throw new ArithmeticException("Значение не может быть отрицательным");
        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100%");
        } else {
            discountedPurchaseAmount = purchaseAmount * (1 - discountAmount / 100);
        }

        return discountedPurchaseAmount;
    }
}
