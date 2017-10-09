package config.Selenium;

import config.Selebot.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Click extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Click(WebDriver driver) {
        super(driver);
    }

    public Browser on(String elementName) {
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.findElement(callerClassName, elementName).click();
        return browser;
    }

    public Browser on(WebElement el) {
        el.click();
        return browser;
    }


    public void OnElementFromList(String elementName, String text) {
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        List<WebElement> list = seleniumUtility.findElementList(callerClassName, elementName);

        for (WebElement el : list) {
            if (el.getText().equals(text)) {
                el.click();
                break;
            }
        }

    }









}
