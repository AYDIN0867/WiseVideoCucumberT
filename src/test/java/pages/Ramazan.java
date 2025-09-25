package pages;

import drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ramazan {

    public Ramazan(){ PageFactory.initElements(DriverManager.getDriver(),this);}

    @FindBy(xpath="(//*[.='Bronze'])[1]")
    public WebElement bronzeButton;

    @FindBy(xpath="(//*[.='Gold'])[1]")
    public WebElement goldButton;

    @FindBy(xpath="(//*[.='Silver'])[1]")
    public WebElement silverButton;

    @FindBy(xpath = "(//*[.='Purchase'])[1]")
    public WebElement purchaseBronzeButton;

    @FindBy(xpath = "(//*[.='Purchase'])[2]")
    public WebElement purchaseGoldButton;

    @FindBy(xpath = "(//*[.='Purchase'])[3]")
    public WebElement purchaseSilverButton;

    @FindBy(xpath = "//*[.='Subscribe Now!']")
    public WebElement subscribeNowText;

   //  @FindBy(className = "btn btn-primary btn-block mt-50")
  //  public WebElement purchaseButtonList;


}
