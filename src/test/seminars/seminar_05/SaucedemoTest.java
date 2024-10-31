package seminars.seminar_05;

/*
Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на сайте
https://www.saucedemo.com
Данные для входа - логин: "standard_user", пароль: "secret_sauce".
Проверить, что авторизация прошла успешно и отображаются товары.
Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода данных в поля формы, и
submit() для отправки формы. После этого, проверьте, что на странице отображаются продукты
(productsLabel.getText() = "Products").
 */

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaucedemoTest {

    @Test
    public void testSaucedemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        Thread.sleep(1000);
        loginButton.click();

        Thread.sleep(5000);

        WebElement productsLabel = driver.findElement(By.className("title"));
        assertEquals("Products", productsLabel.getText());

        driver.quit();
    }
}
