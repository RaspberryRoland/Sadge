import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.45.58:8080/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        List<WebElement> peace = driver.findElements(By.cssSelector("#box-apps-menu.list-vertical li"));
        for (WebElement peaces: peace){
            peaces.findElement(By.className("name")).click();
        }
        driver.quit();
    }
}
