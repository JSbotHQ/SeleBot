package General;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.apache.commons.lang3.RandomStringUtils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.io.*;

import java.text.SimpleDateFormat;

import java.util.*;


public class General {

    /**
     * Open URL.
     *
     * @param Driver
     * @param URL    Open Entered URL Web Page.
     */
    public static void openURL(WebDriver Driver, String URL) {
        Driver.get(URL);
    }

    /**
     * Get Current Page URL.
     *
     * @param Driver
     * @return Return Current Page URL in String.
     */
    //
    public static String getCurrentURL(WebDriver Driver) {
        String CurrentURL = Driver.getCurrentUrl();

        return CurrentURL;
    }

    /**
     * Get Current Page Source.
     *
     * @param Driver
     * @return Return Current Page Source In String.
     */
    public static String getPageSource(WebDriver Driver) {
        String PageSource = Driver.getPageSource();

        return PageSource;
    }

    /**
     * Web Page refresh.
     *
     * @param Driver
     */
    public static void refresh(WebDriver Driver) {
        Driver.navigate().refresh();
    }

    /**
     * Go To Previous Page.
     *
     * @param Driver
     */
    public static void goToPreviuosPage(WebDriver Driver) {
        Driver.navigate().back();
    }


    /**
     * Find Web Element By Class_Name.
     *
     * @param Driver
     * @param ClassName
     * @return Return Web Element.
     */
    public static WebElement className(WebDriver Driver, String ClassName) {
        WebElement element = Driver.findElement(By.className(ClassName));

        return element;
    }

    /**
     * Find Web Element By CssSelector.
     *
     * @param Driver
     * @param CssSelector
     * @return Return Web Element.
     */
    public static WebElement cssSelector(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        return element;
    }

    /**
     * ram ID
     *
     * @param Driver
     * @re Find Web Element By ID.
     * @paturn Return Web Element.
     */
    public static WebElement id(WebDriver Driver, String ID) {
        WebElement element = Driver.findElement(By.id(ID));

        return element;
    }

    /**
     * Find Web Element By linkText.
     *
     * @param Driver
     * @param linkText
     * @return Return Web Element.
     */
    public static WebElement linkText(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        return element;
    }

    /**
     * Find Web Element By Name.
     *
     * @param Driver
     * @param Name
     * @return Return Web Element.
     */
    public static WebElement name(WebDriver Driver, String Name) {
        WebElement element = Driver.findElement(By.name(Name));

        return element;
    }

    /**
     * Find Web Element By Partial_Link_Text.
     *
     * @param Driver
     * @param PartialLinkText
     * @return Return Web Element.
     */
    public static WebElement partialLinkText(WebDriver Driver, String PartialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(PartialLinkText));

