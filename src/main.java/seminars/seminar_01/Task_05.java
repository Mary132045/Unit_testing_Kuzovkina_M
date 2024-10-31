package main.java.seminars.seminar_01;

import java.util.ArrayList;

public class Task_05 {
    public static void main(String[] args) {
//        checkingShoppingCart();
        correctedCheckingShoppingCart();
    }

    public static void checkingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");
        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");
        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.get(0));
            } else if (product.equals("tomato")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            } else {
                assert false : "Unknown category for the product " + product;
            }
        }
    }

    public static void correctedCheckingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");

        productCategories.add("drinks"); // добавляем новую категорию

        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");
        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.get(0));
            } else if (product.equals("tomato")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            }

            else if (product.equals("water")) { // добавляем условие для воды
                System.out.println("category: " + productCategories.get(3));
            }

            else {
                assert false : "Unknown category for the product " + product;
            }
        }
    }
}
