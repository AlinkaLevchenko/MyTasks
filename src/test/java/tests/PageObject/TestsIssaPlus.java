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
}

