package config.Selenium;

import config.Selebot.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKeys extends AbstractPage {


    String text;


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public SendKeys(WebDriver driver) {
        super(driver);
    }

    public SendKeys text(String text) {
        this.text = text;

        return this;
    }


    public SendKeys on(String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        seleniumUtility.log("Browser on " + elementName);
        WebElement el = seleniumUtility.findElement(callerClassName, elementName);
        el.sendKeys(text);


        return this;
    }


}
