package tests.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsEatstreet extends Testinit {
    private HomePageEatStreet homePageEatStreet;

    @Test
    public void test2FindElemetClick() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.selectCityPhoenix().click();
        sleep(4);
        homePageEatStreet.selectAmericanFood().get(2).click();
        sleep(5);

        Assert.assertTrue(homePageEatStreet.PhoenixRestauran().isDisplayed());
    }

    @Test
    public void test13FindText() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();

        Assert.assertTrue(homePageEatStreet.getTitle().isDisplayed());
    }

    @Test
    public void checkRestaurantsInNY() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.takeoutBtn().click();
        homePageEatStreet.enterYourAdress().sendKeys("New York");
        homePageEatStreet.takeGetFed().click();
        homePageEatStreet.enterAdress().click();
        homePageEatStreet.takeGetFed().click();
        sleep(3);

        Assert.assertTrue(homePageEatStreet.canChooseRestaurant().isDisplayed());

    }

    @Test
    public void test3FindEatInColorado() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.openInColoradoDenver().click();
        sleep(3);
        homePageEatStreet.openAmericanFood().click();
        sleep(3);
        homePageEatStreet.loadMoreRestaurant().click();
        homePageEatStreet.canChooseMamaOliviasPizzeria().click();
        sleep(3);

        Assert.assertTrue(homePageEatStreet.seeMenuMamaOliviasPizzeria().isDisplayed());
    }

    @Test
    public void test4ApplyBeforeRegistration() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.getToApplyNow().click();
        sleep(3);
        homePageEatStreet.selectDekalb().sendKeys("Dekalb,IL");
        homePageEatStreet.getAppleHere().click();
        sleep(5);
        homePageEatStreet.switchTabs(homePageEatStreet.getTabs().get(1));

        Assert.assertTrue(driver.getCurrentUrl().contains("fountain"));
    }

    @Test
    public void test5GetTheApp() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.getTheAppBtn().click();
        homePageEatStreet.becomeADriverBtn().click();
        sleep(4);

        Assert.assertTrue(homePageEatStreet.earnYourWay().isDisplayed());
    }

    @Test
    public void test6FindElement() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.deliveryBtn().click();
        homePageEatStreet.PhoenixBtn().click();
        sleep(3);
        Assert.assertTrue(homePageEatStreet.chooseFoodPhoenix().isDisplayed());
    }

    @Test
    public void test7FindLogo() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.findLogoEatStreet();
        Assert.assertTrue(homePageEatStreet.seeLogoEatStreet().isDisplayed());
    }

    @Test
    public void test8FindLiveChat() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        sleep(4);
        homePageEatStreet.liveChatBtn().click();

        Assert.assertTrue(homePageEatStreet.openLiveChat().isDisplayed());
    }

    @Test
    public void test9FindSomeElement() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.inscriptionSpringEats();

        Assert.assertTrue(homePageEatStreet.bigIscriptionSpringEats().isDisplayed());
    }

    @Test
    public void test10findCard() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.cart().click();
        homePageEatStreet.seeRegistrationForm().click();
        sleep(4);

        Assert.assertTrue(homePageEatStreet.signIn().isDisplayed());
    }

    @Test
    public void test11FindAdress() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.enterBuffalo().sendKeys("Buffalo");
        homePageEatStreet.getFedBtn().click();
        homePageEatStreet.enterAdressBtn().click();
        homePageEatStreet.btnGetFed().click();
        sleep(4);

        Assert.assertTrue(homePageEatStreet.BuffaloRestourants().isDisplayed());
    }
}

