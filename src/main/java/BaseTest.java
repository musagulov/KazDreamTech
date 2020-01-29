import Utility.Helper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class BaseTest {
    WebDriver driver;
    Wait<WebDriver> wait;
    @Before
    public void TestInitialize(){
        driver = Helper.getDriver();
        wait = Helper.getWait();
    }

    @After
    public void TestCleanUp(){
        driver.quit();
    }
}
