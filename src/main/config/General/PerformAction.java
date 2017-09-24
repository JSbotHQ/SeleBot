package config.General;

import config.SeleniumConfig.AbstractPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.Random;

/**
 * Created by Viral on 12/11/2016.
 */
public class PerformAction extends AbstractPage {

    protected static Wait<WebDriver> wait;
    JsonFileConfig jsonFileConfig = new JsonFileConfig();
    //boolean autoLog = jsonFileConfig.getAutoLog();


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public PerformAction(WebDriver driver) {
        super(driver);
    }







    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public String getTagName(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String ElementText = seleniumUtility.findElement(propertyFileName, elementName).getTagName();

        if (autoLog) {
            seleniumUtility.log("Tag Name of " + ElementText + " is " + ElementText);
        }
        return ElementText;
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void selectValueFromDroupDown(String propertyFileName, String elementName, String value) {

        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        if (autoLog) {
            seleniumUtility.log("Select" + value + " from " + elementName + " drop down box ");
        }

        Select dropdown = new Select(seleniumUtility.findElement(propertyFileName, elementName));

        dropdown.selectByVisibleText(value);
    }

    /**
     * @param scrollHeight hight in pixel
     */
    public void scrollingByCoordinates(int scrollHeight) {


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + scrollHeight + ")");
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void scrollingToElement(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        if (autoLog) {
            seleniumUtility.log("Scroll to the element " + elementName);
        }

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", (seleniumUtility.findElement(propertyFileName, elementName)));
    }

    /**
     *    Web Page Scrolling To Page Bottom.
     */
    public void scrollingToBottom() {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);

        if (autoLog) {
            seleniumUtility.log("Scroll to the bottom");
        }

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void scrollToElementUsingPageDownKeys(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.findElement(propertyFileName, elementName).sendKeys(Keys.PAGE_DOWN);

    }

    /**
     * Switch to new window
     */

    public void switchToNewWindow() {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */

    public void selectRandomOptionFromCombo(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        String selectedOption = "";
        WebElement selectCombo = seleniumUtility.findElement(propertyFileName, elementName);
        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));
            int index = new Random().nextInt(getAllOption.size());
            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public void stopPageLoading() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }


    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */

    public void moveToFrameWithElement(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        driver.switchTo().frame(seleniumUtility.findElement(propertyFileName, elementName));

    }

    public void browserQuit() {
        driver.quit();
    }

    public void browserClose() {
        driver.close();
    }


    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void mouseHoverOn(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        Actions action = new Actions(driver);
        action.moveToElement(seleniumUtility.findElement(propertyFileName, elementName)).build().perform();
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void rightClickOn(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        if (autoLog) {
            seleniumUtility.log("Right browser on " + elementName);
        }
        Actions action = new Actions(driver).contextClick(seleniumUtility.findElement(propertyFileName, elementName));
        action.build().perform();

    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void doubleClick(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        if (autoLog) {
            seleniumUtility.log("Double browser on " + elementName);
        }

        Actions action = new Actions(driver);
        action.doubleClick(seleniumUtility.findElement(propertyFileName, elementName)).build().perform();
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void clickAndHold(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);

        if (autoLog) {
            seleniumUtility.log("Browser and hold " + elementName);
        }

        Actions action = new Actions(driver);
        action.clickAndHold(seleniumUtility.findElement(propertyFileName, elementName)).build().perform();
    }

    /**
     * @param secs
     */
    public void pause(int secs) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        if (autoLog) {
            seleniumUtility.log("Pause for " + secs + " seconds");
        }

        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {

        }
    }

    /**
     *
     * @param propertyFileName : name of file where element is declared
     * @param elementName : name of element defined into propertyfile
     * @param text : text of element to be select
     */

    public void clickOnElementFromList(String propertyFileName, String elementName, String text) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        List<WebElement> list = seleniumUtility.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equals(text)) {
                el.click();
                break;
            }
        }

    }


    public void waitForElement(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.waitForElement(propertyFileName, elementName);
    }


    public void waitForElementToBeDisapper(String propertyFileName, String elementName) {
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.waitForElementToBeDisapper(propertyFileName, elementName);
    }
    public void openURL() {
        String URL = jsonFileConfig.getURL();
        driver.get(URL);
    }

    public void openURL(String url) {

        driver.get(url);

    }

    /**
     * Get Current Page URL.
     *
     * @return Return Current Page URL in String.
     */
    //
    public String getCurrentURL() {
        String CurrentURL = driver.getCurrentUrl();

        return CurrentURL;
    }

    /**
     * Get Current Page Source.
     *
     * @return Return Current Page Source In String.
     */
    public String getPageSource() {
        String PageSource = driver.getPageSource();

        return PageSource;
    }

    /**
     * Web Page refresh.
     */
    public void refresh() {
        driver.navigate().refresh();
    }

    /**
     * Go To Previous Page.
     */
    public void goToPreviuosPage() {
        driver.navigate().back();
    }


}
