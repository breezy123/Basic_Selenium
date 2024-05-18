package org.example.GUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.GUI.UIElements.*;

public class Pizza_Shop_test {

    WebDriver driver;
    BrowserSetup driverObj;

    @BeforeClass
    void  setUp(){
        driverObj = new BrowserSetup(driver);
    }

    @Test
    void orderItem() throws InterruptedException {

        driverObj.lunchBrowser();
        driverObj.getDriver().get(url);
        driverObj.getDriver().findElement(username).sendKeys("TestUser");
        driverObj.getDriver().findElement(password).sendKeys("Tester5027#", Keys.ENTER);

        driverObj.getDriver().findElement(order).click();
        driverObj.getDriver().findElement(wine_1948).click();

        driverObj.getDriver().findElement(shiraz).click();
        driverObj.getDriver().findElement(addCart).click();
        driverObj.getDriver().findElement(checkOut).click();
        Thread.sleep(2000);
        driverObj.getDriver().findElement(placeOrder).click();

        Thread.sleep(2000);
        driverObj.quiteBrowser();
    }
}
