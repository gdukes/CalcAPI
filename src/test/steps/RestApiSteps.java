import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RestApiSteps {

    RestAPISteps restAPI = new RestAPISteps();

    @Given("^I am a google user$")
    public void iAmAGoogleUser() throws Throwable {

    }

    @When("^I search for something using the API$")
    public void iSearchForSomethingUsingTheAPI() throws Throwable {
        restAPI.connectToAPI();
    }

    @Then("^I get the appropriate response$")
    public void iGetTheAppropriateResponse() throws Throwable {

    }

}


