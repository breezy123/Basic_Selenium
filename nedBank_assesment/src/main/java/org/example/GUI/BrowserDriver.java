package org.example.GUI;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@Getter
public class BrowserDriver {
    WebDriver driver;

    public BrowserDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setupBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeBrowser() {
        driver.quit();
    }
}
