package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewClassAL1 extends TestinitOne {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();


    }
    @Test
    public void runGoogle(){
        goToGoogle();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Kitten\n");
        driver.findElement(By.xpath("\"//input[@name=\\\"q\\\"]\""));
        driver.quit();


    }

    public void goToGoogle() {
        driver.get("https://www.google.com/");


    }

    @Test
public void clickenterBtn(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.findElements(By.xpath("//input[@ class=\"RNmpXc\"]")).get(1).click();
}
}
