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

        System.out.println(me);

        me.findElement(propertyFileName, elementName).click();


    }

    public void sendKeys(String propertyFileName, String elementName, String text) {

        me.findElement(propertyFileName, elementName).sendKeys(text);
    }

    public void clear(String propertyFileName, String elementName) {
        me.findElement(propertyFileName, elementName).clear();
    }

    public String getText(String propertyFileName, String elementName) {
        String ElementText = me.findElement(propertyFileName, elementName).getText();

        return ElementText;
    }

    public String getTagName(String propertyFileName, String elementName) {
        String ElementText = me.findElement(propertyFileName, elementName).getTagName();

        return ElementText;
    }

    public void selectValueFromDroupDown(String propertyFileName, String elementName, String value) {
        Select dropdown = new Select(me.findElement(propertyFileName, elementName));

        dropdown.selectByVisibleText(value);
    }

    public void scrollingByCoordinates(int ScrollHeight) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,ScrollHeight)");
    }

    public void scrollingToElement(String propertyFileName, String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", (me.findElement(propertyFileName, elementName)));
    }

    /**
     * Web Page Scrolling To Page Bottom.
     */
    public void scrollingToBottom() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToElementUsingKeys(String propertyFileName, String elementName) {
        me.findElement(propertyFileName, elementName).sendKeys(Keys.PAGE_DOWN);
    }

    public void switchToNewWindow() {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }

    public void selectRandomOptionFromCombo(String propertyFileName, String elementName, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = me.findElement(propertyFileName, elementName);
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

        driver.switchTo().frame(me.findElement(propertyFileName, elementName));

    }

    public void browserQuit() {
        driver.quit();
    }

    public void browserClose() {
        driver.close();
    }


    public void mouseHoverOn(String propertyFileName, String elementName) {
        Actions action = new Actions(driver);
        action.moveToElement(me.findElement(propertyFileName, elementName)).build().perform();
    }


    public void rightClickOn(String propertyFileName, String elementName) {

        Actions action = new Actions(driver).contextClick(me.findElement(propertyFileName, elementName));
        action.build().perform();

    }

    public void doubleClickFindByXpath(String propertyFileName, String elementName) {
        Actions action = new Actions(driver);
        action.doubleClick(me.findElement(propertyFileName, elementName)).build().perform();
    }

    public void clickAndHold(String propertyFileName, String elementName) {
        Actions action = new Actions(driver);
        action.clickAndHold(me.findElement(propertyFileName, elementName)).build().perform();
    }


    public void pause(int secs) {
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

        List<WebElement> list = me.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equals(text)) {

                el.click();


            }


        }


    }


}
