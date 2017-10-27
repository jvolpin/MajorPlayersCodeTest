package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Juan on 27/10/2017.
 */
public class MPWait extends WebDriverWait {
    public MPWait(WebDriver driver, long timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    public void forElementVisible(WebElement element) {
        until(ExpectedConditions.visibilityOf(element));
    }
}
