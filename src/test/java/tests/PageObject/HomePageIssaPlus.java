package tests.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageIssaPlus extends BasePage {

    public HomePageIssaPlus(WebDriver driver) {
        super(driver);
    }

    public WebElement clothesBtn() {
        return driver.findElement(By.xpath("//*[@id='tab_clothes']"));
    }

    public WebElement odezhdaBluzi() {
        return driver.findElement(By.xpath("//li/a[contains(text(), 'Блузи')]"));
    }

    public List<WebElement> selectWhiteBluza() {
        return driver.findElements(By.xpath("//ul[@class='row thumbs product-list lazyload_container']/li"));
    }

    public WebElement footCloseBtn() {
        return driver.findElement(By.xpath("//div[@class='footclose']"));
    }

    public WebElement btnSizeL() {
        return driver.findElement(By.xpath("//span[@data-m-type='172:220;']"));
    }

    public List<WebElement> selectBtnBuy() {
        return driver.findElements(By.xpath("//input[@type='submit']"));
    }

    public WebElement btnPrimary() {
        return driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
    }

    public WebElement IconFavorCout() {
        return driver.findElement(By.xpath("//span[@id='cart_count']"));
    }
}

