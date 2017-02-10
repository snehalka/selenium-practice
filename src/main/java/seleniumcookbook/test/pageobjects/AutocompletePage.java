package seleniumcookbook.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by snehalmohite on 09/02/17.
 */
public class AutocompletePage {


    @FindBy(linkText = "Autocomplete")
    public WebElement autocompletelink;
    public  WebElement tagss;
    @FindBy(xpath = ".//*[@id='tabs-1']")
    public WebElement ui_id_1;

    public AutocompletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
