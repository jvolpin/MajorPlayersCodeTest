package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 27/10/2017.
 */
public class WhitePaperZoomInPage extends AbstractPage {

    @FindBy(css = ".icon-wrapper>span")
    private WebElement firstRightArrow;

    @FindBy(css = ".arrow-right>span")
    private WebElement otherRightArrow;

    @FindBy(id = "spreadImage-0")
    private WebElement secondImage;

    @FindBy(id = "spreadImage-1")
    private WebElement thirdImage;

    public WhitePaperZoomInPage(WebDriver driver) {
        super(driver);
    }

    public WhitePaperFormPage goToForm(){
        wait.forElementVisible(firstRightArrow);
        firstRightArrow.click();
        wait.forElementVisible(secondImage);
        otherRightArrow.click();
        wait.forElementVisible(thirdImage);
        otherRightArrow.click();
        return new WhitePaperFormPage(driver);
    }
}
