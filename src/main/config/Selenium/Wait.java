package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.WebDriver;

public class Wait extends AbstractPage {
    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Wait(WebDriver driver) {
        super(driver);
    }


    public void ForElement(String elementName) {

        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.waitForElement(callerClassName, elementName);

    }


}
