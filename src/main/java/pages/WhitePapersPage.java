package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 27/10/2017.
 */
public class WhitePapersPage extends AbstractPage {

    @FindBy(css = ".Tiles-item:nth-child(1)>a")
    private WebElement firstWhitePaper;

    public WhitePapersPage(WebDriver driver) {
        super(driver);
    }

    public WhitePaperZoomInPage clickFirstWhitePaper(){
        firstWhitePaper.click();
        return new WhitePaperZoomInPage(driver);
    }
}
