package seminars.seminar_05;


/*
Напишите автоматизированный тест, который выполнит следующие шаги:
1. Открывает главную страницу Google.
2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
3. В результатах поиска ищет ссылку на официальный сайт Selenium (https://www.selenium.dev) и проверяет, что ссылка
действительно присутствует среди результатов поиска.
*/

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(2000);

        List<WebElement> searchResults = driver.findElements(By.cssSelector("div"));

        boolean isFound = false;
        for (WebElement webElement : searchResults) {
            System.out.println(webElement.getText());
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        assertTrue(isFound);
        driver.quit();
    }
}
