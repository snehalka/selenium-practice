package com.practice.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import seleniumcookbook.test.pageobjects.AccordionPage;

/**
 * Created by snehalmohite on 07/02/17.
 */
public class AccordionTests extends Launch{

    AccordionPage ap = new AccordionPage(driver);

    @Test
    public void test1(){
        ap.accordion.click();
        for (int i = 1; i < 5; i++) {
            driver.findElement(
                    By.xpath("//div[@id=\"accordion\"]/h3[" + i + "]/span")
            ).click();
        }

    }

}
