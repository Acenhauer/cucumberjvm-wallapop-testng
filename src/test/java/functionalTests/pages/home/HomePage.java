package functionalTests.pages.home;


import functionalTests.RemoteWebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private final WebDriver driver;
    private final RemoteWebDriverWait wait;
    public HomePageFactory homePage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait =
                new RemoteWebDriverWait(driver, 5);
        this.homePage = new HomePageFactory(driver);
    }

    public boolean checkIfLogoIsPresent(){
        return homePage.mainLogo.isDisplayed();
    }

    public void inputTextToSearch(String text){
        homePage.mainSearchTextBox.sendKeys(text);
    }

    public void clickOnSearchButton(){
        homePage.mainSearchButton.click();
    }
}
