package stepdefinitions;

import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.LoggerHelper;

public class InstuLearnStepDefinitions {

    private static final Logger log = LoggerFactory.getLogger(InstuLearnStepDefinitions.class);
    LoggerHelper loggerHelper=new LoggerHelper();

    @Given("user goes to {string}")
    public void user_goes_to(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("instuLearnUrl"));
        log.info("TEST BASLADI KOCUM");


    }
    @When("user scrolls the page until {string} text")
    public void user_scrolls_the_page_until_text(String string) {

    }
    @When("user waits {string} seconds")
    public void user_waits_seconds(String string) {

    }
    @Then("page should display {string}")
    public void page_should_display(String string) {


    }











}
