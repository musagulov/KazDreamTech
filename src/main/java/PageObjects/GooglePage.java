package PageObjects;



import Utility.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GooglePage {
    private static WebElement searchField;
    private static WebElement searchButton;

    public static void open(){
        Helper.getDriver().navigate().to("https://www.google.com/");
        searchField = Helper.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchButton = Helper.getDriver().findElements(By.xpath("//input[@type='submit']")).get(0);
    }

    public static void fillSearchField(String searchString) {
        searchField.sendKeys(searchString);
    }

    public static void clickSearhButton() {
        Helper.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public static void clickLinkInResultsByText(String text) {
        String xpath = "//*[contains(text(),'"+text+"')]";
        Helper.getDriver().findElement(By.xpath(xpath)).click();
    }
}
