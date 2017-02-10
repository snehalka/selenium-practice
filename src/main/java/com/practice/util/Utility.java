package com.practice.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.practice.selenium.Launch;
import org.openqa.selenium.WebDriver;
import seleniumcookbook.test.pageobjects.RegistrationPage;
/**
 * Created by snehalmohite on 06/02/17.
 */
public class Utility extends Launch{
    RegistrationPage RegistrationPage = new RegistrationPage(driver);
    public static long random()
    {
        return System.currentTimeMillis();
    }

}
