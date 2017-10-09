package config.Selenium;

import config.Selebot.AbstractPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll extends AbstractPage {
    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Scroll(WebDriver driver) {
        super(driver);
    }


    public Scroll byCoordinate(String scrollHeight) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + scrollHeight + ")");
        return this;
    }


    public Scroll toElement(String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", seleniumUtility.findElement(callerClassName, elementName));
        return this;
    }

    public void scrollingToBottom() {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


}
