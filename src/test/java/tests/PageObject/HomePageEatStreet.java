package tests.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageEatStreet extends BasePage {

    public HomePageEatStreet(WebDriver driver) {
        super(driver);
    }

    public WebElement clouseGoItBtn() {
        return driver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement selectCityPhoenix() {
        return driver.findElement(By.xpath("//a[@class='ng-binding']"));
    }

    public List<WebElement> selectAmericanFood() {
        return driver.findElements(By.xpath("//button[@class='cuisine-types__item__button ng-binding']"));
    }

    public WebElement PhoenixRestauran() {
        return driver.findElement(By.xpath("//h1[@class='restaurants-list_header ng-binding ng-scope']"));
    }

    public WebElement getTitle() {
        return driver.findElement(By.xpath("//h1[@class='section-header text-center']"));
    }

    public WebElement takeoutBtn() {
        return driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']"));
    }

    public WebElement enterYourAdress() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement takeGetFed() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement enterAdress() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement canChooseRestaurant() {
        return driver.findElement(By.xpath("//div/h1[@class='restaurants-list_header ng-binding ng-scope']"));
    }

    public WebElement openInColoradoDenver() {
        return driver.findElement(By.xpath("//a[@href='/denver-co/home']"));
    }

    public WebElement openAmericanFood() {
        return driver.findElements(By.xpath("//button[@class='cuisine-types__item__button ng-binding']")).get(0);
    }

    public WebElement loadMoreRestaurant() {
        return driver.findElement(By.xpath("//button[@class='btn btn--orange']"));
    }

    public WebElement canChooseMamaOliviasPizzeria() {
        return driver.findElements(By.xpath("//div[@class='information']")).get(1);
    }

    public WebElement seeMenuMamaOliviasPizzeria() {
        return driver.findElement(By.xpath("//h1[@class='name ng-binding']"));
    }

    public WebElement getToApplyNow() {

        return driver.findElements(By.xpath("//a[@href='/driver-careers']")).get(0);
    }

    public WebElement selectDekalb() {
       return driver.findElement(By.xpath("//select[@onchange='location = this.value;']"));
   }

    public WebElement getAppleHere() {
        return driver.findElement(By.xpath("//button[@class='btn btn-action']"));
    }


    public WebElement getTheAppBtn() {
        return driver.findElements(By.xpath("//a[@class='how-it-works_link']")).get(2);
    }

    public WebElement becomeADriverBtn() {
        return driver.findElement(By.xpath("//*[@href='/driver-careers']"));
    }


    public WebElement earnYourWay() {
    return driver.findElement(By.xpath("//h1[@class='header-large margin-bottom-20']"));
 }

    public WebElement deliveryBtn() {
        return driver.findElement(By.xpath("//*[@for='home-checkbox-delivery']"));
    }

    public WebElement PhoenixBtn() {
        return driver.findElement(By.xpath("//a[@class='ng-binding']"));
    }

    public WebElement chooseFoodPhoenix() {
        return driver.findElement(By.xpath("//h1[@class='section-subheader--home margin-bottom-20 display-block ng-binding']"));
    }

    public WebElement liveChatBtn() {
        return driver.findElement(By.xpath("//span[text() = 'Live Chat']"));
    }

    public WebElement openLiveChat() {
        return driver.findElement(By.xpath("//span[text() = 'Live Chat']"));
    }

    public WebElement findLogoEatStreet() {
        return driver.findElement(By.xpath("//*[@class='logo-alternate']"));
    }

    public WebElement seeLogoEatStreet() {
        return driver.findElement(By.xpath("//*[@class='logo-alternate']"));
    }

    public WebElement inscriptionSpringEats() {
        return driver.findElement(By.xpath("//*[@class='text-center landing-callout--image promo_text']"));
    }

    public WebElement bigIscriptionSpringEats() {
        return driver.findElement(By.xpath("//*[@class='text-center landing-callout--image promo_text']"));
    }

    public WebElement cart() {
        return driver.findElements(By.xpath("//div[@class='navbar__icon']")).get(0);
    }

    public WebElement signIn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement seeRegistrationForm() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement enterBuffalo() {
        return driver.findElements(By.xpath("//input[@type='text']")).get(0);
    }

    public WebElement getFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement enterAdressBtn() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement btnGetFed() {
        return driver.findElement(By.xpath("//*[@ng-click='home.searchRestaurants(home.address, home.details)']"));
    }

    public WebElement BuffaloRestourants() {
        return driver.findElement(By.xpath("//h1[@class='restaurants-list_header ng-binding ng-scope']"));
    }
    public void switchTabs(String tab) {
        driver.switchTo().window(tab);
    }
    public List<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }
}

//    public WebElement getCurrentUrl(String s) {
//        return driver.getCurrentUrl().contains();




