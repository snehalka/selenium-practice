package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by snehalmohite on 05/02/17.
 */
public class Launch {
    public WebDriver driver = new FirefoxDriver();

    @BeforeSuite
    public void launch() {
        driver.get("http://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void quit() {
        driver.quit();
    }
}
