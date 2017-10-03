package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.WebDriver;

public class Switch extends AbstractPage {
    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Switch(WebDriver driver) {
        super(driver);
    }


    public Switch newWindow() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }


        return this;
    }


}
