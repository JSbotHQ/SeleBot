package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by user on 06-Dec-16.
 */
public class Verify extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Verify(WebDriver driver) {
        super(driver);
    }


    public void elementIsDisplayed(String fileName, String elementName) {
        boolean bool;
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        if (autoLog) {
            seleniumUtility.log("Verify " + elementName + " is displayed");
        }
        bool = seleniumUtility.findElement(fileName, elementName).isDisplayed();

        assertThat(seleniumUtility.findElement(fileName, elementName).isDisplayed()).isEqualTo(true);
    }




}
