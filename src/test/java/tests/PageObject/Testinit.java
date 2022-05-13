package tests.PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class Testinit {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//   @AfterMethod
//   public void aftermetod() {
//        driver.quit();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openSite(String site) {
        driver.get(site);
    }
    public void switchTabs(String tab) {
        driver.switchTo().window(tab);
    }
    public List<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }
}
