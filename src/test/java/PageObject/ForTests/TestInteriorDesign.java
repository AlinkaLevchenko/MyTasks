package PageObject.ForTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.ForPages.HomePageInteriorDesign;
import PageObject.ForTests.Testinit;

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
