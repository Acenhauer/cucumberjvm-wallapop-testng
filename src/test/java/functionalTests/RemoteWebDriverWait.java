package functionalTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * Wraps RemoteWebDriverWait to be used in a more convenient way and adds functionality.
 *
 * @author guillem.hernandez
 */
public class RemoteWebDriverWait extends WebDriverWait {

    private static final Logger LOGGER = Logger.getLogger("MyLogger");

    private final WebDriver driver;

    public RemoteWebDriverWait(WebDriver driver, long timeOutInSeconds) {
        super(driver, timeOutInSeconds);
        this.driver = driver;
    }

    public void pause(long milliseconds) {
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(new Duration(milliseconds, MILLISECONDS));
        } catch (InterruptedException ie) {
            LOGGER.info("Waiting finished during " + milliseconds + " milliseconds ");
        }
    }
}
