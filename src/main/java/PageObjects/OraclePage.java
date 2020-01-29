package PageObjects;
import Utility.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class OraclePage {
    public static void clickLoadJDK() {
        Helper.getDriver().findElement(By.xpath("//a[text()='jdk-8u241-windows-i586.exe']")).click();
    }

    public static void acceptAllert() {
        Helper.getDriver().switchTo().alert().accept();
    }

    public static void setCheckerAgrrement() {
        Helper.getDriver().findElement(By.cssSelector("#agreementjdk-8u241-oth-JPR-a")).click();
    }
}
