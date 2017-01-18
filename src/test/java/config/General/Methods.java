package config.General;

import config.SeleniumConfig.AbstractPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by Viral on 11/26/2016.
 */
public class Methods extends AbstractPage {
    protected static Wait<WebDriver> wait;

    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Methods(WebDriver driver) {
        super(driver);
    }

    /**
     * Open URL.
     * <p>
     * Open Entered URL Web Page.
     */


    public WebElement findByClassName(String ClassName) {
        WebElement element = driver.findElement(By.className(ClassName));

        return element;
    }




    /**
     * Find WebElement By CssSelector.
     *
     * @param CssSelector
     * @return Return Web Element.
     */
    public WebElement findByCssSelector(String CssSelector) {
        WebElement element = driver.findElement(By.cssSelector(CssSelector));

        return element;
    }

    /**
     * ram ID
     * <p>
     * Find Web Element By ID.
     *
     * @paturn Return Web Element.
     */
    public WebElement findById(String ID) {
        WebElement element = driver.findElement(By.id(ID));

        return element;
    }

    /**
     * Find Web Element By findByLinkText.
     *
     * @param linkText
     * @return Return Web Element.
     */
    public WebElement findByLinkText(String linkText) {
        WebElement element = driver.findElement(By.linkText(linkText));

        return element;
    }

    /**
     * Find Web Element By Name.
     *
     * @param Name
     * @return Return Web Element.
     */
    public WebElement findByName(String Name) {
        WebElement element = driver.findElement(By.name(Name));

        return element;
    }

    /**
     * Find Web Element By Partial_Link_Text.
     *
     * @param PartialLinkText
     * @return Return Web Element.
     */
    public WebElement findByPartialLinkText(String PartialLinkText) {
        WebElement element = driver.findElement(By.partialLinkText(PartialLinkText));

        return element;
    }

    /**
     * Find Web Element By Tag_Name.
     *
     * @param TagName
     * @return Return Web Element.
     */
    public WebElement findByTagName(String TagName) {
        WebElement element = driver.findElement(By.tagName(TagName));

        return element;
    }

    /**
     * Find Web Element By findByXpath.
     *
     * @param XpathExpression
     * @return Return Web Element.
     */
    public WebElement findByXpath(String XpathExpression) {
        WebElement element = driver.findElement(By.xpath(XpathExpression));

        return element;
    }


    public boolean elementIsDisplayed(WebElement Element) {
        boolean Value = Element.isDisplayed();

        return Value;
    }

    public boolean elementIsSelected(WebElement Element) {
        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Get Element currently Enabled or not.
     *
     * @param Element Enter Web Element.
     * @return Return Boolean Value (True Or False).
     */
    public boolean elementIsEnabled(WebElement Element) {
        boolean Value = Element.isEnabled();

        return Value;
    }


    /**
     * Wait Script.
     *
     * @param secs Enter Sec Value.
     *             Pause Or Sleep Script For Entered Sec.
     */
    public void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {

        }
    }

    /**
     * Highlight Element.
     *
     * @param Element Highlight Element With Solid Yellow Border.
     */
    //Highlight Element.
    public void highlightElement(WebElement Element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border = '3px solid yellow'", Element);
        pause(2);
    }


