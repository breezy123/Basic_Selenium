package org.example.GUI;

import org.openqa.selenium.By;

public class UIElements {

    public static String url = "https://www.saucedemo.com/";

    public static  final By username = By.id("user-name");
    public static final By password = By.id("password");
    public static final By menu = By.xpath("//button[@id='react-burger-menu-btn']");
    public static final By logOut = By.id("logout_sidebar_link");
    public static final By sauce_labs_backPack = By.id("add-to-cart-sauce-labs-backpack");
    public static final By shopping_cart_quantity = By.xpath("//span[@class='shopping_cart_badge']");
    public static final By checkout = By.id("checkout");
    public static final By firstName = By.id("first-name");
    public static final By lastName = By.id("last-name");
    public static final By postalCode = By.id("postal-code");
    public static final By continueBtn = By.id("continue");
    public static final By finish = By.id("finish");
    public static final By backHome = By.id("back-to-products");
    public static final By sauce_labs_bike_light = By.id("add-to-cart-sauce-labs-bike-light");
    public static final By sauce_labs_bolt_tShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public static final By sauce_labs_fleece_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
}
