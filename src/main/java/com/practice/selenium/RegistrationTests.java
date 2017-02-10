package com.practice.selenium;

import com.practice.util.Utility;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import seleniumcookbook.test.pageobjects.RegistrationPage;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class RegistrationTests extends Launch {

    //WebDriver driver = new FirefoxDriver();
    RegistrationPage RegistrationPage = new RegistrationPage(driver);

    @BeforeSuite
    public void driverLaunch() {

        driver.get("http://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void testTextBoxes() throws Exception {

        RegistrationPage.registrationlink.click();
        Properties prop = new Properties();
        String propFileName = "values.properties";
        File f = new File(propFileName);
        FileInputStream fis = new FileInputStream(f);
        prop.load(fis);
        String FirstName = prop.getProperty("FirstName");
        String LastName = prop.getProperty("LastName");
        String Phonenumber = prop.getProperty("Phonenumber");
        String Username = prop.getProperty("Username");
        String Email = prop.getProperty("Email");
        String Description = prop.getProperty("Description");
        String Password = prop.getProperty("Password");
        String ConfirmPassword = prop.getProperty("ConfirmPassword");
        RegistrationPage.name_3_firstname.sendKeys(FirstName + "_" + Utility.random());
        RegistrationPage.name_3_lastname.sendKeys(LastName + "_" + Utility.random());
        RegistrationPage.phone_9.sendKeys(Phonenumber);
        RegistrationPage.username.sendKeys(Username + "_" + Utility.random());
        RegistrationPage.email_1.sendKeys(Utility.random()  + "_" + Email);
        RegistrationPage.description.sendKeys(Description);
        RegistrationPage.password_2.sendKeys(Password);
        RegistrationPage.confirm_password_password_2.sendKeys(ConfirmPassword);

    }

    @Test(priority = 1)
    public void testRadioButtons() {
        if (!RegistrationPage.pie_register.isSelected())
            RegistrationPage.pie_register.click();
        if (!RegistrationPage.dance.isSelected())
            RegistrationPage.dance.click();
    }

    @Test(priority = 2)
    public void testDropDowns() {
        Select RD = new Select(RegistrationPage.dropdown_7);
        System.out.println(RD.getOptions().size());
        RD.selectByValue("India");
        Select DM = new Select(RegistrationPage.mm_date_8);
        System.out.println(DM.getOptions().size());
        DM.selectByValue("5");
        Select DD = new Select(RegistrationPage.dd_date_8);
        System.out.println(DD.getOptions().size());
        DD.selectByValue("24");
        Select DY = new Select(RegistrationPage.yy_date_8);
        System.out.println(DY.getOptions().size());
        DY.selectByValue("1990");

    }

    @Test(priority = 3)
    public void testButton() {
        RegistrationPage.submitbutton.click();
    }

}
