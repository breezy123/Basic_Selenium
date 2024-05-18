package org.example.GUI;

import org.openqa.selenium.By;

public class UIElements {

    public static String url="https://eqaroloflow.co.za/wp/my-account/";
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By order = By.xpath("//a[normalize-space()='Orders']");
    public static By wine_1948 = By.xpath("//a[normalize-space()='#1948']");

    public static By shiraz = By.xpath("//a[normalize-space()='Thelma Shiraz 2017']");

    public static By addCart = By.xpath("//button[normalize-space()='Add to cart']");
    public static By checkOut = By.xpath("//a[normalize-space()='Proceed to checkout']");
    public static By placeOrder = By.xpath("//button[@id='place_order']");

    //a[normalize-space()='Proceed to checkout']
    //button[normalize-space()='Add to cart']



}
