package stepdefinitions;


import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Ramazan;
import utils.JSUtilities;

public class RamazanStepDefinitions {

    Ramazan ramazan=new Ramazan();


    @Given("user goes to {string}")
    public void user_goes_to(String string) throws InterruptedException {

        DriverManager.getDriver().get(ConfigReader.getProperty("instulearnUrl"));
        Thread.sleep(5000);


    }

    @Given("user waits {int} seconds")
    public void userWaitsSeconds(int arg0) throws InterruptedException {

        Thread.sleep(2000);
        Thread.dumpStack();
    }



    @When("user scrolls the page until {string} text")
    public void user_scrolls_the_page_until_text(String string) throws InterruptedException {

        JSUtilities.scrollToElement(DriverManager.getDriver(),ramazan.subscribeNowText);
        Thread.sleep(2000);



    }

    @Then("page should display {string}")
    public void page_should_display(String string)  {

        String expectedText="Subscribe Now!";
        String actualText=ramazan.subscribeNowText.getText();

        Assert.assertEquals(expectedText,actualText);


    }


    @Then("membership cards should display")
    public void membershipCardsShouldDisplay() {

        Assert.assertTrue(ramazan.bronzeButton.isDisplayed());
        Assert.assertTrue(ramazan.goldButton.isDisplayed());
        Assert.assertTrue(ramazan.silverButton.isDisplayed());


    }

    @Then("purchase button under membership cards should clickable")
    public void purchaseButtonUnderMembershipCardsShouldClickable() {



        Assert.assertTrue(ramazan.purchaseBronzeButton.isEnabled()&&ramazan.purchaseBronzeButton.isDisplayed());
        Assert.assertTrue(ramazan.purchaseGoldButton.isEnabled()&&ramazan.purchaseGoldButton.isDisplayed());
        Assert.assertTrue(ramazan.purchaseSilverButton.isEnabled()&&ramazan.purchaseSilverButton.isDisplayed());

    }
}
