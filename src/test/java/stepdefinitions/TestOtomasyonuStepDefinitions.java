package stepdefinitions;

import io.cucumber.java.en.*;
import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestOtomasyonuStepDefinitions {

    TestotomasyonuPage testotomasyonuPage=new TestotomasyonuPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();



    @Given("kullanıcı testotomasyonu sayfasına gider")
    public void kullanıcı_testotomasyonu_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("account linkine basar")
    public void account_linkine_basar() {

      testotomasyonuPage.accountLinki.click();


    }
    @Then("email olarak {string} girer")
    public void email_olarak_girer(String configDosyasiEmail) {

        testotomasyonuPage.loginSayfasiEmailKutusu
                .sendKeys(ConfigReader.getProperty(configDosyasiEmail));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_to_gecerli_password_girer(String configDosyasiPassword) {

    testotomasyonuPage.loginSayfasiPasswordKutusu
                       .sendKeys(ConfigReader.getProperty(configDosyasiPassword));


    }
    @Then("signIn butonuna basar")
    public void sign_ın_butonuna_basar() {

        ReusableMethods.bekle(2);

        js.executeScript("arguments[0].click();", testotomasyonuPage.loginSayfasiSubmitButonu);



    }
    @Then("basarili olarak giris yapılabildiğini test eder")
    public void basarili_olarak_giris_yapılabildiğini_test_eder() {

        js.executeScript("arguments[0].scrollIntoView(true);", testotomasyonuPage.logoutButonu);
        ReusableMethods.bekle(3);
        Assertions.assertTrue(testotomasyonuPage.logoutButonu.isDisplayed());

    }
    @Then("logout butonuna basarak cıkıs yapar")
    public void logout_butonuna_basarak_cıkıs_yapar() {


        ReusableMethods.bekle(3);
        js.executeScript("argument[0].click();",testotomasyonuPage.logoutButonu);


    }


    @When("sisteme giris yapilamadıgını test eder")
    public void sistemeGirisYapilamadıgınıTestEder() {

        Assertions.assertTrue(testotomasyonuPage.loginSayfasiEmailKutusu.isDisplayed());
    }


    @And("acilan sayfadaki urun isminin case sensetive olmadan config dosyasindaki toAranacakKelime icerdigini test eder")
    public void acilanSayfadakiUrunIsmininCaseSensetiveOlmadanConfigDosyasindakiToAranacakKelimeIcerdiginiTestEder() {

       String expectedIsimIcerik=ConfigReader.getProperty("toAranacakKelime");
       String actualUrunIsmi=testotomasyonuPage.urunSayfasindakiIsimElementi.getText().toLowerCase();

       Assertions.assertTrue(actualUrunIsmi.contains(expectedIsimIcerik));

    }

    @When("arama kutusuna config dosyasindaki toAranacakKelime yazip aratir")
    public void aramaKutusunaConfigDosyasindakiToAranacakKelimeYazipAratir() {

        testotomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+Keys.ENTER);
    }

    @Then("testotomasyonu sayfasındaki ilk urunu tıklar")
    public void testotomasyonuSayfasındakiIlkUrunuTıklar() {

        testotomasyonuPage.bulunanUrunElementleriList.get(0).click();
    }
}
