package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {
    private static WebDriver instance;

    private static Wait<WebDriver> waitInstance;

    public static WebDriver getDriver() {
        if (instance == null){
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            System.out.println("qwdqwd");
            instance = new ChromeDriver();
            instance.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        return instance;
    }

    public static Wait<WebDriver> getWait() {
        if (waitInstance == null){
            waitInstance = new FluentWait<WebDriver>(Helper.getDriver()).withMessage("Element was not found").withTimeout(Duration.ofSeconds(100));

        }
        return waitInstance;
    }

}
