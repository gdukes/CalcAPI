import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by Goose on 29/03/2017.
 */
public class CalcAPISteps {

    Calc.API calc;
    float result = 0.0f;


    @Given("^I have access to the Calc API$")
    public void iHaveAccessToTheCalcAPI() throws Throwable {

        calc = new Calc.API();
        System.out.println("Initialised calculator API...");
    }

    @When("^I add  (\\d+) and (\\d+)$")
    public void iAddAnd(int arg0, int arg1) throws Throwable {

        result = calc.addition(arg0, arg1);
        System.out.println("Added: " + arg0 + " and " + arg1);
    }

    @When("^I subtract (\\d+) and (\\d+)$")
    public void iSubtractAnd(int arg0, int arg1) throws Throwable {

        result = calc.subtraction(arg0, arg1);
        System.out.println("Subtracted: " + arg0 + " and " + arg1);
    }

    @When("^I multiply (\\d+) and (\\d+)$")
    public void iMultiplyAnd(int arg0, int arg1) throws Throwable {

        result = calc.multiplication(arg0, arg1);
        System.out.println("Multiplied: " + arg0 + " and " + arg1);
    }

    @When("^I divide (\\d+) and (\\d+)$")
    public void iDivideAnd(int arg0, int arg1) throws Throwable {

        result = calc.division(arg0, arg1);
        System.out.println("Divided: " + arg0 + " and " + arg1);
    }

    @Then("^the result is the (\\d+)$")
    public void theResultIsThe(int arg0) throws Throwable {

        System.out.println("Result: " + arg0);
        assert(result == arg0);
    }

}
