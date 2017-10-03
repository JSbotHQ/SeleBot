package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.WebDriver;

public class Clear extends AbstractPage {


    String callerClassName;

    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Clear(WebDriver driver) {
        super(driver);
    }

    public Clear text() {
        callerClassName = new Exception().getStackTrace()[1].getFileName();
        return this;
    }


    public Browser from(String elementName) {

        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.findElement(callerClassName, elementName).clear();
        return browser;
    }


}
