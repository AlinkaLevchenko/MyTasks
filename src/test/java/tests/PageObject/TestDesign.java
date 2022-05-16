package tests.PageObject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDesign extends Testinit{

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

