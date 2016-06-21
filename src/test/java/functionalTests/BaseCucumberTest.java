package functionalTests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * An example base class
 */
public class BaseCucumberTest
        extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public RemoteWebDriverWait wait;

    @BeforeTest
    public void setUp() {
        try {
            driver = new RemoteWebDriver(new URL("http://selgp:8b819d9d-0298-4f8f-9430-6d44e87ac7b5@ondemand.saucelabs.com:80/wd/hub"),
                    DesiredCapabilities.edge());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://es.wallapop.com");
        wait = new RemoteWebDriverWait(driver, 2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("navigator.geolocation.getCurrentPosition = function(success) { success({coords: {latitude: 50.455755, longitude: 30.511565}}); }");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WebDriver driver() {
        return driver;
    }


}
