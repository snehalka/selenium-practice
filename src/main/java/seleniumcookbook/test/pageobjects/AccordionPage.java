package seleniumcookbook.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by snehalmohite on 05/02/17.
 */
public class AccordionPage {
    @FindBy(linkText = "Accordion")
    public WebElement accordion;

    public AccordionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
