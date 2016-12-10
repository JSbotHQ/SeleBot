package Config;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by Viral on 11/26/2016.
 */
public class Methods {

    public static WebDriver Driver;

    protected static Wait<WebDriver> wait;

    /**
     * Open URL.
     * <p>
     * Open Entered URL Web Page.
     */
    public static void openURL() {
        String URL = PropertiesConfig.getValue("URL");
        Driver.get(URL);
    }

    /**
     * Get Current Page URL.
     *
     * @return Return Current Page URL in String.
     */
    //
    public static String getCurrentURL() {
        String CurrentURL = Driver.getCurrentUrl();

        return CurrentURL;
    }

    /**
     * Get Current Page Source.
     *
     * @return Return Current Page Source In String.
     */
    public static String getPageSource() {
        String PageSource = Driver.getPageSource();

        return PageSource;
    }

    /**
     * Web Page refresh.
     */
    public static void refresh() {
        Driver.navigate().refresh();
    }

    /**
     * Go To Previous Page.
     */
    public static void goToPreviuosPage() {
        Driver.navigate().back();
    }


    /**
     * Find Web Element By Class_Name.
     *
     * @param ClassName
     * @return Return Web Element.
     */
    public static WebElement findByClassName(String ClassName) {
        WebElement element = Driver.findElement(By.className(ClassName));

        return element;
    }

    /**
     * Find Web Element By CssSelector.
     *
     * @param CssSelector
     * @return Return Web Element.
     */
    public static WebElement findByCssSelector(String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        return element;
    }

    /**
     * ram ID
     * <p>
     * Find Web Element By ID.
     *
     * @paturn Return Web Element.
     */
    public static WebElement findById(String ID) {
        WebElement element = Driver.findElement(By.id(ID));

        return element;
    }

    /**
     * Find Web Element By findByLinkText.
     *
     * @param linkText
     * @return Return Web Element.
     */
    public static WebElement findByLinkText(String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        return element;
    }

    /**
     * Find Web Element By Name.
     *
     * @param Name
     * @return Return Web Element.
     */
    public static WebElement findByName(String Name) {
        WebElement element = Driver.findElement(By.name(Name));

        return element;
    }

    /**
     * Find Web Element By Partial_Link_Text.
     *
     * @param PartialLinkText
     * @return Return Web Element.
     */
    public static WebElement findByPartialLinkText(String PartialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(PartialLinkText));

