package seleniumcookbook.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by snehalmohite on 05/02/17.
 */
public class InteractionPage {
    @FindBy(xpath = ".//*[@id='draggableview']/p")
    public WebElement draggableview;
    @FindBy(xpath = ".//*[@id='droppableview']/p")
    public WebElement droppableview;
    @FindBy(linkText = "Droppable")
    public WebElement droppablelink;
    @FindBy(linkText = "Selectable")
    public WebElement selectablelink;
    @FindBy(xpath = ".//*[@id='selectable']/li[1]")
    public WebElement item1;
    @FindBy(xpath = ".//*[@id='selectable']/li[4]")
    public WebElement item4;
    @FindBy(xpath = "//div[@id=\"tabs-4\"]/div/div[1]/div1]/div/span")
    public WebElement portlet;

    public InteractionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
