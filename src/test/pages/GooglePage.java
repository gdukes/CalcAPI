import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class GooglePage {

    WebDriver driver;

    public GooglePage(WebDriver d) {
        driver = d;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "lst-ib")
    private WebElement searchBox;

    @FindBy(how = How.ID, using = "_fZl")
    private WebElement searchButton;

    @FindBy(how = How.CSS, using = "img[alt='Google'")
    private WebElement smallLogo;

    public void navigateToGoogleHomepage() {
        driver.get("https://www.google.co.uk/");
    }

    public void searchForTerm(String term) throws Throwable{
        searchBox.sendKeys(term);
        searchButton.click();
    }

    public boolean doesTitleContain(String term) {
        System.out.println(driver.getTitle());
        return driver.getTitle().contains(term);
    }
}
