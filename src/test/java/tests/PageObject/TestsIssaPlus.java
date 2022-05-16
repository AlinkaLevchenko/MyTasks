package tests.PageObject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsIssaPlus extends Testinit {

    @Test
    public void test1findProductInCart() {
        HomePageIssaPlus homePageIssaPlus = new HomePageIssaPlus(driver);
        openSite("https://issaplus.com/ua/");
        homePageIssaPlus.clothesBtn().click();
        homePageIssaPlus.odezhdaBluzi().click();
        homePageIssaPlus.footCloseBtn().click();
        homePageIssaPlus.selectWhiteBluza().get(0).click();
        homePageIssaPlus.btnSizeL().click();
        homePageIssaPlus.selectBtnBuy().get(0).click();
        sleep(3);
        homePageIssaPlus.btnPrimary().click();
        sleep(3);

        Assert.assertTrue(homePageIssaPlus.IconFavorCout().isDisplayed());
    }

    @Test
    public void checkPheonixBreakfastCuisine() {
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
    public void selectRestInDenver() {
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
    public void checkDeliveryDriver() {
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
    public void apllyInYourCity() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openSite("https://eatstreet.com/");
        homePageEatStreet.clouseGoItBtn().click();
        homePageEatStreet.getTheAppBtn().click();
        homePageEatStreet.becomeADriverBtn().click();
        sleep(4);

        Assert.assertTrue(homePageEatStreet.earnYourWay().isDisplayed());
    }
}