        return element;
    }

    /**
     * Find Web Element By Tag_Name.
     *
     * @param Driver
     * @param TagName
     * @return Return Web Element.
     */
    public static WebElement tagName(WebDriver Driver, String TagName) {
        WebElement element = Driver.findElement(By.tagName(TagName));

        return element;
    }

    /**
     * Find Web Element By xpath.
     *
     * @param Driver
     * @param XpathExpression
     * @return Return Web Element.
     */
    public static WebElement xpath(WebDriver Driver, String XpathExpression) {
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
     * @param Driver
     * @param Classname Click on Web Element.
     */
    public static void classNameClick(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        Element.click();

    }

    /**
     * Find Web Element By CssSelector And Click.
     *
     * @param Driver
     * @param CssSelector Click on Web Element.
     */
    public static void cssSelectorClick(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        Element.click();

    }

    /**
     * Find Web Element By ID And Click.
     *
     * @param Driver
     * @param ID     Click on Web Element.
     */
    public static void idClick(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        Element.click();

    }

    /**
     * Find Web Element By linkText And Click.
     *
     * @param Driver
     * @param linkText Click on Web Element.
     */
    public static void linkTextClick(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        Element.click();

    }

    /**
     * Find Web Element By Name And Click.
     *
     * @param Driver
     * @param Name   Click on Web Element.
     */
    public static void nameClick(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        Element.click();
    }

    /**
     * Find Web Element By Partial_Link_Text And Click.
     *
     * @param Driver
     * @param PartialLinkText Click on Web Element.
     */
    public static void partialLinkTextClick(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        Element.click();

    }

    /**
     * Find Web Element By Tag_Name And Click.
     *
     * @param Driver
     * @param TagName Click on Web Element.
     */
    public static void tagNameClick(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        Element.click();

    }

    /**
     * Find Web Element By xpath And Click.
     *
     * @param Driver
     * @param XpathExpression Click on Web Element.
     */
    public static void xpathClick(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        Element.click();

    }

    /**
     * Clear Web Element Text.
     *
     * @param Element Clear Web Element Text.
     */
    public static void clear(WebElement Element) {
        Element.clear();
    }

    /**
     * Find Web Element By Class_Name and Clear.
     *
     * @param Driver
     * @param Classname Clear Web Element Text.
     */
    public static void classNameClear(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        Element.clear();

    }

    /**
     * Find Web Element By CssSelector And Clear.
     *
     * @param Driver
     * @param CssSelector Clear Web Element Text.
     */
    public static void cssSelectorClear(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        Element.clear();

    }

    /**
     * Find Web Element By ID And Clear.
     *
     * @param Driver
     * @param ID     Clear Web Element Text.
     */
    public static void idClear(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        Element.clear();

    }

    /**
     * Find Web Element By linkText And Clear.
     *
     * @param Driver
     * @param linkText Clear Web Element Text.
     */
    public static void linkTextClear(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        Element.clear();

    }

    /**
     * Find Web Element By Name And Clear.
     *
     * @param Driver
     * @param Name   Clear Web Element Text.
     */
    public static void nameClear(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        Element.clear();
    }

    /**
     * Find Web Element By Partial_Link_Text And Clear.
     *
     * @param Driver
     * @param PartialLinkText Clear Web Element Text.
     */
    public static void partialLinkTextClear(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        Element.clear();

    }

    /**
     * Find Web Element By Tag_Name And Clear.
     *
     * @param Driver
     * @param TagName Clear Web Element Text.
     */
    public static void tagNameClear(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        Element.clear();

    }

    /**
     * Find Web Element By xpath And Clear.
     *
     * @param Driver
     * @param XpathExpression Clear Web Element Text.
     */
    //Find Web Element By xpath And Clear.
    public static void xpathClear(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        Element.clear();

    }

    /**
     * Send Text on Web Element
     *
     * @param Element
     * @param Text    Enter Text On Web Element.
     */
    public static void SendKeys(WebElement Element, String Text) {
        Element.sendKeys(Text);
    }

    /**
     * Find Web Element By Class_Name and SendKey.
     *
     * @param Driver
     * @param Classname
     * @param Text      Enter Text On Web Element.
     */
    public static void classNameSendKey(WebDriver Driver, String Classname, String Text) {
        WebElement Element = Driver.findElement(By.className(Classname));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By CssSelector And SendKey.
     *
     * @param Driver
     * @param CssSelector
     * @param Text        Enter Text On Web Element.
     */
    public static void cssSelectorSendKey(WebDriver Driver, String CssSelector, String Text) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By ID And SendKey.
     *
     * @param Driver
     * @param ID
     * @param Text   Enter Text On Web Element.
     */
    public static void idSendKey(WebDriver Driver, String ID, String Text) {
        WebElement Element = Driver.findElement(By.id(ID));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By linkText And SendKey.
     *
     * @param Driver
     * @param linkText
     * @param Text     Enter Text On Web Element.
     */
    public static void linkTextSendKey(WebDriver Driver, String linkText, String Text) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By Name And SendKey.
     *
     * @param Driver
     * @param Name
     * @param Text   Enter Text On Web Element.
     */
    public static void nameSendKey(WebDriver Driver, String Name, String Text) {
        WebElement Element = Driver.findElement(By.name(Name));

        Element.sendKeys(Text);
    }

    /**
     * Find Web Element By Partial_Link_Text And SendKey.
     *
     * @param Driver
     * @param PartialLinkText
     * @param Text            Enter Text On Web Element.
     */
    public static void partialLinkTextSendKey(WebDriver Driver, String PartialLinkText, String Text) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By Tag_Name And SendKey.
     *
     * @param Driver
     * @param TagName
     * @param Text    Enter Text On Web Element.
     */
    public static void TagNameSendKey(WebDriver Driver, String TagName, String Text) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By xpath And SendKey.
     *
     * @param Driver
     * @param XpathExpression
     * @param Text            Enter Text On Web Element.
     */
    public static void xpathSendKey(WebDriver Driver, String XpathExpression, String Text) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        Element.sendKeys(Text);

    }

    /**
     * Get Element Text.
     *
     * @param Element
     * @return Return Element Text In String.
     */
    public static String getText(WebElement Element) {
        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Class_Name and Get Element Text.
     *
     * @param Driver
     * @param Classname
     * @return Return Element Text In String.
     */
    //
    public static String classNameGetText(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        String ElementText = Element.getText();

        return ElementText;

    }

    /**
     * Find Web Element By CssSelector And Get Element Text.
     *
     * @param Driver
     * @param CssSelector
     * @return Return Element Text In String.
     */
    public static String cssSelectorGetText(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By ID And Get Element Text.
     *
     * @param Driver
     * @param ID
     * @return Return Element Text In String.
     */
    public static String idGetText(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By linkText And Get Element Text.
     *
     * @param Driver
     * @param linkText
     * @return Return Element Text In String.
     */
    public static String linkTextGetText(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Name And Get Element Text.
     *
     * @param Driver
     * @param Name
     * @return Return Element Text In String.
     */
    public static String nameGetText(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Text.
     *
     * @param Driver
     * @param PartialLinkText
     * @return Return Element Text In String.
     */
    public static String partialLinkTextGetText(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Text.
     *
     * @param Driver
     * @param TagName
     * @return Return Element Text In String.
     */
    public static String tagNameGetText(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By xpath And Get Element Text.
     *
     * @param Driver
     * @param XpathExpression
     * @return Return Element Text In String.
     */
    public static String xpathGetText(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Get Element Tag Name.
     *
     * @param Element
     * @return Return Tag Name in String.
     */
    public static String getTagName(WebElement Element) {
        String ElementText = Element.getTagName();

        return ElementText;
    }

    /**
     * Find Web Element By Class_Name and Get Element Tag Name.
     *
     * @param Driver
     * @param Classname
     * @return Return Tag Name in String.
     */
    public static String classNameGetTagName(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        String ElementTagName = Element.getTagName();

        return ElementTagName;

    }

    /**
     * Find Web Element By CssSelector And Get Element Tag Name.
     *
     * @param Driver
     * @param CssSelector
     * @return Return Tag Name in String.
     */
    public static String cssSelectorGetTagName(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By ID And Get Element Tag Name.
     *
     * @param Driver
     * @param ID
     * @return Return Tag Name in String.
     */
    public static String idGetTagName(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By linkText And Get Element Tag Name.
     *
     * @param Driver
     * @param linkText
     * @return Return Tag Name in String.
     */
    public static String linkTextGetTagName(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Name And Get Element Tag Name.
     *
     * @param Driver
     * @param Name
     * @return Return Tag Name in String.
     */
    public static String nameGetTagName(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Tag Name.
     *
     * @param Driver
     * @param PartialLinkText
     * @return Return Tag Name in String.
     */
    public static String partialLinkTextGetTagName(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Tag Name.
     *
     * @param Driver
     * @param TagName
     * @return Return Tag Name in String.
     */
    public static String tagNameGetTagName(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By xpath And Get Element Tag Name.
     *
     * @param Driver
     * @param XpathExpression
     * @return Return Tag Name in String.
     */
    public static String xpathGetTagName(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Get Element Displayed or not.
     *
     * @param Element
     * @return Return Boolean Value (True Or False).
     */
    public static boolean displayed(WebElement Element) {
        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Class_Name and Get Element Displayed or not.
     *
     * @param Driver
     * @param Classname
     * @return Return Boolean Value (True Or False).
     */
    public static boolean classNameDisplay(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        boolean Value = Element.isDisplayed();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element Displayed or not.
     *
     * @param Driver
     * @param CssSelector
     * @return Return Boolean Value (True Or False).
     */
    public static boolean cssSelectorDisplay(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element Displayed or not.
     *
     * @param Driver
     * @param ID
     * @return Return Boolean Value (True Or False).
     */
    public static boolean idDisplay(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By linkText And Get Element Displayed or not.
     *
     * @param Driver
     * @param linkText
     * @return Return Boolean Value (True Or False).
     */
    public static boolean linkTextDisplay(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element Displayed or not.
     *
     * @param Driver
     * @param Name
     * @return Return Boolean Value (True Or False).
     */
    public static boolean nameDisplay(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Displayed or not.
     *
     * @param Driver
     * @param PartialLinkText
     * @return Return Boolean Value (True Or False).
     */
    public static boolean partialLinkTextDisplay(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Displayed or not.
     *
     * @param Driver
     * @param TagName
     * @return Return Boolean Value (True Or False).
     */
    public static boolean tagNameDisplay(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By xpath And Get Element Displayed or not.
     *
     * @param Driver
     * @param XpathExpression
     * @return Return Boolean Value (True Or False).
     */
    public static boolean xpathDisplay(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        boolean Value = Element.isDisplayed();
        return Value;
    }

    /**
     * Get Element Selected or Not.
     *
     * @param Element
     * @return Return Boolean Value (True Or False).
     */
    public static boolean selected(WebElement Element) {
        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Class_Name and Get Element Selected or Not.
     *
     * @param Driver
     * @param Classname
     * @return Return Boolean Value (True Or False).
     */
    public static boolean classNameSelect(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        boolean Value = Element.isSelected();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element Selected or Not.
     *
     * @param Driver
     * @param CssSelector
     * @return Return Boolean Value (True Or False).
     */
    public static boolean cssSelectorSelect(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element Selected or Not.
     *
     * @param Driver
     * @param ID
     * @return Return Boolean Value (True Or False).
     */
    public static boolean idSelect(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By linkText And Get Element Selected or Not.
     *
     * @param Driver
     * @param linkText
     * @return Return Boolean Value (True Or False).
     */
    public static boolean linkTextSelect(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element Selected or Not.
     *
     * @param Driver
     * @param Name
     * @return Return Boolean Value (True Or False).
     */
    public static boolean nameSelect(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Selected or Not.
     *
     * @param Driver
     * @param PartialLinkText
     * @return Return Boolean Value (True Or False).
     */
    public static boolean partialLinkTextSelect(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Selected or Not.
     *
     * @param Driver
     * @param TagName
     * @return Return Boolean Value (True Or False).
     */
    public static boolean tagNameSelect(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By xpath And Get Element Selected or Not.
     *
     * @param Driver
     * @param XpathExpression
     * @return Return Boolean Value (True Or False).
     */
    //
    public static boolean xpathSelect(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        boolean Value = Element.isSelected();
        return Value;
    }

    /**
     * Get Element currently Enabled or not.
     *
     * @param Element
     * @return Return Boolean Value (True Or False).
     */
    public static boolean enable(WebElement Element) {
        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Class_Name and Get Element currently Enabled or not.
     *
     * @param Driver
     * @param Classname
     * @return Return Boolean Value (True Or False).
     */
    public static boolean classNameEnable(WebDriver Driver, String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        boolean Value = Element.isEnabled();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param CssSelector
     * @return Return Boolean Value (True Or False).
     */
    public static boolean cssSelectorEnable(WebDriver Driver, String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param ID
     * @return Return Boolean Value (True Or False).
     */
    public static boolean idEnable(WebDriver Driver, String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By linkText And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param linkText
     * @return Return Boolean Value (True Or False).
     */
    public static boolean linkTextEnable(WebDriver Driver, String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param Name
     * @return Return Boolean Value (True Or False).
     */
    public static boolean nameEnable(WebDriver Driver, String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param PartialLinkText
     * @return Return Boolean Value (True Or False).
     */
    public static boolean partialLinkTextEnable(WebDriver Driver, String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param TagName
     * @return Return Boolean Value (True Or False).
     */
    public static boolean tagNameEnable(WebDriver Driver, String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By xpath And Get Element currently Enabled or not.
     *
     * @param Driver
     * @param XpathExpression
     * @return Return Boolean Value (True Or False).
     */
    public static boolean xpathEnable(WebDriver Driver, String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        boolean Value = Element.isEnabled();
        return Value;
    }

    /**
     * Wait Script.
     *
     * @param secs Pause Or Sleep Script For Entered Sec.
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
     * @param Driver
     * @param Element Highlight Element With Solid Yellow Border.
     */
    //Highlight Element.
    public static void highlightElement(WebDriver Driver, WebElement Element) {

        ((JavascriptExecutor) Driver).executeScript("arguments[0].style.border = '3px solid yellow'", Element);
        pause(2);
    }

    /**
     * Read Entered Sheet All Data.
     *
     * @param FilePath
     * @param SheetNo
     * @return Return Sheet All Data In String Array.
     */
    public static ArrayList<String> readExcelSheetAllData(String FilePath, int SheetNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    DataFormatter formatter = new DataFormatter();

                    String CellData = formatter.formatCellValue(cell);

                    SheetData.add(CellData);
                }
            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return SheetData;
    }

    /**
     * Read Only Enter Row Data.
     *
     * @param FilePath
     * @param SheetNo
     * @param RowNo
     * @return Return Selected Row Data In String Array.
     */
    public static ArrayList<String> readSelectedRow(String FilePath, int SheetNo, int RowNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();


            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                if (nextRow.getRowNum() == RowNo) {

                    Iterator<Cell> cellIterator = nextRow.cellIterator();

                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        DataFormatter formatter = new DataFormatter();

                        String CellData = formatter.formatCellValue(cell);

                        SheetData.add(CellData);
                    }
                }

            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return SheetData;
    }

    /**
     * Read Only Enter Column Data.
     *
     * @param FilePath
     * @param SheetNo
     * @param ColumnNo
     * @return Return Selected Column Data In String Array.
     */
    public static ArrayList<String> readselectColumn(String FilePath, int SheetNo, int ColumnNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    if (cell.getColumnIndex() == ColumnNo) {
                        DataFormatter formatter = new DataFormatter();

                        String CellData = formatter.formatCellValue(cell);

                        SheetData.add(CellData);
                    }
                }
            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return SheetData;
    }

    /**
     * Read Only Single Cell.
     *
     * @param FilePath
     * @param SheetNo
     * @param RowNo
     * @param ColumnNo
     * @return Selected Cell Value In String.
     */
    public static String readSelectedCell(String FilePath, int SheetNo, int RowNo, int ColumnNo) {

        String CellValue = null;
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();

                if (nextRow.getRowNum() == RowNo) {
                    Iterator<Cell> cellIterator = nextRow.cellIterator();

                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        if (cell.getColumnIndex() == ColumnNo) {
                            DataFormatter formatter = new DataFormatter();

                            CellValue = formatter.formatCellValue(cell);

                        }
                    }
                }
            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return CellValue;
    }

    /**
     * Perform Alert Accept Operation.
     *
     * @param Driver Accept Or Ok Alert.
     */
    public static void alertAccept(WebDriver Driver) {
        Alert alert = Driver.switchTo().alert();
        alert.accept();
    }

    /**
     * Perform Alert Dismiss Operation.
     *
     * @param Driver Close Or Cancel Alert.
     */
    //
    public static void alertDismiss(WebDriver Driver) {
        Alert alert = Driver.switchTo().alert();
        alert.dismiss();
    }

    /**
     * Get Alert Text.
     *
     * @param Driver
     * @return Return Text On Alert.
     */
    //
    public static String getAlertText(WebDriver Driver) {
        Alert alert = Driver.switchTo().alert();
        String AlertText = alert.getText();
        return AlertText;
    }

    /**
     * Send Text On Alert.
     *
     * @param Driver
     * @param Text   Type Text On Alert.
     */
    public static void sendTextOnAlert(WebDriver Driver, String Text) {
        Alert alert = Driver.switchTo().alert();
        alert.sendKeys(Text);
    }

    /**
     * Open Mailinator Inbox.
     *
     * @param Driver
     * @param EmailAddress Redirect On Entered Email Address Inbox Page.
     */
    public static void openMailinatorInbox(WebDriver Driver, String EmailAddress) {
        pause(2);
        String emailParsed[] = EmailAddress.split("@");
        String url = "https://www.mailinator.com/inbox2.jsp?public_to=" + emailParsed + "#/#public_maildirdiv";
        Driver.get(url);
    }

    /**
     * Get Current Date And Time.
     *
     * @return Return Current Date & Time.
     */
    public static String getCurrentDateTime() {
        Date date = new Date();

        SimpleDateFormat sd = new SimpleDateFormat("MMddHHmmssSS");
        TimeZone timeZone = TimeZone.getDefault();
        Calendar cal = Calendar.getInstance(new SimpleTimeZone(timeZone.getOffset(date.getTime()), "GMT"));
        sd.setCalendar(cal);
        return sd.format(date);
    }

    /**
     * Generate Random Numeric Number.
     *
     * @param Length
     * @return Return Random Numeric String.
     */
    public static String generateRandomNumber(int Length) {

        String RandomNumber = RandomStringUtils.randomNumeric(Length);
        return RandomNumber;

    }

    /**
     * Generate Random AlphaNumeric String.
     *
     * @param Length
     * @return Return Random AlphaNumeric String.
     */
    public static String generateRandomAlphanumeric(int Length) {
        String RandomName = RandomStringUtils.randomAlphanumeric(Length);
        return RandomName;
    }


    /**
     * Generate Random AlphaBetic String.
     *
     * @param Length
     * @return Return Random Alphabetic String.
     **/
    public static String generateRandomAlphabetic(int Length) {
        String RandomName = RandomStringUtils.randomAlphabetic(Length);
        return RandomName;
    }

    /**
     * Generate Random AlphaAscii String.
     *
     * @param Length
     * @return Return Random Ascii String.
     */
    public static String generateRandomAscii(int Length) {
        String RandomAscii = RandomStringUtils.randomAscii(Length);
        return RandomAscii;
    }


    /**
     * Write String Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param Text
     */
    public static void writeStringDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, String Text) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((String) Text);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Integer Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param Number
     */
    public static void writeIntDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, int Number) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((int) Number);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Float Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param FloatNumber
     */
    public static void writeIntDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, float FloatNumber) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((float) FloatNumber);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Boolean Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param BooleanValue
     */
    public static void writeIntDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, Boolean BooleanValue) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((Boolean) BooleanValue);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write String Data On Multiple Cell.
     * Enter Stating Row Number For Start Writing On That Row.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param StartRow
     * @param StartCell
     * @param EndCell
     * @param Text
     */
    public static void writeStringDataOnMultipalCell(String FileName, int SheetNumber, int StartRow, int StartCell, int EndCell, String Text) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() >= StartRow) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((String) Text);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Integer Data On Multiple Cell.
     * Enter Stating Row Number For Start Writing On That Row.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param StartRow
     * @param StartCell
     * @param EndCell
     * @param IntegerNumber
     */
    public static void writeIntDataOnMultipalCell(String FileName, int SheetNumber, int StartRow, int StartCell, int EndCell, int IntegerNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() >= StartRow) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((int) IntegerNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Float Data On Multiple Cell.
     * Enter Stating Row Number For Start Writing On That Row.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param StartRow
     * @param StartCell
     * @param EndCell
     * @param FloatNumber
     */
    public static void writeFloatDataOnMultipalCell(String FileName, int SheetNumber, int StartRow, int StartCell, int EndCell, float FloatNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() >= StartRow) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((float) FloatNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write String Data On Multiple Cell.
     * Enter Row Number For Selecting Row in Multiple Cell Enter Text.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param RowNumber
     * @param StartCell
     * @param EndCell
     * @param Text
     */
    public static void writeStringDataOnSingleRowMultipalCell(String FileName, int SheetNumber, int RowNumber, int StartCell, int EndCell, String Text) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() == RowNumber) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((String) Text);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Integer Data On Multiple Cell.
     * Enter Row Number For Selecting Row in Multiple Cell Enter Text.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param RowNumber
     * @param StartCell
     * @param EndCell
     * @param IntegerNumber
     */
    public static void writeIntDataOnSingleRowMultipalCell(String FileName, int SheetNumber, int RowNumber, int StartCell, int EndCell, int IntegerNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() == RowNumber) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((int) IntegerNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Float Data On Multiple Cell.
     *
     * @param FileName
     * @param SheetNumber
     * @param RowNumber   Enter Row Number For Selecting Row in Multiple Cell Enter Text.
     * @param StartCell   Enter Stating and Ending Cell Number.
     * @param EndCell
     * @param FloatNumber
     */
    public static void writeFloatDataOnSingleRowMultipalCell(String FileName, int SheetNumber, int RowNumber, int StartCell, int EndCell, float FloatNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() == RowNumber) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((float) FloatNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Read Key Value into the Json File.
     *
     * @param JSonFilePath
     * @param KeyName
     * @return Return Key Value in String.
     */
    public static String readKeyValueInFile(String JSonFilePath, String KeyName) {
        JSONParser parser = new JSONParser();
        String Value = null;
        try {

            Object obj = parser.parse(new FileReader(JSonFilePath));

            JSONObject jsonObt = (JSONObject) obj;

            Value = jsonObt.get(KeyName).toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Value;
    }

    /**
     * Read JSON Object Into The Json File.
     *
     * @param JSonFilePath
     * @param ObjectKey
     * @return Return Json Object.
     */
    public static JSONObject readJsonObjectInFile(String JSonFilePath, String ObjectKey) {
        JSONParser parser = new JSONParser();
        JSONObject JsonObject = null;
        try {

            Object File = parser.parse(new FileReader(JSonFilePath));

            JSONObject jsonObt = (JSONObject) File;

            JsonObject = (JSONObject) jsonObt.get(ObjectKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonObject;
    }

    /**
     * Read Key Value Into the Json Object.
     *
     * @param JsonObject
     * @param KeyName
     * @return Return Key Value in String.
     */
    public static String readKeyValueInJsonObject(JSONObject JsonObject, String KeyName) {

        JSONObject Object = JsonObject;

        String Value = Object.get(KeyName).toString();

        return Value;
    }

    /**
     * Create and Write in Json File.
     *
     * @param FilePathDestination Enter File Destination Path Like "C:\Users\user\Desktop\ABC.json".
     * @param ObjectName
     */
    public static void writeInJsonFile(String FilePathDestination, JSONObject ObjectName) {
        try {

            FileWriter jsonFileWriter = new FileWriter(FilePathDestination);


            jsonFileWriter.write(ObjectName.toJSONString());


            jsonFileWriter.flush();

            jsonFileWriter.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }


    /**
     * Add String Data In Json.
     *
     * @param ObjectName
     * @param Key        Enter Key in string.
     * @param Value      Enter Value in String.
     */
    public static void addStringDataInJson(JSONObject ObjectName, String Key, String Value) {
        ObjectName.put(Key, Value);
    }

    /**
     * Add Integer Data In Json.
     *
     * @param ObjectName
     * @param Key        Enter Key in string.
     * @param Value      Enter Value in Integer.
     */
    public static void addIntDataInJson(JSONObject ObjectName, String Key, int Value) {
        ObjectName.put(Key, Value);
    }

    /**
     * Add Json Object In Json
     *
     * @param Final
     * @param Key             Enter Key in string.
     * @param JsonObjectValue Enter JsonObjectValue in JSONObject.
     */
    public static void addJsonObjectInJsonObject(JSONObject Final, String Key, JSONObject JsonObjectValue) {
        Final.put(Key, JsonObjectValue);
    }


    /**
     * Drop Down list find by Xpath.
     *
     * @param Driver
     * @param Xpath  Enter Xpath Like ".//select[contains(@id,'year')]".
     * @param Value  Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseXpath(WebDriver Driver, String Xpath, String Value) {
        Select dropdown = new Select(Driver.findElement(By.xpath(Xpath)));

        dropdown.selectByVisibleText(Value);
    }

    /**
     * Drop Down list find by Id.
     *
     * @param Driver
     * @param ID     Enter Id For Find Drop Down List.
     * @param Value  Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseID(WebDriver Driver, String ID, String Value) {
        Select dropdown = new Select(Driver.findElement(By.id(ID)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Id.
     *
     * @param Driver
     * @param Name   Enter Name For Find Drop Down List.
     * @param Value  Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseName(WebDriver Driver, String Name, String Value) {
        Select dropdown = new Select(Driver.findElement(By.name(Name)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Class Name.
     *
     * @param Driver
     * @param ClassName Enter ClassName For Find Drop Down List.
     * @param Value     Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseClassName(WebDriver Driver, String ClassName, String Value) {
        Select dropdown = new Select(Driver.findElement(By.className(ClassName)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By TagName
     *
     * @param Driver
     * @param TagName Enter Tag Name For Find Drop Down List.
     * @param Value   Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseTagName(WebDriver Driver, String TagName, String Value) {
        Select dropdown = new Select(Driver.findElement(By.tagName(TagName)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By TagName.
     *
     * @param Driver
     * @param LinkText Enter Link Name For Find Drop Down List.
     * @param Value    Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseLinkName(WebDriver Driver, String LinkText, String Value) {
        Select dropdown = new Select(Driver.findElement(By.linkText(LinkText)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Partial Link Text.
     *
     * @param Driver
     * @param PartialLinkText Enter Partial Link Text For Find Drop Down List.
     * @param Value           Select Value Text Enter.
     */
    public static void selectValueInDroupDownUsePartialLinkText(WebDriver Driver, String PartialLinkText, String Value) {
        Select dropdown = new Select(Driver.findElement(By.partialLinkText(PartialLinkText)));

        dropdown.selectByVisibleText(Value);

    }

    /**
     * Drop Down List Find By Css Selector.
     *
     * @param Driver
     * @param Selector Enter Css Selector For Find Drop Down List.
     * @param Value    Select Value Text Enter.
     */
    public static void selectValueInDroupDownUseCssSelector(WebDriver Driver, String Selector, String Value) {
        Select dropdown = new Select(Driver.findElement(By.cssSelector(Selector)));

        dropdown.selectByVisibleText(Value);

    }


    /**
     * Web Pace Scroll By Given Pixel Offset
     *
     * @param Driver
     * @param ScrollHeight
     */
    public static void scrollingByCoordinates(WebDriver Driver, int ScrollHeight) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver;
        jse.executeScript("window.scrollBy(0,ScrollHeight)");
    }

    /**
     * Web Page Scrolling To Web Element.
     *
     * @param Driver
     * @param element
     */
    public static void scrollingToElement(WebDriver Driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * Web Page Scrolling To Page Bottom.
     *
     * @param Driver
     */
    public static void scrollingToBottom(WebElement Driver) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    /**
     * Web Page Scrolling To Web Element Using Keys.
     *
     * @param element
     */
    public static void scrollToElementUsingKeys(WebElement element) {
        element.sendKeys(Keys.PAGE_DOWN);
    }

//-------------------------------------------------------------------------------------------------------------

    public static void browserConfig(String BrowserName) {
        if (BrowserName.equalsIgnoreCase("firefox")) {

            WebDriver driver = new FirefoxDriver();
            FirefoxDriverManager.getInstance().setup();
        } else if (BrowserName.equalsIgnoreCase("ie8")) {

        } else if (BrowserName.equalsIgnoreCase("ie9")) {

        } else if (BrowserName.equalsIgnoreCase("ie11")) {

        } else if (BrowserName.equalsIgnoreCase("opera")) {
            WebDriver driver = new OperaDriver();
            OperaDriverManager.getInstance().setup();
        } else if (BrowserName.equalsIgnoreCase("chrome")) {

            WebDriver driver = new ChromeDriver();
            ChromeDriverManager.getInstance().setup();
        } else if (BrowserName.equalsIgnoreCase("safari")) {

        }

    }

    /**
     * Print Message On Console And Reporter Screen.
     *
     * @param msg
     */
    public static void log(String msg) {

        Reporter.log(msg);
        System.out.println(msg);
    }

    /**
     * Control Switch To New Window.
     *
     * @param driver
     */
    public static void switchToNewWindow(WebDriver driver) {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
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
                // TODO Auto-generated catch block
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
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * Stop Page Loading.
     * @param driver
     */
    public static void stopPageLoading(WebDriver driver) {
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }

    /**
     * Focus Switch To Selected Frame.
     * @param driver
     * @param xpath Enter Frame Xpath.
     */
    public static void moveToFrameObjectelement(WebDriver driver, String xpath) {

        driver.switchTo().frame(driver.findElement(By.xpath(xpath)));

    }

}