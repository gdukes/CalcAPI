import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class SearchSteps {

    static WebDriver driver;
    static boolean initialised = false;

    GooglePage googlePage;

    @Before("@Search")
    public void setup() {

        if (!initialised) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            initialised = true;
        }

        googlePage = new GooglePage(driver);
    }


    @Given("^I am on the Google Homepage$")
    public void iAmOnTheGoogleHomepage() throws Throwable {
        googlePage.navigateToGoogleHomepage();
    }

    @When("^I search for something$")
    public void iSearchForSomething() throws Throwable {
        googlePage.searchForTerm("snoopy");
    }

    @Then("^the appropriate results are displayed$")
    public void theAppropriateResultsAreDisplayed() throws Throwable {
        assert(googlePage.doesTitleContain("snoopy"));
    }

}
