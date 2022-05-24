package PageObject.ForTests;

import PageObject.ForPages.HomePageZakazUa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestZakazUa extends Testinit {

    @Test
    public void putProductInBasket() {
        HomePageZakazUa homePageZakazUa = new HomePageZakazUa(driver);
        openSite("https://zakaz.ua/uk/");
        sleep(3);
        homePageZakazUa.goToNovus().click();
        homePageZakazUa.fruitsAndVegetablesBtn().click();
        homePageZakazUa.fruits().get(0).click();
        homePageZakazUa.selectFruits().get(0).click();
        homePageZakazUa.addBtn().get(1).click();
        homePageZakazUa.deliveryTape().click();

        Assert.assertTrue(homePageZakazUa.cityBtn().isDisplayed());
    }
}
