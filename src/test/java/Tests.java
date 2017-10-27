import org.junit.Assert;
import org.testng.annotations.Test;
import pages.WhitePapersPage;

/**
 * Created by Juan on 27/10/2017.
 */
public class Tests extends BaseTest {

    @Test
    private void fillForm() {
        boolean formIsEnteredCorrectly = new WhitePapersPage(driver)
                .clickFirstWhitePaper()
                .goToForm()
                .enterName("Juan")
                .enterJobDescription("Tester")
                .enterCompanyName("R S")
                .enterEmail("juan@test.com")
                .clickSend()
                .isDownloadDisplayed();
        Assert.assertTrue(formIsEnteredCorrectly);
    }
}
