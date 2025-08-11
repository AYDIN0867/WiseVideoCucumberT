package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SauceDemoPage {

    public SauceDemoPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(id="user-name")
    public WebElement userNameBox;


    @FindBy(id="password")
    public WebElement passwordBox;


    @FindBy(id="login-button")
    public WebElement loginButton;

    @FindBy(className = "inventory_item")
    public List<WebElement> sauceDemobulunanUrunElementleriList;





}
