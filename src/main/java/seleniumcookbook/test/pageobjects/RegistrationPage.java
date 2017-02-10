package seleniumcookbook.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {
    public WebElement name_3_firstname;
    public WebElement name_3_lastname;
    public WebElement dropdown_7;
    public WebElement mm_date_8;
    public WebElement dd_date_8;
    public WebElement yy_date_8;
    public WebElement phone_9;
    public WebElement username;
    public WebElement email_1;
    public WebElement description;
    public WebElement password_2;
    public WebElement confirm_password_password_2;
    public WebElement Submit;
    @FindBy(xpath = ".//*[@id='pie_register']/li[2]/div/div/input[2]")
    public WebElement pie_register;
    @FindBy(xpath = ".//*[@id='pie_register']/li[3]/div/div/input[1]")
    public WebElement dance;
    @FindBy(linkText = "Registration")
    public WebElement registrationlink;
    @FindBy(name = "pie_submit")
    public WebElement submitbutton;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
