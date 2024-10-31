package homeworks.homework_01;

import main.java.homeworks.homework_01.Task_02.Product;
import main.java.homeworks.homework_01.Task_02.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

class ShopTest {
    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addProduct(new Product("Первый", 10.0));
        shop.addProduct(new Product("Второй", 20.0));
        shop.addProduct(new Product("Третий", 15.0));
    }

    @Test
    public void shouldStoreCorrectNumberOfProducts() {
        List<Product> products = shop.getProducts();
        assertThat(products).hasSize(3);
    }

    @Test
    public void shouldStoreCorrectProducts() {
        List<Product> products = shop.getProducts();
        assertThat(products).extracting(Product::getName).containsExactly("Первый", "Второй", "Третий");
    }

    @Test
    public void shouldReturnMostExpensiveProduct() {
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertThat(mostExpensiveProduct).isNotNull();
        assertThat(mostExpensiveProduct.getName()).isEqualTo("Второй");
        assertThat(mostExpensiveProduct.getPrice()).isEqualTo(20.0);
    }

    @Test
    public void shouldSortProductsByPrice() {
        shop.sortProductsByPrice();
        List<Product> products = shop.getProducts();
        assertThat(products).extracting(Product::getName).containsExactly("Первый", "Третий", "Второй");
        assertThat(products).extracting(Product::getPrice).containsExactly(10.0, 15.0, 20.0);
    }
}
