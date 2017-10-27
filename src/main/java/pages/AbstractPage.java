package pages; /**
 * Created by Juan on 27/10/2017.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.MPWait;

public abstract class AbstractPage {

    protected WebDriver driver;
    protected MPWait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new MPWait(driver, 30);
    }
}