package tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    public  WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
