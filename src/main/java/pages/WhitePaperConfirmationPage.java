package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 27/10/2017.
 */
public class WhitePaperConfirmationPage extends AbstractPage{

    @FindBy(xpath = "id('registration-form')/fieldset[3]/div[2]/a")
    private WebElement downloadButton;

    public WhitePaperConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDownloadDisplayed(){
        wait.forElementVisible(downloadButton);
        return downloadButton.isDisplayed();
    }
}
