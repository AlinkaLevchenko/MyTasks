package MyHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestEatstreet extends Testinit {

    @Test
    public void eatstreet(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElements(By.xpath("//ul/li[@class='top-cities__item ng-scope']")).get(16).click();
        sleep(3);
        driver.findElement(By.xpath("//div[@class = 'cuisine-types__item__body']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@class = 'btn btn--orange']")).click();
        driver.findElements(By.xpath("//div[@class = 'information']")).get(2).click();
        sleep(3);
        driver.findElements(By.xpath("//div[@class = 'is-clickable product-container']")).get(1).click();
        sleep(4);
        driver.findElement(By.xpath("//button[@id = 'quantity--adds']")).click();
        driver.findElement(By.xpath("//a[@id = 'confirm-options']")).click();
        sleep(2);
        driver.findElement(By.xpath("//select/option[@label='2 Eggs ($7.07)']")).click();
        driver.findElement(By.xpath("//a[@id='confirm-options']")).click();
        sleep(4);


        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='navbar__cart-count ng-binding ng-scope']")).isDisplayed());
    }

}
