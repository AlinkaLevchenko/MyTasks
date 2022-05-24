package MyHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckIncoreckSignIn extends Testinit {

    public void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void checkIncorectSignIn() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//a[@id = 'menu-signin']")).click();

        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("alinka12111985@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("123456789");
        sleep(2);
        driver.findElement(By.xpath("// button[@class = 'btn']")).click();
        driver.findElement(By.xpath("//button[@id='signin']")).click();
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath("//div/span[@class='alert text-red ng-scope']")).isDisplayed());
        driver.findElement(By.xpath("//div[@class = 'btn btn-google btn-google--sign-in full-width ng-binding']")).click();



    }
}
