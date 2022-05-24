package MyHomeWork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenSaiteKitten extends Testinit {

    @Test
    public void runGoogle() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Kitten\n");
        driver.findElement(By.xpath("\"//input[@name=\\\"q\\\"]\""));
        driver.quit();
    }
}

