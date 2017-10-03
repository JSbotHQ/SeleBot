package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select extends AbstractPage {


    private WebElement element;


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Select(WebDriver driver) {
        super(driver);
    }

    public Select from(String elementName) {
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        this.element = seleniumUtility.findElement(callerClassName, elementName);

        return this;
    }

    public void byVisibleText(String byVisibletext) {

        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(element);
        select.selectByVisibleText(byVisibletext);


    }

    public Select ByValue(String byValue) {

        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(element);
        select.selectByValue(byValue);
        return this;
    }

    public Select ByIndex(int byIndex) {


        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(element);
        select.selectByIndex(byIndex);

        return this;
    }


}