    /**
     * Perform Alert Accept Operation.
     * <p>
     * Accept Or Ok Alert.
     */
    public void alertAccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /**
     * Perform Alert Dismiss Operation.
     * <p>
     * Close Or Cancel Alert.
     */
    //
    public void alertDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    /**
     * Get Alert Text.
     *
     * @return Return Alert Text.
     */
    //
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        String AlertText = alert.getText();
        return AlertText;
    }

    /**
     * Send Text On Alert.
     *
     * @param Text Type Text On Alert.
     */
    public void sendTextOnAlert(String Text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(Text);
    }

    /**
     * Open Mailinator Inbox.
     *
     * @param EmailAddress Enter Mailinator Email Address.
     *                     Redirect On Entered Email Address Inbox Page.
     */
    public void openMailinatorInbox(String EmailAddress) {
        pause(2);
        String emailParsed[] = EmailAddress.split("@");
        String url = "https://www.mailinator.com/inbox2.jsp?public_to=" + emailParsed[0] + "#/#public_maildirdiv";
        driver.get(url);
    }

    /**
     * Get Current Date And Time.
     *
     * @return Return Current Date & Time.
     */
    public String getCurrentDateTime() {
        Date date = new Date();

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY|HH:mm:ss:SS");
        TimeZone timeZone = TimeZone.getDefault();
        Calendar cal = Calendar.getInstance(new SimpleTimeZone(timeZone.getOffset(date.getTime()), "GMT"));
        sd.setCalendar(cal);
        return sd.format(date);
    }

    /**
     * Generate Random Numeric Number.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random Numeric String.
     */
    public String generateRandomNumber(int Length) {

        String RandomNumber = RandomStringUtils.randomNumeric(Length);
        return RandomNumber;

    }

    /**
     * Generate Random AlphaNumeric String.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random AlphaNumeric String.
     */
    public String generateRandomAlphanumeric(int Length) {
        String RandomName = RandomStringUtils.randomAlphanumeric(Length);
        return RandomName;
    }


    /**
     * Generate Random AlphaBetic String.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random Alphabetic String.
     **/
    public String generateRandomAlphabetic(int Length) {
        String RandomName = RandomStringUtils.randomAlphabetic(Length);
        return RandomName;
    }

    /**
     * Generate Random AlphaAscii String.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random Ascii String.
     */
    public String generateRandomAscii(int Length) {
        String RandomAscii = RandomStringUtils.randomAscii(Length);
        return RandomAscii;
    }


    public void log(String msg) {

        Reporter.log(msg);
        System.out.println(msg);
    }


    public List<WebElement> findListOfElementsByXpath(String Xpath) {
        List<WebElement> elements = driver.findElements(By.xpath(Xpath));
        return elements;
        //WebElement element = elements.get(1);
        //element.click();
    }

    /**
     * List Of Web Elements Find By Name.
     *
     * @param Name Enter Name In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsByName(String Name) {
        List<WebElement> elements = driver.findElements(By.name(Name));
        return elements;
    }

    /**
     * List Of Web Elements Find By Id.
     *
     * @param Id Enter Id In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsById(String Id) {
        List<WebElement> elements = driver.findElements(By.id(Id));
        return elements;
    }

    /**
     * List Of Web Elements Find By Class Name.
     *
     * @param ClassName Enter Class Name In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsByClassName(String ClassName) {
        List<WebElement> elements = driver.findElements(By.className(ClassName));
        return elements;
    }

    /**
     * List Of Web Elements Find By Css Selector.
     *
     * @param CssSelector Enter Css Selector In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsByCssSelector(String CssSelector) {
        List<WebElement> elements = driver.findElements(By.cssSelector(CssSelector));
        return elements;
    }

    /**
     * List Of Web Elements Find By Link Text.
     *
     * @param LinkText Enter Link Text In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsByLinkText(String LinkText) {
        List<WebElement> elements = driver.findElements(By.linkText(LinkText));
        return elements;
    }

    /**
     * List Of Web Elements Find By Partial Link Text.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsByPartialLinkText(String PartialLinkText) {
        List<WebElement> elements = driver.findElements(By.partialLinkText(PartialLinkText));
        return elements;
    }

    /**
     * List Of Web Elements Find By Tag Name.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return List Of Web Elements.
     */
    public List<WebElement> findListOfElementsByTagName(String TagName) {
        List<WebElement> elements = driver.findElements(By.tagName(TagName));
        return elements;
    }


