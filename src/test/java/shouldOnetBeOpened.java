
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class shouldOnetBeOpened {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onet.pl/");
        driver.findElement(By.linkText("VOD")).click();
        // WebElement element = driver.findElement(By.linkText("VOD"));
        // element.click();
        driver.findElement(By.id("searchText")).sendKeys("volta");
        //driver.findElement(By.cssSelector("class=close")).click();
        //driver.findElement(By.id("searchText")).clear();

        //driver.quit();
    }

}




