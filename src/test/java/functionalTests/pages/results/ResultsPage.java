package functionalTests.pages.results;


import functionalTests.RemoteWebDriverWait;
import org.openqa.selenium.WebDriver;


public class ResultsPage {
    private final WebDriver driver;
    private final RemoteWebDriverWait wait;
    public ResultsPageFactory homePage;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait =
                new RemoteWebDriverWait(driver, 5);
        this.homePage = new ResultsPageFactory(driver);
    }

}