//----------------------------------------------------------------------------------------------------


    public void waitForElementToBeDisapper(String fileName, String elementName) {
        wait = new WebDriverWait(driver, 100);

        try {


            JsonFileConfig jsonfile = new JsonFileConfig();
            JSONObject elementProperty = jsonfile.getElementValue(fileName, elementName);

            String locatorType = (String) elementProperty.get("locatorType");
            String locatorValue = (String) elementProperty.get("locatorValue");
            WebElement element = null;

            if (locatorType.equals("xpath")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locatorValue)));
            }

            if (locatorType.equals("id")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locatorValue)));


            }

            if (locatorType.equals("className")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locatorValue)));
            }

            if (locatorType.equals("tagName")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(locatorValue)));
            }


            if (locatorType.equals("linkText")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(locatorValue)));
            }


            if (locatorType.equals("partialLinkText")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(locatorValue)));
            }


            if (locatorType.equals("name")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locatorValue)));
            }

            if (locatorType.equals("cssSelector")) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locatorValue)));
            }

        } catch (Exception e) {
        }
    }


    public void waitForElement(String fileName, String elementName) {
        wait = new WebDriverWait(driver, 600);
        try {

            JsonFileConfig jsonfile = new JsonFileConfig();
            JSONObject elementProperty = jsonfile.getElementValue(fileName, elementName);

            String locatorType = (String) elementProperty.get("locatorType");
            String locatorValue = (String) elementProperty.get("locatorValue");
            WebElement element = null;

            if (locatorType.equals("xpath")) {
                wait.until(visibilityOfElementLocated(By.xpath(locatorValue)));
            }

            if (locatorType.equals("id")) {
                wait.until(visibilityOfElementLocated(By.id(locatorValue)));
            }

            if (locatorType.equals("className")) {
                wait.until(visibilityOfElementLocated(By.className(locatorValue)));
            }

            if (locatorType.equals("tagName")) {
                wait.until(visibilityOfElementLocated(By.tagName(locatorValue)));
            }

            if (locatorType.equals("linkText")) {
                wait.until(visibilityOfElementLocated(By.linkText(locatorValue)));
            }

            if (locatorType.equals("partialLinkText")) {
                wait.until(visibilityOfElementLocated(By.partialLinkText(locatorValue)));
            }

            if (locatorType.equals("name")) {
                wait.until(visibilityOfElementLocated(By.name(locatorValue)));
            }

            if (locatorType.equals("cssSelector")) {
                wait.until(visibilityOfElementLocated(By.cssSelector(locatorValue)));
            }

        } catch (Exception e) {
        }
    }



    public WebElement findElement(String fileName, String value) {

        JsonFileConfig jsonfile = new JsonFileConfig();
        JSONObject elementProperty = jsonfile.getElementValue(fileName, value);

        String locatorType = (String) elementProperty.get("locatorType");
        String locatorValue = (String) elementProperty.get("locatorValue");

        WebElement element = null;

        if (locatorType.equals("xpath")) {
            element = findByXpath(locatorValue);
        }
        if (locatorType.equals("id")) {
            element = findById(locatorValue);
        }
        if (locatorType.equals("className")) {
            element = findByClassName(locatorValue);
        }
        if (locatorType.equals("tagName")) {
            element = findByTagName(locatorValue);
        }
        if (locatorType.equals("linkText")) {
            element = findByLinkText(locatorValue);
        }
        if (locatorType.equals("partialLinkText")) {
            element = findByPartialLinkText(locatorValue);
        }
        if (locatorType.equals("name")) {
            element = findByName(locatorValue);
        }
        if (locatorType.equals("cssSelector")) {
            element = findByCssSelector(locatorValue);
        }

        return element;
    }


    public List<WebElement> findElementList(String fileName, String elementName) {

        JsonFileConfig jsonfile = new JsonFileConfig();
        JSONObject elementProperty = jsonfile.getElementValue(fileName, elementName);

        List<WebElement> elementList = null;

        String locatorType = (String) elementProperty.get("locatorType");
        String locatorValue = (String) elementProperty.get("locatorValue");

        if (locatorType.equals("xpath")) {
            elementList = findListOfElementsByXpath(locatorValue);
        }

        if (locatorType.equals("id")) {
            elementList = findListOfElementsById(locatorValue);
        }

        if (locatorType.equals("className")) {
            elementList = findListOfElementsByClassName(locatorValue);
        }

        if (locatorType.equals("tagName")) {
            elementList = findListOfElementsByTagName(locatorValue);
        }


        if (locatorType.equals("linkText")) {
            elementList = findListOfElementsByLinkText(locatorValue);
        }

        if (locatorType.equals("partialLinkText")) {
            elementList = findListOfElementsByPartialLinkText(locatorValue);
        }

        if (locatorType.equals("name")) {
            elementList = findListOfElementsByName(locatorValue);
        }

        if (locatorType.equals("cssSelector")) {
            elementList = findListOfElementsByCssSelector(locatorValue);
        }

        return elementList;
    }


    public String getAutoText(String fileName, String elementName) {
        String text = "";

        JsonFileConfig fileConfig = new JsonFileConfig();
        JSONObject object = fileConfig.getElementValue(fileName, elementName);
        DataStore data = new DataStore();


        if ((boolean) object.get("auto")) {

            String textType = (String) object.get("textType");

            if (textType.equalsIgnoreCase("firstname")) {
                text = data.getFirstName();
            }
            if (textType.equalsIgnoreCase("lastname")) {
                text = data.getLastName();
            }
            if (textType.equalsIgnoreCase("name")) {
                text = data.getName();
            }
            if (textType.equalsIgnoreCase("namewithmiddle")) {
                text = data.getNameWithMiddle();
            }
            if (textType.equalsIgnoreCase("email")) {
                text = data.getEmail();
            }

            if (textType.equalsIgnoreCase("city")) {
                text = data.getCity();
            }

            if (textType.equalsIgnoreCase("state")) {
                text = data.getState();
            }

            if (textType.equalsIgnoreCase("country")) {
                text = data.getCountry();
            }

            if (textType.equalsIgnoreCase("zipcode")) {
                text = data.getZipCode();
            }


        } else {
            text = (String) object.get("default");
        }


        return text;
    }










}
