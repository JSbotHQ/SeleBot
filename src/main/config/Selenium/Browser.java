package config.Selenium;

import config.Selebot.config.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class Browser extends AbstractPage {

    protected static Wait<WebDriver> wait;
    JsonFileConfig jsonFileConfig = new JsonFileConfig();
    //  boolean autoLog = jsonFileConfig.getAutoLog();

    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Browser(WebDriver driver) {
        super(driver);
    }


    public void openUrl() {
        driver.get(jsonFileConfig.getURL());
    }

    public void openUrl(String URL) {
        driver.get(URL);
    }


    public void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void stopPageLoading() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }
  /*

   Add all the wait related methods or crate the new class


*/


}
