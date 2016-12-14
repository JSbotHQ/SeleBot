package Config.General;

import Config.SeleniumConfig.AbstractPage;
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
    PropertiesConfig prop = new PropertiesConfig();


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public PerformAction(WebDriver driver) {
        super(driver);
    }

    public void click(String propertyFileName, String elementName)
    {
        if (autoLog.equals("on")) {
            methods.log("Click on " + elementName);

        }
        methods.findElement(propertyFileName, elementName).click();
    }

    public void sendKeys(String propertyFileName, String elementName, String text) {

        if (autoLog.equals("on")) {
            methods.log("Enter Text " + text + " into " + elementName + " text fields");

        }
        methods.findElement(propertyFileName, elementName).sendKeys(text);
    }

    public void clear(String propertyFileName, String elementName) {

        if (autoLog.equals("on")) {
            methods.log("Clear value from " + elementName + " text fields");

        }

        methods.findElement(propertyFileName, elementName).clear();
    }

    public String getText(String propertyFileName, String elementName) {

        String ElementText = methods.findElement(propertyFileName, elementName).getText();


        if (autoLog.equals("on")) {
            methods.log("Text of " + ElementText + " is " + ElementText);
        }
        return ElementText;
    }

    public String getTagName(String propertyFileName, String elementName) {
        String ElementText = methods.findElement(propertyFileName, elementName).getTagName();

        if (autoLog.equals("on")) {
            methods.log("Tag Name of " + ElementText + " is " + ElementText);
        }
        return ElementText;
    }

    public void selectValueFromDroupDown(String propertyFileName, String elementName, String value) {


        if (autoLog.equals("on")) {
            methods.log("Select" + value + " from " + elementName + " drop down box ");
        }

        Select dropdown = new Select(methods.findElement(propertyFileName, elementName));

        dropdown.selectByVisibleText(value);
    }

    public void scrollingByCoordinates(int ScrollHeight) {


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,ScrollHeight)");
    }

    public void scrollingToElement(String propertyFileName, String elementName) {

        if (autoLog.equals("on")) {
            methods.log("Scroll to the element " + elementName);
        }

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", (methods.findElement(propertyFileName, elementName)));
    }

    /**
     * Web Page Scrolling To Page Bottom.
     */
    public void scrollingToBottom() {


        if (autoLog.equals("on")) {
            methods.log("Scroll to the bottom");
        }

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToElementUsingKeys(String propertyFileName, String elementName) {
        methods.findElement(propertyFileName, elementName).sendKeys(Keys.PAGE_DOWN);
    }

    public void switchToNewWindow() {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }

    public void selectRandomOptionFromCombo(String propertyFileName, String elementName, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = methods.findElement(propertyFileName, elementName);
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
    }

    public void stopPageLoading() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }

    public void moveToFrameWithElement(String propertyFileName, String elementName) {

        driver.switchTo().frame(methods.findElement(propertyFileName, elementName));

    }

    public void browserQuit() {
        driver.quit();
    }

    public void browserClose() {
        driver.close();
    }


    public void mouseHoverOn(String propertyFileName, String elementName) {
        Actions action = new Actions(driver);
        action.moveToElement(methods.findElement(propertyFileName, elementName)).build().perform();
    }


    public void rightClickOn(String propertyFileName, String elementName) {


        if (autoLog.equals("on")) {
            methods.log("Right click on " + elementName);
        }
        Actions action = new Actions(driver).contextClick(methods.findElement(propertyFileName, elementName));
        action.build().perform();

    }

    public void doubleClick(String propertyFileName, String elementName) {

        if (autoLog.equals("on")) {
            methods.log("Double click on " + elementName);
        }

        Actions action = new Actions(driver);
        action.doubleClick(methods.findElement(propertyFileName, elementName)).build().perform();
    }

    public void clickAndHold(String propertyFileName, String elementName) {


        if (autoLog.equals("on")) {
            methods.log("Click and hold " + elementName);
        }

        Actions action = new Actions(driver);
        action.clickAndHold(methods.findElement(propertyFileName, elementName)).build().perform();
    }


    public void pause(int secs) {

        if (autoLog.equals("on")) {
            methods.log("Pause for " + secs + "seconds");
        }

        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {

        }
    }


    /**
     * @param propertyFileName
     * @param elementName
     * @param text             : element text to select
     */
    public void clickOnElementFromList(String propertyFileName, String elementName, String text) {

        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equals(text)) {

                el.click();
                break;

            }


        }


    }


    public void openURL() {
        String URL = (String) prop.getValue("general", "URL");
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
