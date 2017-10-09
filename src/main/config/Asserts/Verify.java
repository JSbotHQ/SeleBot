package config.Asserts;

import config.Selebot.AbstractPage;
import config.Selenium.SeleniumUtility;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by user on 06-Dec-16.
 */
public class Verify extends AbstractPage {


    private String elementName;


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver
     */
    public Verify(WebDriver driver) {
        super(driver);
    }

    public Verify element(String elementName) {

        return this;
    }

    public void IsDisplayed() {
        boolean bool;
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        assertThat(seleniumUtility.findElement(callerClassName, elementName).isDisplayed()).isEqualTo(true);
    }




}
