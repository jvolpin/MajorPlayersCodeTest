import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.MPWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Juan on 27/10/2017.
 */
public class BaseTest {

    private Map<String, String> testProperties = new HashMap<String, String>();
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        getProperties();
        if (testProperties.get("browser").equals("chrome")) {
            // as this is a code test, I assume we can use only Chrome
            driver = new ChromeDriver();
        }
        //as every test is going to this URL, I'm setting it up here
        driver.manage().window().setSize(new Dimension(1980, 1200));
        driver.get(testProperties.get("baseUrl"));
    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

    private void getProperties() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("config.properties").getFile());
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration configProperties = properties.keys();

            while (configProperties.hasMoreElements()) {
                String key = (String) configProperties.nextElement();
                String value = properties.getProperty(key);
                testProperties.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}