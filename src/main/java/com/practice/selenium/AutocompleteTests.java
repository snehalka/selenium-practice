package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;
import java.util.List;
import seleniumcookbook.test.pageobjects.AutocompletePage;

/**
 * Created by snehalmohite on 09/02/17.
 */
public class AutocompleteTests extends Launch {

    AutocompletePage autocompletePage = new AutocompletePage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 300);

    @Test()
    public void autocompleteDropdown() throws Exception{
        autocompletePage.autocompletelink.click();
       wait.until(ExpectedConditions.elementToBeClickable(autocompletePage.tagss));
        autocompletePage.tagss.sendKeys("java");
        selectOptionWithText("Java");

    }

    public void selectOptionWithText(String textToSelect) throws Exception {
        WebElement autoOptions = autocompletePage.ui_id_1;
        wait.until(ExpectedConditions.elementToBeClickable(autoOptions));
        List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
        for (WebElement option : optionsToSelect) {
            System.out.println("option = " + option.getText());
            if (option.getText().equals(textToSelect)) {
                System.out.println("Trying to select: " + textToSelect);
                option.click();
                break;

            }
        }
    }
}