import Utility.Helper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    Wait<WebDriver> wait;
    @Before
    public void TestInitialize(){
        driver = Helper.getDriver();
        wait = new FluentWait<WebDriver>(driver).withMessage("Element was not found").withTimeout(Duration.ofSeconds(100));
    }

    @After
    public void TestCleanUp(){
        //driver.quit();
        //driver.close();
    }
}
