package org.example.GUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.example.GUI.UIElements.*;

public class UI_Test {

    private WebDriver driver;
    private BrowserDriver browserDriver;

    public void setUp(){
        browserDriver = new BrowserDriver(driver);
    }
    @Test
    public void LoginLogOut(){
        setUp();
        browserDriver.setupBrowser();
        browserDriver.getDriver().get(url);

        browserDriver.getDriver().findElement(username).sendKeys("standard_user");
        browserDriver.getDriver().findElement(password).sendKeys("secret_sauce",Keys.ENTER);

        browserDriver.getDriver().findElement(menu).click();
        browserDriver.getDriver().findElement(logOut).click();
        browserDriver.getDriver().findElement(username).isDisplayed();

        browserDriver.closeBrowser();
    }

    @Test
    public void PurchaseItem(){
        setUp();
        browserDriver.setupBrowser();
        browserDriver.getDriver().get(url);

//        login
        browserDriver.getDriver().findElement(username).sendKeys("standard_user");
        browserDriver.getDriver().findElement(password).sendKeys("secret_sauce",Keys.ENTER);

//        adding items
        browserDriver.getDriver().findElement(sauce_labs_backPack).click();
        browserDriver.getDriver().findElement(shopping_cart_quantity).click();
        browserDriver.getDriver().findElement(checkout).click();
        browserDriver.getDriver().findElement(firstName).sendKeys("QA Engineer");
        browserDriver.getDriver().findElement(lastName).sendKeys("DevOps");
        browserDriver.getDriver().findElement(postalCode).sendKeys("8000");
        browserDriver.getDriver().findElement(continueBtn).click();
        browserDriver.getDriver().findElement(finish).click();
        browserDriver.getDriver().findElement(backHome).click();

//        logOut
        browserDriver.getDriver().findElement(menu).click();
        browserDriver.getDriver().findElement(logOut).click();
        browserDriver.getDriver().findElement(username).isDisplayed();

        browserDriver.closeBrowser();
    }

    @Test
    public void PurchaseMoreItems(){
        setUp();
        browserDriver.setupBrowser();
        browserDriver.getDriver().get(url);

        browserDriver.getDriver().findElement(username).sendKeys("standard_user");
        browserDriver.getDriver().findElement(password).sendKeys("secret_sauce",Keys.ENTER);

        browserDriver.getDriver().findElement(sauce_labs_backPack).click();
        browserDriver.getDriver().findElement(sauce_labs_bolt_tShirt).click();
        browserDriver.getDriver().findElement(sauce_labs_bike_light).click();
        browserDriver.getDriver().findElement(sauce_labs_fleece_jacket).click();
        browserDriver.getDriver().findElement(shopping_cart_quantity).click();

        browserDriver.getDriver().findElement(checkout).click();
        browserDriver.getDriver().findElement(firstName).sendKeys("Test Engineer");
        browserDriver.getDriver().findElement(lastName).sendKeys("Devs");
        browserDriver.getDriver().findElement(postalCode).sendKeys("8005");
        browserDriver.getDriver().findElement(continueBtn).click();
        browserDriver.getDriver().findElement(finish).click();
        browserDriver.getDriver().findElement(backHome).click();

        browserDriver.getDriver().findElement(menu).click();
        browserDriver.getDriver().findElement(logOut).click();
        browserDriver.getDriver().findElement(username).isDisplayed();

        browserDriver.closeBrowser();
    }
}

