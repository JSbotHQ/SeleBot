package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.WebDriver;

public class Get extends AbstractPage {

    String callerClassName;
    String methodName;

    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Get(WebDriver driver) {
        super(driver);
    }

    public Get text() {

        callerClassName = new Exception().getStackTrace()[1].getFileName();


        return this;
    }

    public Get tagName() {
        methodName = "tagName";

        callerClassName = new Exception().getStackTrace()[1].getFileName();

        return this;
    }


    public Get of() {
        return this;
    }

    public String element(String elementName) {

        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String callerMethod = new Exception().getStackTrace()[0].getMethodName();


        return seleniumUtility.findElement(callerClassName, elementName).getText();


    }

    public String tagName(String elementName) {

        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String callerMethod = new Exception().getStackTrace()[0].getMethodName();


        return seleniumUtility.findElement(callerClassName, elementName).getTagName();


    }


}
