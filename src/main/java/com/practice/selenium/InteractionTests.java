package com.practice.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import seleniumcookbook.test.pageobjects.InteractionPage;

public class InteractionTests extends Launch {
    InteractionPage InteractionPage = new InteractionPage(driver);

    @Test(priority = 0)
    public void dragDrop() {
        InteractionPage.droppablelink.click();
        Actions builders = new Actions(driver);
        builders.dragAndDrop(InteractionPage.draggableview, InteractionPage.droppableview).perform();
    }

    @Test()
    public void selectMultipleElements()
    {
        InteractionPage.selectablelink.click();
        Actions builders = new Actions(driver);
//        builders.moveToElement(InteractionPage.item1).click().perform();
//        builders.moveToElement(InteractionPage.item4).click().perform();
        builders.moveToElement(InteractionPage.item1).click().keyDown(Keys.SHIFT).moveToElement(InteractionPage.item4).click().perform();
    }
}
