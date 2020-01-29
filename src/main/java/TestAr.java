import PageObjects.GooglePage;
import PageObjects.OraclePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.*;

public class TestAr extends BaseTest {
@Test
    public void FirstTest() {

    GooglePage.open();
    GooglePage.fillSearchField("java oracle");
    GooglePage.clickSearhButton();
    GooglePage.clickLinkInResultsByText("Java SE Development Kit 8");

    OraclePage.clickLoadJDK();
    OraclePage.acceptAllert();
    OraclePage.setCheckerAgrrement();
    OraclePage.clickLoadJDK();

    //Assert
    wait.until(ExpectedConditions.urlContains("login"));
    Assert.assertEquals(driver.getCurrentUrl(),"https://login.oracle.com/mysso/signon.jsp");
    }
}