        return element;
    }

    /**
     * Find Web Element By Tag_Name.
     *
     * @param TagName
     * @return Return Web Element.
     */
    public static WebElement findByTagName(String TagName) {
        WebElement element = Driver.findElement(By.tagName(TagName));

        return element;
    }

    /**
     * Find Web Element By findByXpath.
     *
     * @param XpathExpression
     * @return Return Web Element.
     */
    public static WebElement findByXpath(String XpathExpression) {
        WebElement element = Driver.findElement(By.xpath(XpathExpression));

        return element;
    }

    /**
     * Click On Web Element.
     *
     * @param Element Click on Web Element.
     */
    public static void click(WebElement Element) {
        Element.click();
    }

    /**
     * Find Web Element By Class_Name and Click.
     *
     * @param ClassName Enter Class Name In String.
     */
    public static void findByClassNameClick(String ClassName) {
        findByClassName(ClassName).click();

    }

    /**
     * Find Web Element By CssSelector And Click.
     *
     * @param CssSelector Enter Css Selector In String.
     */
    public static void findByCssSelectorClick(String CssSelector) {
        findByCssSelector(CssSelector).click();

    }

    /**
     * Find Web Element By ID And Click.
     *
     * @param ID Enter Id In String.
     */
    public static void findByIdClick(String ID) {
        findById(ID).click();

    }

    /**
     * Find Web Element By findByLinkText And Click.
     *
     * @param linkText Enter Link Text In String.
     */
    public static void findByLinkTextClick(String linkText) {
        findByLinkText(linkText).click();

    }

    /**
     * Find Web Element By Name And Click.
     *
     * @param Name Enter Name In String.
     */
    public static void findByNameClick(String Name) {
        findByName(Name).click();
    }

    /**
     * Find Web Element By Partial_Link_Text And Click.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     */
    public static void findByPartialLinkTextClick(String PartialLinkText) {
        findByPartialLinkText(PartialLinkText).click();

    }

    /**
     * Find Web Element By Tag_Name And Click.
     *
     * @param TagName Enter Tag Name In String.
     */
    public static void findByTagNameClick(String TagName) {
        findByTagName(TagName).click();

    }

    /**
     * Find Web Element By findByXpath And Click.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     */
    public static void findByXpathClick(String XpathExpression) {
        findByXpath(XpathExpression).click();

    }

    /**
     * Clear Web Element Text.
     *
     * @param Element Enter Web Element.
     */
    public static void clear(WebElement Element) {
        Element.clear();
    }

    /**
     * Find Web Element By Class_Name and Clear.
     *
     * @param ClassName Enter Class Name In String.
     */
    public static void findByClassNameClear(String ClassName) {
        findByClassName(ClassName).clear();

    }

    /**
     * Find Web Element By CssSelector And Clear.
     *
     * @param CssSelector Enter Css Selector In String.
     */
    public static void findByCssSelectorClear(String CssSelector) {

        findByCssSelector(CssSelector).clear();

    }

    /**
     * Find Web Element By ID And Clear.
     *
     * @param ID Enter ID In String.
     */
    public static void findByIdClear(String ID) {


        findById(ID).clear();

    }

    /**
     * Find Web Element By findByLinkText And Clear.
     *
     * @param linkText Enter Lin Text In String.
     */
    public static void findByLinkTextClear(String linkText) {


        findByLinkText(linkText).clear();

    }

    /**
     * Find Web Element By Name And Clear.
     *
     * @param Name Enter Name In String
     */
    public static void findByNameClear(String Name) {


        findByName(Name).clear();
    }

    /**
     * Find Web Element By Partial_Link_Text And Clear.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     */
    public static void findByPartialLinkTextClear(String PartialLinkText) {


        findByPartialLinkText(PartialLinkText).clear();

    }

    /**
     * Find Web Element By Tag_Name And Clear.
     *
     * @param TagName Enter Tag Name In String.
     */
    public static void findByTagNameClear(String TagName) {


        findByTagName(TagName).clear();

    }

    /**
     * Find Web Element By findByXpath And Clear.
     *
     * @param XpathExpression Enter Xpath Expression In String..
     */
    //Find Web Element By findByXpath And Clear.
    public static void findByXpathClear(String XpathExpression) {


        findByXpath(XpathExpression).clear();

    }

    /**
     * Send Text on Web Element
     *
     * @param Element Enter Web Element.
     * @param Text    Enter Text On Web Element.
     */
    public static void SendKeys(WebElement Element, String Text) {
        Element.sendKeys(Text);
    }

    /**
     * Find Web Element By Class_Name and SendKey.
     *
     * @param ClassName Enter Class Name In String.
     * @param Text      Enter Text On Web Element.
     */
    public static void findByClassNameSendKey(String ClassName, String Text) {


        findByClassName(ClassName).sendKeys(Text);

    }

    /**
     * Find Web Element By CssSelector And SendKey.
     *
     * @param CssSelector Enter Css Selector In String.
     * @param Text        Enter Text On Web Element.
     */
    public static void findByCssSelectorSendKey(String CssSelector, String Text) {


        findByCssSelector(CssSelector).sendKeys(Text);

    }

    /**
     * Find Web Element By ID And SendKey.
     *
     * @param ID   Enter ID In String.
     * @param Text Enter Text On Web Element.
     */
    public static void findByIdSendKey(String ID, String Text) {


        findById(ID).sendKeys(Text);

    }

    /**
     * Find Web Element By findByLinkText And SendKey.
     *
     * @param linkText Enter Link Text In String.
     * @param Text     Enter Text On Web Element.
     */
    public static void findByLinkTextSendKey(String linkText, String Text) {


        findByLinkText(linkText).sendKeys(Text);

    }

    /**
     * Find Web Element By Name And SendKey.
     *
     * @param Name Enter Name in String.
     * @param Text Enter Text On Web Element.
     */
    public static void findByNameSendKey(String Name, String Text) {


        findByName(Name).sendKeys(Text);
    }

    /**
     * Find Web Element By Partial_Link_Text And SendKey.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @param Text            Enter Text On Web Element.
     */
    public static void findByPartialLinkTextSendKey(String PartialLinkText, String Text) {


        findByPartialLinkText(PartialLinkText).sendKeys(Text);

    }

    /**
     * Find Web Element By Tag_Name And SendKey.
     *
     * @param TagName Enter Tag Name In String.
     * @param Text    Enter Text On Web Element.
     */
    public static void findByTagNameSendKey(String TagName, String Text) {


        findByTagName(TagName).sendKeys(Text);

    }

    /**
     * Find Web Element By findByXpath And SendKey.
     *
     * @param XpathExpression Enter Xpath Expression In string.
     * @param Text            Enter Text On Web Element.
     */
    public static void findByXpathSendKey(String XpathExpression, String Text) {


        findByXpath(XpathExpression).sendKeys(Text);

    }

    /**
     * Get Element Text.
     *
     * @param Element Enter Web Element.
     * @return Return Element Text In String.
     */
    public static String getText(WebElement Element) {
        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Class_Name and Get Element Text.
     *
     * @param ClassName Enter Class Name In String.
     * @return Return Element Text In String.
     */
    //
    public static String findByClassNameGetText(String ClassName) {
        

        String ElementText = findByClassName(ClassName).getText();

        return ElementText;

    }

    /**
     * Find Web Element By CssSelector And Get Element Text.
     *
     * @param CssSelector Enter Css Selector in String.
     * @return Return Element Text In String.
     */
    public static String findByCssSelectorGetText(String CssSelector) {


        String ElementText = findByCssSelector(CssSelector).getText();

        return ElementText;
    }

    /**
     * Find Web Element By ID And Get Element Text.
     *
     * @param ID Enter ID In String.
     * @return Return Element Text In String.
     */
    public static String findByIdGetText(String ID) {


        String ElementText = findById(ID).getText();

        return ElementText;
    }

    /**
     * Find Web Element By findByLinkText And Get Element Text.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Element Text In String.
     */
    public static String findByLinkTextGetText(String linkText) {


        String ElementText = findByLinkText(linkText).getText();

        return ElementText;
    }

    /**
     * Find Web Element By Name And Get Element Text.
     *
     * @param Name Enter Name In String.
     * @return Return Element Text In String.
     */
    public static String findByNameGetText(String Name) {


        String ElementText = findByName(Name).getText();

        return ElementText;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Text.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @return Return Element Text In String.
     */
    public static String findBynPartialLinkTextGetText(String PartialLinkText) {


        String ElementText = findByPartialLinkText(PartialLinkText).getText();

        return ElementText;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Text.
     *
     * @param TagName Enter Tag Name in String.
     * @return Return Element Text In String.
     */
    public static String findByTagNameGetText(String TagName) {


        String ElementText = findByTagName(TagName).getText();

        return ElementText;
    }

    /**
     * Find Web Element By findByXpath And Get Element Text.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     * @return Return Element Text In String.
     */
    public static String findByXpathGetText(String XpathExpression) {


        String ElementText = findByXpath(XpathExpression).getText();

        return ElementText;
    }

    /**
     * Get Element Tag Name.
     *
     * @param Element Enter Web Element.
     * @return Return Tag Name in String.
     */
    public static String getTagName(WebElement Element) {
        String ElementText = Element.getTagName();

        return ElementText;
    }

    /**
     * Find Web Element By Class_Name and Get Element Tag Name.
     *
     * @param Classname Enter Class Name in String.
     * @return Return Tag Name in String.
     */
    public static String findByClassNameGetTagName(String Classname) {


        String ElementTagName = findByClassName(Classname).getTagName();

        return ElementTagName;

    }

    /**
     * Find Web Element By CssSelector And Get Element Tag Name.
     *
     * @param CssSelector Enter Css Selector In String.
     * @return Return Tag Name in String.
     */
    public static String findByCssSelectorGetTagName(String CssSelector) {


        String ElementTagName = findByCssSelector(CssSelector).getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By ID And Get Element Tag Name.
     *
     * @param ID Enter Id In string.
     * @return Return Tag Name in String.
     */
    public static String findByIdGetTagName(String ID) {


        String ElementTagName = findById(ID).getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By findByLinkText And Get Element Tag Name.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Tag Name in String.
     */
    public static String findByLinkTextGetTagName(String linkText) {


        String ElementTagName = findByLinkText(linkText).getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Name And Get Element Tag Name.
     *
     * @param Name Enter Name In String.
     * @return Return Tag Name in String.
     */
    public static String findByNameGetTagName(String Name) {


        String ElementTagName = findByName(Name).getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Tag Name.
     *
     * @param PartialLinkText Enter Partial Link In String.
     * @return Return Tag Name in String.
     */
    public static String findByPartialLinkTextGetTagName(String PartialLinkText) {


        String ElementTagName = findByPartialLinkText(PartialLinkText).getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Tag Name.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Tag Name in String.
     */
    public static String findByTagNameGetTagName(String TagName) {


        String ElementTagName = findByTagName(TagName).getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By findByXpath And Get Element Tag Name.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     * @return Return Tag Name in String.
     */
    public static String findByXpathGetTagName(String XpathExpression) {


        String ElementTagName = findByXpath(XpathExpression).getTagName();

        return ElementTagName;
    }

    /**
     * Get Element Displayed or not.
     *
     * @param Element Enter Web Element.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean elementIsDisplayed(WebElement Element) {
        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Class_Name and Get Element Displayed or not.
     *
     * @param Classname Enter Class Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByClassNameElementIsDisplayed(String Classname) {


        boolean Value = findByClassName(Classname).isDisplayed();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element Displayed or not.
     *
     * @param CssSelector Enter CssSelector In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByCssSelectorElementIsDisplayed(String CssSelector) {


        boolean Value = findByCssSelector(CssSelector).isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element Displayed or not.
     *
     * @param ID Enter ID In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByIdElementIsDisplayed(String ID) {


        boolean Value = findById(ID).isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By findByLinkText And Get Element Displayed or not.
     *
     * @param linkText Enter Link Text.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByLinkTextElementIsDisplayed(String linkText) {


        boolean Value = findByLinkText(linkText).isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element Displayed or not.
     *
     * @param Name Enter Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByNameElementIsDisplayed(String Name) {


        boolean Value = findByName(Name).isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Displayed or not.
     *
     * @param PartialLinkText Enter Partial Link In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByPartialLinkTextElementIsDisplayed(String PartialLinkText) {


        boolean Value = findByPartialLinkText(PartialLinkText).isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Displayed or not.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByTagNameElementIsDisplayed(String TagName) {


        boolean Value = findByTagName(TagName).isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By findByXpath And Get Element Displayed or not.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByXpathElementIsDisplayed(String XpathExpression) {


        boolean Value = findByXpath(XpathExpression).isDisplayed();
        return Value;
    }

    /**
     * Get Element Selected or Not.
     *
     * @param Element Enter Web Element.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean elementIsSelected(WebElement Element) {
        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Class_Name and Get Element Selected or Not.
     *
     * @param Classname Enter Class Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByClassNameelementIsSelected(String Classname) {


        boolean Value = findByClassName(Classname).isSelected();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element Selected or Not.
     *
     * @param CssSelector Enter CssSelector In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByCssSelectorElementIsSelected(String CssSelector) {


        boolean Value = findByCssSelector(CssSelector).isSelected();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element Selected or Not.
     *
     * @param ID Enter ID In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByIdelementIsSelected(String ID) {


        boolean Value = findById(ID).isSelected();

        return Value;
    }

    /**
     * Find Web Element By findByLinkText And Get Element Selected or Not.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByLinkTextElementIsSelected(String linkText) {


        boolean Value = findByLinkText(linkText).isSelected();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element Selected or Not.
     *
     * @param Name Enter Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByNameElementIsSelected(String Name) {


        boolean Value = findByName(Name).isSelected();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Selected or Not.
     *
     * @param PartialLinkText Enter Partial Link Test in String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByPartialLinkTextelementIsSelected(WebDriver Driver, String PartialLinkText) {



        boolean Value = findByPartialLinkText(PartialLinkText).isSelected();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Selected or Not.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByTagNameElementIsSelected(String TagName) {


        boolean Value = findByTagName(TagName).isSelected();

        return Value;
    }

    /**
     * Find Web Element By findByXpath And Get Element Selected or Not.
     *
     * @param XpathExpression Enter Xpath Expression in String.
     * @return Return Boolean Value (True Or False).
     */
    //
    public static boolean findByXpathElementIsSelected(String XpathExpression) {


        boolean Value = findByXpath(XpathExpression).isSelected();
        return Value;
    }

    /**
     * Get Element currently Enabled or not.
     *
     * @param Element Enter Web Element.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean elementIsEnabled(WebElement Element) {
        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Class_Name and Get Element currently Enabled or not.
     *
     * @param Classname Enter Class Name in String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByClassNameElementIsEnabled(String Classname) {


        boolean Value = findByClassName(Classname).isEnabled();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element currently Enabled or not.
     *
     * @param CssSelector Enter CssSelector in String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByCssSelectorElementIsEnabled(String CssSelector) {


        boolean Value = findByCssSelector(CssSelector).isEnabled();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element currently Enabled or not.
     *
     * @param ID Enter ID In String
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByIdIselementIsEnabled(String ID) {


        boolean Value = findById(ID).isEnabled();

        return Value;
    }

    /**
     * Find Web Element By findByLinkText And Get Element currently Enabled or not.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByLinkTextElementIsEnabled(String linkText) {


        boolean Value = findByLinkText(linkText).isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element currently Enabled or not.
     *
     * @param Name Enter Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findBynameElementIsEnabled(String Name) {


        boolean Value = findByName(Name).isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element currently Enabled or not.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByPartialLinkTextElementIsEnabled(String PartialLinkText) {


        boolean Value = findByPartialLinkText(PartialLinkText).isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element currently Enabled or not.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByTagNameElementIsEnabled(String TagName) {


        boolean Value = findByTagName(TagName).isEnabled();

        return Value;
    }

    /**
     * Find Web Element By findByXpath And Get Element currently Enabled or not.
     *
     * @param XpathExpression Enter Xpath In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByxpathElementIsEnabled(String XpathExpression) {

        boolean Value = findByXpath(XpathExpression).isEnabled();
        return Value;
    }

    /**
     * Wait Script.
     *
     * @param secs Enter Sec Value.
     *             Pause Or Sleep Script For Entered Sec.
     */
    public static void pause(int secs) {
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
    public static void highlightElement(WebElement Element) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", Element);
        pause(2);
    }


    /**
     * Perform Alert Accept Operation.
     * <p>
     * Accept Or Ok Alert.
     */
    public static void alertAccept() {
        Alert alert = Driver.switchTo().alert();
        alert.accept();
    }

    /**
     * Perform Alert Dismiss Operation.
     * <p>
     * Close Or Cancel Alert.
     */
    //
    public static void alertDismiss() {
        Alert alert = Driver.switchTo().alert();
        alert.dismiss();
    }

    /**
     * Get Alert Text.
     *
     * @return Return Alert Text.
     */
    //
    public static String getAlertText() {
        Alert alert = Driver.switchTo().alert();
        String AlertText = alert.getText();
        return AlertText;
    }

    /**
     * Send Text On Alert.
     *
     * @param Text Type Text On Alert.
     */
    public static void sendTextOnAlert(String Text) {
        Alert alert = Driver.switchTo().alert();
        alert.sendKeys(Text);
    }

    /**
     * Open Mailinator Inbox.
     *
     * @param EmailAddress Enter Mailinator Email Address.
     *                     Redirect On Entered Email Address Inbox Page.
     */
    public static void openMailinatorInbox(String EmailAddress) {
        pause(2);
        String emailParsed[] = EmailAddress.split("@");
        String url = "https://www.mailinator.com/inbox2.jsp?public_to=" + emailParsed[0] + "#/#public_maildirdiv";
        Driver.get(url);
    }

    /**
     * Get Current Date And Time.
     *
     * @return Return Current Date & Time.
     */
    public static String getCurrentDateTime() {
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
    public static String generateRandomNumber(int Length) {

        String RandomNumber = RandomStringUtils.randomNumeric(Length);
        return RandomNumber;

    }

    /**
     * Generate Random AlphaNumeric String.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random AlphaNumeric String.
     */
    public static String generateRandomAlphanumeric(int Length) {
        String RandomName = RandomStringUtils.randomAlphanumeric(Length);
        return RandomName;
    }


    /**
     * Generate Random AlphaBetic String.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random Alphabetic String.
     **/
    public static String generateRandomAlphabetic(int Length) {
        String RandomName = RandomStringUtils.randomAlphabetic(Length);
        return RandomName;
    }

    /**
     * Generate Random AlphaAscii String.
     *
     * @param Length Enter String Length In Integer.
     * @return Return Random Ascii String.
     */
    public static String generateRandomAscii(int Length) {
        String RandomAscii = RandomStringUtils.randomAscii(Length);
        return RandomAscii;
    }

    /**
     * Drop Down list find by Xpath.
     *
     * @param Xpath Enter Xpath Like ".//select[contains(@findById,'year')]".
     * @param Value Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseXpath(String Xpath, String Value) {
        Select dropdown = new Select(Driver.findElement(By.xpath(Xpath)));

        dropdown.selectByVisibleText(Value);
    }

    /**
     * Drop Down list find by Id.
     *
     * @param ID    Enter Id For Find Drop Down List.
     * @param Value Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseID(String ID, String Value) {
        Select dropdown = new Select(Driver.findElement(By.id(ID)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Id.
     *
     * @param Name  Enter Name For Find Drop Down List.
     * @param Value Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseName(String Name, String Value) {
        Select dropdown = new Select(Driver.findElement(By.name(Name)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Class Name.
     *
     * @param ClassName Enter ClassName For Find Drop Down List.
     * @param Value     Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseClassName(String ClassName, String Value) {
        Select dropdown = new Select(Driver.findElement(By.className(ClassName)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By TagName
     *
     * @param TagName Enter Tag Name For Find Drop Down List.
     * @param Value   Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseTagName(String TagName, String Value) {
        Select dropdown = new Select(Driver.findElement(By.tagName(TagName)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By TagName.
     *
     * @param LinkText Enter Link Name For Find Drop Down List.
     * @param Value    Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseLinkName(String LinkText, String Value) {
        Select dropdown = new Select(Driver.findElement(By.linkText(LinkText)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Partial Link Text.
     *
     * @param PartialLinkText Enter Partial Link Text For Find Drop Down List.
     * @param Value           Select Value Text Enter.
     */
    public static void selectValueInDroupDownUsePartialLinkText(String PartialLinkText, String Value) {
        Select dropdown = new Select(Driver.findElement(By.partialLinkText(PartialLinkText)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Css Selector.
     *
     * @param Selector Enter Css Selector For Find Drop Down List.
     * @param Value    Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseCssSelector(String Selector, String Value) {
        Select dropdown = new Select(Driver.findElement(By.cssSelector(Selector)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Web Pace Scroll By Given Pixel Offset
     *
     * @param ScrollHeight Enter Scroll Height IN px.
     */
    public static void scrollingByCoordinates(int ScrollHeight) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver;
        jse.executeScript("window.scrollBy(0,ScrollHeight)");
    }

    /**
     * Web Page Scrolling To Web Element.
     *
     * @param element Enter Web Element.
     */
    public static void scrollingToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * Web Page Scrolling To Page Bottom.
     */
    public static void scrollingToBottom() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    /**
     * Web Page Scrolling To Web Element Using Keys.
     *
     * @param element Enter Web Element.
     */
    public static void scrollToElementUsingKeys(WebElement element) {
        element.sendKeys(Keys.PAGE_DOWN);
    }

    /**
     * Print Message On Console And Reporter Screen.
     *
     * @param msg Enter Message You Want To Print On Reporter Screen And Terminal.
     */
    public static void log(String msg) {

        Reporter.log(msg);
        System.out.println(msg);
    }

    /**
     * Control Switch To New Window.
     */
    public static void switchToNewWindow() {

        for (String winHandle : Driver.getWindowHandles()) {
            Driver.switchTo().window(winHandle);
        }

    }

    /**
     * Select Random Option From Combo.
     *
     * @param element Enter Combo Web Element Like.
     * @param No      How Many time you want to select Random value From Combo.
     *                You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void selectRandomOptionFromCombo(WebElement element, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = element;
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

    /**
     * Stop Page Loading.
     */
    public static void stopPageLoading() {
        Driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }

    /**
     * Focus Switch To Selected Frame.
     *
     * @param xpath Enter Frame Xpath.
     */
    public static void moveToFrameObjectelement(String xpath) {

        Driver.switchTo().frame(Driver.findElement(By.xpath(xpath)));

    }

    public static WebDriver browserConfig() {
        //WebDriver driver = null;


        DesiredCapabilities capability = null;

        String Browser = PropertiesConfig.getValue("BrowserName");

        if (Browser.equalsIgnoreCase("firefox")) {

            Driver = new FirefoxDriver();
            Driver.manage().window().maximize();
            // FirefoxDriverManager.getInstance().setup();
        } else if (Browser.equalsIgnoreCase("ie8")) {

        } else if (Browser.equalsIgnoreCase("ie9")) {

        } else if (Browser.equalsIgnoreCase("ie11")) {

            capability = DesiredCapabilities.internetExplorer();
            System.setProperty("webdriver.ie.driver",
                    ".\\src\\test\\java\\Driver\\IE11\\IEDriverServer.exe");

            capability.setBrowserName("internet explorer");
            capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capability.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            capability.setJavascriptEnabled(true);


            Driver = new InternetExplorerDriver(capability);

        } else if (Browser.equalsIgnoreCase("opera")) {
            capability = DesiredCapabilities.opera();
            System.setProperty("webdriver.opera.driver",
                    "D:\\operadriver_win64\\operadriver.exe");

            //capability.setJavascriptEnabled(true);
            //browserName = capability.getVersion();
            // osName = capability.getPlatform().getCurrent().findByName();
            //browserVersion = capability.getVersion();

            Driver = new OperaDriver(capability);

        } else if (Browser.equalsIgnoreCase("chrome")) {

            capability = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver", ".\\src\\test\\java\\Driver\\chrome\\chromedriver.exe");

            capability.setJavascriptEnabled(true);


            Driver = new ChromeDriver(capability);
            Driver.manage().window().maximize();
        } else if (Browser.equalsIgnoreCase("safari")) {

            System.setProperty("webdriver.safari.driver", ".\\src\\test\\java\\Driver\\safari\\SafariDriver.safariextz");
            //driver = new SafariDriver();
            SafariDriver profile = new SafariDriver();

            capability = DesiredCapabilities.safari();
            capability.setJavascriptEnabled(true);
            capability.setBrowserName("safari");

            Driver = new SafariDriver(capability);

        }


        return Driver;

    }


    /**
     * Quit Web Browser.
     * Also Close All Sub Tab's.
     */
    public static void browserQuit() {
        Driver.quit();
    }

    /**
     * Close Current Tab.
     */
    public static void browserClose() {
        Driver.close();
    }


    /**
     * Find Web Element By Xpath And Select Random Option From Combo.
     *
     * @param Xpath Enter Xpath.
     * @param No    How Many time you want to select Random value From Combo.
     *              You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByXpathSelectRandomOptionFromCombo(String Xpath, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByXpath(Xpath);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By Name And Select Random Option From Combo.
     *
     * @param Name Enter Name.
     * @param No   How Many time you want to select Random value From Combo.
     *             You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByNameSelectRandomOptionFromCombo(String Name, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByName(Name);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By ID And Select Random Option From Combo.
     *
     * @param ID Enter ID.
     * @param No How Many time you want to select Random value From Combo.
     *           You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByIdSelectRandomOptionFromCombo(String ID, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findById(ID);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By Class Name And Select Random Option From Combo.
     *
     * @param ClassName Enter Class Name.
     * @param No        How Many time you want to select Random value From Combo.
     *                  You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByClassNameSelectRandomOptionFromCombo(String ClassName, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByClassName(ClassName);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By Css Selector And Select Random Option From Combo.
     *
     * @param CssSelector Enter Css Selector.
     * @param No          How Many time you want to select Random value From Combo.
     *                    You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByCssSelectorSelectRandomOptionFromCombo(String CssSelector, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByCssSelector(CssSelector);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By Link Text And Select Random Option From Combo.
     *
     * @param LinkText Enter Link Text.
     * @param No       How Many time you want to select Random value From Combo.
     *                 You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByLinkTextSelectRandomOptionFromCombo(String LinkText, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByLinkText(LinkText);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By Partial Link Text And Select Random Option From Combo.
     *
     * @param PartialLinkText Enter Partial Link Text.
     * @param No              How Many time you want to select Random value From Combo.
     *                        You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByPartialLinkTextSelectRandomOptionFromCombo(String PartialLinkText, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByPartialLinkText(PartialLinkText);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Find Web Element By Tag Name And Select Random Option From Combo.
     *
     * @param Name Enter Tag Name.
     * @param No   How Many time you want to select Random value From Combo.
     *             You can Enter Like "2" They Can Select Two Time Random Value.
     */
    public static void findByTagNameSelectRandomOptionFromCombo(String Name, int No) {
        for (int i = 0; i < No; i++) {
            String selectedOption = "";
            WebElement selectCombo = findByTagName(Name);
            pause(2);
            List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));

            int index = new Random().nextInt(getAllOption.size());

            WebElement abc = getAllOption.get(index);
            selectedOption = abc.getText();
            System.out.println("Selected Option Is----====>" + selectedOption);
            abc.click();
            pause(2);
        }
    }

    /**
     * Web Element Find By Xpath And Highlight Element.
     *
     * @param Xpath Enter Xpath.
     */
    public static void findByXpathHighlightElement(String Xpath) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByXpath(Xpath));
        pause(2);
    }

    /**
     * Web Element Find By Name And Highlight Element.
     *
     * @param Name Enter Name.
     */
    public static void findByNameHighlightElement(String Name) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByName(Name));
        pause(2);
    }

    /**
     * Web Element Find By ID And Highlight Element.
     *
     * @param ID Enter ID.
     */
    public static void findByIDHighlightElement(String ID) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findById(ID));
        pause(2);
    }

    /**
     * Web Element Find By Class Name And Highlight Element.
     *
     * @param ClassName Enter Class Name.
     */
    public static void findByClassNameHighlightElement(String ClassName) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByClassName(ClassName));
        pause(2);
    }

    /**
     * Web Element Find By Css Selector And Highlight Element.
     *
     * @param CssSelector Enter Css Selector.
     */
    public static void findByCssSelectorHighlightElement(String CssSelector) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByCssSelector(CssSelector));
        pause(2);
    }

    /**
     * Web Element Find By Link Text And Highlight Element.
     *
     * @param LinkText Enter Link Text.
     */
    public static void findByLinkTextHighlightElement(String LinkText) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByLinkText(LinkText));
        pause(2);
    }

    /**
     * Web Element Find By Partial Link Text And Highlight Element.
     *
     * @param PartialLinkText Enter Partial Link Text.
     */
    public static void findByPartialLinkTextHighlightElement(String PartialLinkText) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByPartialLinkText(PartialLinkText));
        pause(2);
    }

    /**
     * Web Element Find By Tag Name And Highlight Element.
     *
     * @param TagName Enter Tag Name.
     */
    public static void findByTagNameHighlightElement(String TagName) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", findByTagName(TagName));
        pause(2);
    }

    /**
     * Web Element Find By Xpath And Wait For Element Load On Page.
     *
     * @param xpath Enter Web Element Xpath In String.
     */
    public static void waitForElementFindByXpath(String xpath) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.xpath(xpath)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Class Name And Wait For Element Load On Page.
     *
     * @param ClassName Enter Web Element Class Name In String.
     */
    public static void waitForElementFindByClassName(String ClassName) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.className(ClassName)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Css Selector And Wait For Element Load On Page.
     *
     * @param CssSlector Enter Web Element Css Selector In String.
     */
    public static void waitForElementFindByCssSelector(String CssSlector) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.cssSelector(CssSlector)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Id And Wait For Element Load On Page.
     *
     * @param ID Enter Web Element Id In String.
     */
    public static void waitForElementFindById(String ID) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.id(ID)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Name And Wait For Element Load On Page.
     *
     * @param Name Enter Web Element Name In String.
     */
    public static void waitForElementFindByName(String Name) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.name(Name)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Link Text And Wait For Element Load On Page.
     *
     * @param LinkText Enter Web Element Link Text In String.
     */
    public static void waitForElementFindByLinkText(String LinkText) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.linkText(LinkText)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Partial Link Text And Wait For Element Load On Page.
     *
     * @param PartialLinkText Enter Web Element Partial Link Text In String.
     */
    public static void waitForElementFindByPartialLinkText(String PartialLinkText) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.partialLinkText(PartialLinkText)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Tag Name And Wait For Element Load On Page.
     *
     * @param TagName Enter Web Element Tag Name In String.
     */
    public static void waitForElementFindByTagName(String TagName) {
        wait = new WebDriverWait(Driver, 600);
        try {
            wait.until(visibilityOfElementLocated(By.tagName(TagName)));
        } catch (Exception e) {
        }
    }

    /**
     * Web Element Find By Xpath And Mouse Hover Action Perform.
     *
     * @param Xpath Enter Web Element Xpath In String.
     */
    public static void mouseHoverFindByXpath(String Xpath) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByXpath(Xpath)).build().perform();
    }

    /**
     * Web Element Find By Class Name And Mouse Hover Action Perform.
     *
     * @param ClassName Enter Web Element Class Name In String.
     */
    public static void mouseHoverFindByClassName(String ClassName) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByClassName(ClassName)).build().perform();
    }

    /**
     * Web Element Find By Name And Mouse Hover Action Perform.
     *
     * @param Name Enter Web Element Name In String.
     */
    public static void mouseHoverFindByName(String Name) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByName(Name)).build().perform();
    }

    /**
     * Web Element Find By ID And Mouse Hover Action Perform.
     *
     * @param ID Enter Web Element ID In String.
     */
    public static void mouseHoverFindById(String ID) {
        Actions action = new Actions(Driver);
        action.moveToElement(findById(ID)).build().perform();
    }

    /**
     * Web Element Find By Css Selector And Mouse Hover Action Perform.
     *
     * @param CssSelector Enter Web Element Css Selector In String.
     */
    public static void mouseHoverFindByCssSelector(String CssSelector) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByCssSelector(CssSelector)).build().perform();
    }

    /**
     * Web Element Find By Link Text And Mouse Hover Action Perform.
     *
     * @param LinkText Enter Web Element Link Text In String.
     */
    public static void mouseHoverFindByLinkText(String LinkText) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByLinkText(LinkText)).build().perform();
    }

    /**
     * Web Element Find By Partial Link Text And Mouse Hover Action Perform.
     *
     * @param PartialLinkText Enter Web Element Partial Link Text In String.
     */
    public static void mouseHoverFindByPartialLinkText(String PartialLinkText) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByPartialLinkText(PartialLinkText)).build().perform();
    }

    /**
     * Web Element Find By Tag Name And Mouse Hover Action Perform.
     *
     * @param TagName Enter Web Element Tag Name In String.
     */
    public static void mouseHoverFindByTagName(String TagName) {
        Actions action = new Actions(Driver);
        action.moveToElement(findByTagName(TagName)).build().perform();
    }

    /**
     * Web Element Find By Xpath And Right Click Action Perform.
     *
     * @param Xpath Enter Web Element Xpath In String.
     */
    public static void mouseRightClickElementFindByXpath(String Xpath) {

        Actions action = new Actions(Driver).contextClick(findByXpath(Xpath));
        action.build().perform();

    }

    /**
     * Web Element Find By Name And Right Click Action Perform.
     *
     * @param Name Enter Web Element Name In String.
     */
    public static void mouseRightClickElementFindByName(String Name) {

        Actions action = new Actions(Driver).contextClick(findByName(Name));
        action.build().perform();

    }

    /**
     * Web Element Find By ID And Right Click Action Perform.
     *
     * @param ID Enter Web Element ID In String.
     */
    public static void mouseRightClickElementFindById(String ID) {

        Actions action = new Actions(Driver).contextClick(findById(ID));
        action.build().perform();

    }

    /**
     * Web Element Find By Class Name And Right Click Action Perform.
     *
     * @param ClassName Enter Web Element Class Name In String.
     */
    public static void mouseRightClickElementFindByClassName(String ClassName) {

        Actions action = new Actions(Driver).contextClick(findByClassName(ClassName));
        action.build().perform();

    }

    /**
     * Web Element Find By Css Selector And Right Click Action Perform.
     *
     * @param CssSelector Enter Web Element Css Selector In String.
     */
    public static void mouseRightClickElementFindByCssSelector(String CssSelector) {

        Actions action = new Actions(Driver).contextClick(findByCssSelector(CssSelector));
        action.build().perform();

    }

    /**
     * Web Element Find By Link Text And Right Click Action Perform.
     *
     * @param LinkText Enter Web Element Link Text In String.
     */
    public static void mouseRightClickElementFindByLinkText(String LinkText) {

        Actions action = new Actions(Driver).contextClick(findByLinkText(LinkText));
        action.build().perform();

    }

    /**
     * Web Element Find By Partial Link Text And Right Click Action Perform.
     *
     * @param PartialLinkText Enter Web Element Partial Link Text In String.
     */
    public static void mouseRightClickElementFindByPartialLinkText(String PartialLinkText) {

        Actions action = new Actions(Driver).contextClick(findByPartialLinkText(PartialLinkText));
        action.build().perform();

    }

    /**
     * Web Element Find By Tag Name And Right Click Action Perform.
     *
     * @param TagName Enter Web Element Tag Name In String.
     */
    public static void mouseRightClickElementFindByTagName(String TagName) {

        Actions action = new Actions(Driver).contextClick(findByTagName(TagName));
        action.build().perform();

    }

    /**
     * Web Element Find By Xpath And Double Click Action Perform.
     *
     * @param Xpath Enter Web Element Xpath In String.
     */
    public static void doubleClickFindByXpath(String Xpath) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByXpath(Xpath)).build().perform();
    }

    /**
     * Web Element Find By Class Name And  Double Click Action Perform.
     *
     * @param ClassName Enter Web Element Class Name In String.
     */
    public static void doubleClickFindByClassName(String ClassName) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByClassName(ClassName)).build().perform();
    }

    /**
     * Web Element Find By Name And Double Click Action Perform.
     *
     * @param Name Enter Web Element Name In String.
     */
    public static void doubleClickFindByName(String Name) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByName(Name)).build().perform();
    }

    /**
     * Web Element Find By ID And Double Click Action Perform.
     *
     * @param ID Enter Web Element ID In String.
     */
    public static void doubleClickFindById(String ID) {
        Actions action = new Actions(Driver);
        action.doubleClick(findById(ID)).build().perform();
    }

    /**
     * Web Element Find By Css Selector And Double Click Action Perform.
     *
     * @param CssSelector Enter Web Element Css Selector In String.
     */
    public static void doubleClickFindByCssSelector(String CssSelector) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByCssSelector(CssSelector)).build().perform();
    }

    /**
     * Web Element Find By Link Text And Double Click Action Perform.
     *
     * @param LinkText Enter Web Element Link Text In String.
     */
    public static void doubleClickFindByLinkText(String LinkText) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByLinkText(LinkText)).build().perform();
    }

    /**
     * Web Element Find By Partial Link Text And Double Click Action Perform.
     *
     * @param PartialLinkText Enter Web Element Partial Link Text In String.
     */
    public static void doubleClickFindByPartialLinkText(String PartialLinkText) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByPartialLinkText(PartialLinkText)).build().perform();
    }

    /**
     * Web Element Find By Tag Name And Double Click Action Perform.
     *
     * @param TagName Enter Web Element Tag Name In String.
     */
    public static void doubleClickFindByTagName(String TagName) {
        Actions action = new Actions(Driver);
        action.doubleClick(findByTagName(TagName)).build().perform();
    }

    /**
     * Web Element Find By Xpath And Click And Hold Action Perform.
     *
     * @param Xpath Enter Web Element Xpath In String.
     */
    public static void clickAndHoldFindByXpath(String Xpath) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByXpath(Xpath)).build().perform();
    }

    /**
     * Web Element Find By Class Name And  Click And Hold Action Perform.
     *
     * @param ClassName Enter Web Element Class Name In String.
     */
    public static void clickAndHoldFindByClassName(String ClassName) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByClassName(ClassName)).build().perform();
    }

    /**
     * Web Element Find By Name And Click And Hold Action Perform.
     *
     * @param Name Enter Web Element Name In String.
     */
    public static void clickAndHoldFindByName(String Name) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByName(Name)).build().perform();
    }

    /**
     * Web Element Find By ID And Click And Hold Action Perform.
     *
     * @param ID Enter Web Element ID In String.
     */
    public static void clickAndHoldFindById(String ID) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findById(ID)).build().perform();
    }

    /**
     * Web Element Find By Css Selector And Click And Hold Action Perform.
     *
     * @param CssSelector Enter Web Element Css Selector In String.
     */
    public static void clickAndHoldFindByCssSelector(String CssSelector) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByCssSelector(CssSelector)).build().perform();
    }

    /**
     * Web Element Find By Link Text And Click And Hold Action Perform.
     *
     * @param LinkText Enter Web Element Link Text In String.
     */
    public static void clickAndHoldFindByLinkText(String LinkText) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByLinkText(LinkText)).build().perform();
    }

    /**
     * Web Element Find By Partial Link Text And Click And Hold Action Perform.
     *
     * @param PartialLinkText Enter Web Element Partial Link Text In String.
     */
    public static void clickAndHoldFindByPartialLinkText(String PartialLinkText) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByPartialLinkText(PartialLinkText)).build().perform();
    }

    /**
     * Web Element Find By Tag Name And Click And Hold Action Perform.
     *
     * @param TagName Enter Web Element Tag Name In String.
     */
    public static void clickAndHoldFindByTagName(String TagName) {
        Actions action = new Actions(Driver);
        action.clickAndHold(findByTagName(TagName)).build().perform();
    }

    /**
     * List Of Web Elements Find By Xpath.
     *
     * @param Xpath Enter Xpath In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsByXpath(String Xpath) {
        List<WebElement> elements = Driver.findElements(By.xpath(Xpath));
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
    public static List<WebElement> findListOfElementsByName(String Name) {
        List<WebElement> elements = Driver.findElements(By.name(Name));
        return elements;
    }

    /**
     * List Of Web Elements Find By Id.
     *
     * @param Id Enter Id In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsById(String Id) {
        List<WebElement> elements = Driver.findElements(By.id(Id));
        return elements;
    }

    /**
     * List Of Web Elements Find By Class Name.
     *
     * @param ClassName Enter Class Name In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsByClassName(String ClassName) {
        List<WebElement> elements = Driver.findElements(By.className(ClassName));
        return elements;
    }

    /**
     * List Of Web Elements Find By Css Selector.
     *
     * @param CssSelector Enter Css Selector In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsByCssSelector(String CssSelector) {
        List<WebElement> elements = Driver.findElements(By.cssSelector(CssSelector));
        return elements;
    }

    /**
     * List Of Web Elements Find By Link Text.
     *
     * @param LinkText Enter Link Text In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsByLinkText(String LinkText) {
        List<WebElement> elements = Driver.findElements(By.linkText(LinkText));
        return elements;
    }

    /**
     * List Of Web Elements Find By Partial Link Text.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsByPartialLinkText(String PartialLinkText) {
        List<WebElement> elements = Driver.findElements(By.partialLinkText(PartialLinkText));
        return elements;
    }

    /**
     * List Of Web Elements Find By Tag Name.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return List Of Web Elements.
     */
    public static List<WebElement> findListOfElementsByTagName(String TagName) {
        List<WebElement> elements = Driver.findElements(By.tagName(TagName));
        return elements;
    }

    /**
     * Print Web Element Text Of All Elements Into The List.
     *
     * @param elements Enter Web Elements List.
     */
    public static void printTextOfAllElementsInList(List<WebElement> elements) {
        for (WebElement element : elements) {
            System.out.println("Element Test Is : " + element.getText());
        }
    }

    /**
     * Web Elements Find By Xpath And Select Single Element Into the List.
     *
     * @param Xpath Enter Xpath In String.
     * @param Index Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByXpathAndSelectElement(String Xpath, int Index) {
        WebElement element = findListOfElementsByXpath(Xpath).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Name And Select Single Element Into the List.
     *
     * @param Name  Enter Name In String.
     * @param Index Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByNameAndSelectElement(String Name, int Index) {
        WebElement element = findListOfElementsByName(Name).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Id And Select Single Element Into the List.
     *
     * @param ID    Enter Id In String.
     * @param Index Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByIdAndSelectElement(String ID, int Index) {
        WebElement element = findListOfElementsById(ID).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Class Name And Select Single Element Into the List.
     *
     * @param ClassName Enter Class Name In String.
     * @param Index     Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByClassNameAndSelectElement(String ClassName, int Index) {
        WebElement element = findListOfElementsByClassName(ClassName).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Class Name And Select Single Element Into the List.
     *
     * @param CssSelector Enter Css Selector In String.
     * @param Index       Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByCssSelectorAndSelectElement(String CssSelector, int Index) {
        WebElement element = findListOfElementsByCssSelector(CssSelector).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Link Text And Select Single Element Into the List.
     *
     * @param LinkText Enter Link Text In String.
     * @param Index    Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByLinkTextAndSelectElement(String LinkText, int Index) {
        WebElement element = findListOfElementsByLinkText(LinkText).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Partial Link Text And Select Single Element Into the List.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @param Index           Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByPartialLinkTextAndSelectElement(String PartialLinkText, int Index) {
        WebElement element = findListOfElementsByPartialLinkText(PartialLinkText).get(Index);
        return element;
    }

    /**
     * Web Elements Find By Tag Name And Select Single Element Into the List.
     *
     * @param TagName Enter Tag Name In String.
     * @param Index   Select Index Value Want To Find Element Into The List.
     * @return Return Selected Web Element.
     */
    public static WebElement findElementsByTagNameSelectElement(String TagName, int Index) {
        WebElement element = findListOfElementsByTagName(TagName).get(Index);
        return element;
    }



}
