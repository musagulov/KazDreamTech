
import PageObjects.GooglePage;
import PageObjects.OraclePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.error.ShouldBeEqualIgnoringCase.shouldBeEqual;


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
