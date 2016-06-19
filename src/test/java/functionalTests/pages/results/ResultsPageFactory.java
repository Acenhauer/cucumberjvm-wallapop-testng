package functionalTests.pages.results;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by guillem.hernandez on 02/02/16.
 */
public class ResultsPageFactory {

    @FindBy(css = ResultsPageConstants.FIRST_ELEMENT) public WebElement firstElement;

    public ResultsPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
