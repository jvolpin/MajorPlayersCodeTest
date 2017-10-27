package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 27/10/2017.
 */
public class WhitePaperFormPage extends AbstractPage {

    @FindBy(id = "Name")
    private WebElement nameText;

    @FindBy(id = "JobTitle")
    private WebElement jobText;

    @FindBy(id = "Company")
    private WebElement companyText;

    @FindBy(id = "Email")
    private WebElement emailText;

    @FindBy(className = "Button")
    private WebElement sendButton;

    public WhitePaperFormPage(WebDriver driver) {
        super(driver);
    }

    public WhitePaperFormPage enterName(String name) {
        nameText.sendKeys(name);
        return this;
    }

    public WhitePaperFormPage enterJobDescription(String job) {
        jobText.sendKeys(job);
        return this;
    }

    public WhitePaperFormPage enterCompanyName(String company) {
        companyText.sendKeys(company);
        return this;
    }

    public WhitePaperFormPage enterEmail(String email) {
        emailText.sendKeys(email);
        return this;
    }

    public WhitePaperConfirmationPage clickSend(){
        sendButton.click();
        return new WhitePaperConfirmationPage(driver);
    }
}
