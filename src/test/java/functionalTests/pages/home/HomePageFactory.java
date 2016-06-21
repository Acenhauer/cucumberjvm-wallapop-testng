package functionalTests.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by guillem.hernandez on 02/02/16.
 */
public class HomePageFactory {

    @FindBy(css = HomePageConstants.MAIN_SEARCH_BUTTON) public WebElement mainSearchButton;
    @FindBy(xpath = HomePageConstants.MAIN_SEARCH_TEXT_BOX) public WebElement mainSearchTextBox;
    @FindBy(xpath = HomePageConstants.MAIN_LOGO) public WebElement mainLogo;

    public HomePageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
