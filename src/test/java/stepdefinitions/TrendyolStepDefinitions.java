package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendyolStepDefinitions {

    TrendyolPage trendyolPage=new TrendyolPage();

    @Given("kullanici trendyol anasayfaya gider")
    public void kullanici_trendyol_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));


    }
    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {

        trendyolPage.searchBox.sendKeys("iphone"+ Keys.ENTER);
        ReusableMethods.bekle(2);



    }
    @Then("arama sonucunda urun bulunabildiğini test eder")
    public void arama_sonucunda_urun_bulunabildiğini_test_eder() {


        String actualAramaSonucu=trendyolPage.aramaSonucElementiYazisi.getText();
        String actualAramaSonucuRakam=actualAramaSonucu.replaceAll("\\D","");
        int aramaSonucuRakam=Integer.parseInt(actualAramaSonucuRakam);
        Assertions.assertNotEquals(0,aramaSonucuRakam);

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.quitDriver();

    }


    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {

        trendyolPage.searchBox.sendKeys("dress"+Keys.ENTER);
    }

    @When("arama kutusuna travel yazıp aratir")
    public void aramaKutusunaTravelYazıpAratir() {

        trendyolPage.searchBox.sendKeys("travel"+Keys.ENTER);

    }

    @Then("ilk urunu tıklar")
    public void ilk_urunu_tıklar() {

        trendyolPage.iphoneIosCEpTelefonlariRadioButton.click();
        ReusableMethods.bekle(2);
        trendyolPage.iphoneElementleriList.get(0).click();

    }

    @Then("acilan sayfadaki urun isminin case sensetive olmadan phone icerdigini test eder")
    public void acilan_sayfadaki_urun_isminin_case_sensetive_olmadan_phone_icerdigini_test_eder() {

        ReusableMethods.bekle(3);
        String expectedIsimIcerik="iphone";
        String actualUrunIsım=trendyolPage.ilkUrunElementi.getText().toLowerCase();
        ReusableMethods.bekle(2);


        Assertions.assertTrue(actualUrunIsım.contains(expectedIsimIcerik));



    }

    @When("arama kutusuna {string} yazip aratir")
    public void arama_kutusuna_yazip_aratir(String aranacakKelime) {

        trendyolPage.searchBox.sendKeys(aranacakKelime+Keys.ENTER);

    }


    @And("kodları {int} saniye bekletir")
    public void kodlarıSaniyeBekletir(int saniye) {

        ReusableMethods.bekle(saniye);

    }

    @Then("arama sonucunda urun bulunamadıgını test eder")
    public void aramaSonucundaUrunBulunamadıgınıTestEder() {

        String expectedAramaSonucu=ConfigReader.getProperty("toBulunamadıYazisiTrend");
        String actualAramaSonucu=trendyolPage.aramaSonucElementiYazisi.getText().trim().replaceAll("\\s+", " ");

        Assertions.assertEquals(expectedAramaSonucu,actualAramaSonucu);

    }
}
