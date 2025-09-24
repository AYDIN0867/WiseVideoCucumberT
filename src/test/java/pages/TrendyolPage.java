package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TrendyolPage {

    public TrendyolPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='vQI670rJ']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='dscrptn dscrptn-V2']")
    public WebElement aramaSonucElementiYazisi;

    ////*[@class='dscrptn dscrptn-V2']

    @FindBy(xpath = "(//*[@class='chckbox'])[1]")
    public WebElement iphoneIosCEpTelefonlariRadioButton;

    @FindBy(xpath = "//*[@class='p-card-wrppr with-campaign-view']")
    public List<WebElement> iphoneElementleriList;

   @FindBy(xpath = "//h1[@data-testid='product-title']")
   public  WebElement ilkUrunElementi;

//*[@class='product-title']

    //(//*[contains(@class, 'text-center')])[9] subscribe now text
}   //(//*[@class='text-center'])[1]