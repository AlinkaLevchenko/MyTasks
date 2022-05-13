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
}
