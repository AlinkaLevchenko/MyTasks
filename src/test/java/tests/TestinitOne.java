package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;


public class TestinitOne {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }


    //@AfterMethod
    //public void afterMethod() {
    // driver.quit();
    //  }

    public void sleep(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToGoogle() {
        driver.get("https://www.google.com/");
    }


    public List<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public WebDriver switchTabs(String tab) {
        return driver.switchTo().window(tab);
    }
}

//public void search(String googleWord, String searchUrl) {
    //driver.get(searchUrl);
   // driver.findElement(By.xpath("")).sendKeys(googleWord + "\n");
 // }

//}

//public void waitTillElementContainsText(String locator, String text){
   // WebDriverWait wait = new WebDriverWait(driver,)
 // }
//}
