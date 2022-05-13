package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TenTestsEatStreet extends TestinitOne {


    @Test
    public void test1FindElementClick() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("New York");
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='restaurants-list_header ng-binding ng-scope']")).isDisplayed());
    }

    @Test
    public void test2FindElemetClick() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
        sleep(4);
        driver.findElements(By.xpath("//button[@class='cuisine-types__item__button ng-binding']")).get(2).click();
        sleep(5);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='restaurants-list_header ng-binding ng-scope']")).isDisplayed());

    }

    @Test
    public void test3FindEatInColorado() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        sleep(5);
        driver.findElements(By.xpath("//a[@class='ng-binding']")).get(12).click();
        sleep(3);
        driver.findElements(By.xpath("//button[@class='cuisine-types__item__button ng-binding']")).get(19).click();
        sleep(4);
        driver.findElement(By.xpath("//div[@class='information']")).click();
        sleep(3);

        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='name ng-binding']")).isDisplayed());
    }

    @Test
    public void test4ApplyBeforeRegistration() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        sleep(3);
        driver.findElements(By.xpath("//a[@href='/driver-careers']")).get(0).click();
        sleep(3);
        driver.findElement(By.xpath("//select[@onchange='location = this.value;']")).click();
        sleep(2);
        driver.findElement(By.xpath("//*[@value='/careers/delivery-driver-dekalb']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-action']")).click();
        sleep(3);

        switchTabs(getTabs().get(1));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("fountain.com/"));

    }


    @Test
    public void test5GetTheApp() {

        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElements(By.xpath("//a[@class='how-it-works_link']")).get(2).click();
        driver.findElement(By.xpath("//*[text() = 'Become a Driver!']")).click();
        sleep(3);

        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='header-large margin-bottom-20']")).isDisplayed());
    }

    @Test
    public void test6FindElement() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElement(By.xpath("//*[@for='home-checkbox-delivery']")).click();
        sleep(3);
        driver.findElement(By.xpath("//label[@for='input-food-search']"));
        driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
        driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
        sleep(5);

        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='section-subheader--home margin-bottom-20 display-block ng-binding']")).isDisplayed());

    }

    @Test
    public void test7FindLogo() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElement(By.xpath("//*[@class='logo-alternate']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='logo-alternate']")).isDisplayed());

    }

    @Test
    public void test8FindLiveChat() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        sleep(3);
        driver.findElement(By.xpath("//span[text() = 'Live Chat']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//span[text() = 'Live Chat']")).isDisplayed());

    }

    @Test
    public void test9FindSomeElement() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElement(By.xpath("//*[@class='text-center landing-callout--image promo_text']")).click();
        sleep(4);

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='text-center landing-callout--image promo_text']")).isDisplayed());
    }

    @Test
    public void test10findCard() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElements(By.xpath("//div[@class='navbar__icon']")).get(1).click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='btn btn--orange btn-checkout full-width ng-binding btn-checkout--is-disabled']")).isDisplayed());

    }

    @Test
    public void test11FindAdress() {
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElements(By.xpath("//input[@type='text']")).get(0).sendKeys("Buffalo");
        driver.findElement(By.xpath("//*[@ng-click='home.searchRestaurants(home.address, home.details)']")).click();
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//*[@ng-click='home.searchRestaurants(home.address, home.details)']")).click();
        sleep(5);

        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='restaurants-list_header ng-binding ng-scope']")).isDisplayed());

    }

    @Test
    public void test12FindDallas() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElements(By.xpath("//a[@class='ng-binding']")).get(104).click();
        sleep(5);
//        waitTillElementConditionsText(locator "h1", text "Medison");
//        WebDriverWait wait = WebDriverWait(driver.30);
//        wait.until(ExpectedCondition.textToBePresentin Element Located())Located

        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='ng-binding ng-scope']")).isDisplayed());
    }

    //public void waitTillElementConditionsText(String locator, String text) {


    @Test
    public void test13FindText() {
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        driver.findElement(By.xpath("//h1[@class='section-header text-center']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='section-header text-center']")).isDisplayed());

    }
}

   // driver manage().timeouts().implicitly wait(10),Time Unit.SECONDS);
    //    WebDriverWait wait = WebDriverWait(driver 30);WebDriverWait