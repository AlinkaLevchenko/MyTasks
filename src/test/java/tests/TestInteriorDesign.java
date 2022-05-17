package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.PageObject.HomePageInteriorDesign;
import tests.PageObject.Testinit;

public class TestInteriorDesign extends Testinit {

    @Test
    public void designApartmentInSmartRoom() {
        HomePageInteriorDesign homePageInteriorDesign =  new HomePageInteriorDesign(driver);
        openSite("https://polyakova.biz/ua");
        homePageInteriorDesign.portfolioBtn().click();
        homePageInteriorDesign.smartRoomsopen().click();
        homePageInteriorDesign.roomInCampus().click();

        Assert.assertTrue(homePageInteriorDesign.photoDesignFlatCampus().isDisplayed());
    }
}
