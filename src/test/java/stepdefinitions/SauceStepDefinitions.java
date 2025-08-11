package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import pages.SauceDemoPage;
import utilities.Driver;

public class SauceStepDefinitions {

    SauceDemoPage sauceDemoPage=new SauceDemoPage();
    JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
    String ilkUrunIsim;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String direktKullanıcıAdı) {

    sauceDemoPage.userNameBox.sendKeys(direktKullanıcıAdı);

    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String direktPassword) {

        sauceDemoPage.passwordBox.sendKeys(direktPassword);

    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {


        //sauceDemoPage.loginButton.click();
        js.executeScript("arguments[0].click();", sauceDemoPage.loginButton);

    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {

        //ilkUrunIsim=sauceDemoPage.sauceDemobulunanUrunElementleriList.get(0).getText();
        sauceDemoPage.sauceDemobulunanUrunElementleriList.get(0).click();
       // js.executeScript("arguments[0].click();", sauceDemoPage.sauceDemobulunanUrunElementleriList.get(0));
        ilkUrunIsim=sauceDemoPage.ilkUrun.getText();
        sauceDemoPage.ilkUrun.click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

        sauceDemoPage.addToCartButon.click();
       // js.executeScript("argument[0],click();",sauceDemoPage.addToCartButon);



    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {

        sauceDemoPage.sepet.click();



    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

        String SepettekiUrunIsmi=sauceDemoPage.sepettekiUrunIsmi.getText();

        Assertions.assertEquals(ilkUrunIsim,SepettekiUrunIsmi);


    }

}
