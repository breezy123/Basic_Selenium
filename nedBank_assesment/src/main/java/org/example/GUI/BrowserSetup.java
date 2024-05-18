package org.example.GUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BrowserSetup {

    WebDriver driver;

    BrowserSetup(WebDriver driver){
        this.driver=driver;
    }

    void lunchBrowser(){

        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    WebDriver getDriver(){
        return this.driver;
    }
    void quiteBrowser(){
        driver.quit();
    }
}
