package main.java.homeworks.homework_01.Task_02;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product("Первый", 10.0));
        shop.addProduct(new Product("Второй", 20.0));
        shop.addProduct(new Product("Третий", 15.0));

        System.out.println("Самый дорогой продукт: " + shop.getMostExpensiveProduct());

        shop.sortProductsByPrice();
        System.out.println("Товары отсортированы по цене: " + shop.getProducts());
    }
}
