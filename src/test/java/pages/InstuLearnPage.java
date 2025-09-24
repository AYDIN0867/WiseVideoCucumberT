package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstuLearnPage {

    public InstuLearnPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="(//*[.='Bronze'])[1]")
    public WebElement bronzeButton;

    @FindBy(xpath="(//*[.='Gold'])[1]")
    public WebElement goldButton;

    @FindBy(xpath="(//*[.='Silver'])[1]")
    public WebElement silverButton;

    @FindBy(xpath = "(//*[.='Purchase'])[1]")
    public WebElement purchaseBronzeButton;

    @FindBy(xpath = "//*[.='Subscribe Now!']")
    public WebElement subscribeNowText;

}
