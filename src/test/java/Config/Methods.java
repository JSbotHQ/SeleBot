package Config;

import Tests.LoginModule.Tests;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Viral on 11/26/2016.
 */
public class Methods {

    public static WebDriver Driver;

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
    public static WebElement className(String ClassName) {
        WebElement element = Driver.findElement(By.className(ClassName));

        return element;
    }

    /**
     * Find Web Element By CssSelector.
     *
     * @param CssSelector
     * @return Return Web Element.
     */
    public static WebElement cssSelector(String CssSelector) {
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
    public static WebElement id(String ID) {
        WebElement element = Driver.findElement(By.id(ID));

        return element;
    }

    /**
     * Find Web Element By linkText.
     *
     * @param linkText
     * @return Return Web Element.
     */
    public static WebElement linkText(String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        return element;
    }

    /**
     * Find Web Element By Name.
     *
     * @param Name
     * @return Return Web Element.
     */
    public static WebElement name(String Name) {
        WebElement element = Driver.findElement(By.name(Name));

        return element;
    }

    /**
     * Find Web Element By Partial_Link_Text.
     *
     * @param PartialLinkText
     * @return Return Web Element.
     */
    public static WebElement partialLinkText(String PartialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(PartialLinkText));

        return element;
    }

    /**
     * Find Web Element By Tag_Name.
     *
     * @param TagName
     * @return Return Web Element.
     */
    public static WebElement tagName(String TagName) {
        WebElement element = Driver.findElement(By.tagName(TagName));

        return element;
    }

    /**
     * Find Web Element By xpath.
     *
     * @param XpathExpression
     * @return Return Web Element.
     */
    public static WebElement xpath(String XpathExpression) {
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
     * @param Classname Enter Class Name In String.
     */
    public static void findByClassNameClick(String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        Element.click();

    }

    /**
     * Find Web Element By CssSelector And Click.
     *
     * @param CssSelector Enter Css Selector In String.
     */
    public static void findByCssSelectorClick(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        Element.click();

    }

    /**
     * Find Web Element By ID And Click.
     *
     * @param ID Enter Id In String.
     */
    public static void findByIdClick(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        Element.click();

    }

    /**
     * Find Web Element By linkText And Click.
     *
     * @param linkText Enter Link Text In String.
     */
    public static void findByLinkTextClick(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        Element.click();

    }

    /**
     * Find Web Element By Name And Click.
     *
     * @param Name Enter Name In String.
     */
    public static void findByMameClick(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        Element.click();
    }

    /**
     * Find Web Element By Partial_Link_Text And Click.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     */
    public static void findByPartialLinkTextClick(String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        Element.click();

    }

    /**
     * Find Web Element By Tag_Name And Click.
     *
     * @param TagName Enter Tag Name In String.
     */
    public static void findByTagNameClick(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        Element.click();

    }

    /**
     * Find Web Element By xpath And Click.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     */
    public static void findByXpathClick(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        Element.click();

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
     * @param Classname Enter Class Name In String.
     */
    public static void findByClassNameClear(String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        Element.clear();

    }

    /**
     * Find Web Element By CssSelector And Clear.
     *
     * @param CssSelector Enter Css Selector In String.
     */
    public static void findByCssSelectorClear(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        Element.clear();

    }

    /**
     * Find Web Element By ID And Clear.
     *
     * @param ID Enter ID In String.
     */
    public static void findByIdClear(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        Element.clear();

    }

    /**
     * Find Web Element By linkText And Clear.
     *
     * @param linkText Enter Lin Text In String.
     */
    public static void findByLinkTextClear(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        Element.clear();

    }

    /**
     * Find Web Element By Name And Clear.
     *
     * @param Name Enter Name In String
     */
    public static void findByNameClear(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        Element.clear();
    }

    /**
     * Find Web Element By Partial_Link_Text And Clear.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     */
    public static void findByPartialLinkTextClear(String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        Element.clear();

    }

    /**
     * Find Web Element By Tag_Name And Clear.
     *
     * @param TagName Enter Tag Name In String.
     */
    public static void findByTagNameClear(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        Element.clear();

    }

    /**
     * Find Web Element By xpath And Clear.
     *
     * @param XpathExpression Enter Xpath Expression In String..
     */
    //Find Web Element By xpath And Clear.
    public static void findByXpathClear(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        Element.clear();

    }

    /**
     * Send Text on Web Element
     *
     * @param Element  Enter Web Element.
     * @param Text    Enter Text On Web Element.
     */
    public static void SendKeys(WebElement Element, String Text) {
        Element.sendKeys(Text);
    }

    /**
     * Find Web Element By Class_Name and SendKey.
     *
     * @param Classname  Enter Class Name In String.
     * @param Text      Enter Text On Web Element.
     */
    public static void findByClassNameSendKey(String Classname, String Text) {
        WebElement Element = Driver.findElement(By.className(Classname));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By CssSelector And SendKey.
     *
     * @param CssSelector  Enter Css Selector In String.
     * @param Text        Enter Text On Web Element.
     */
    public static void findByCssSelectorSendKey(String CssSelector, String Text) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By ID And SendKey.
     *
     * @param ID  Enter ID In String.
     * @param Text Enter Text On Web Element.
     */
    public static void findByIdSendKey(String ID, String Text) {
        WebElement Element = Driver.findElement(By.id(ID));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By linkText And SendKey.
     *
     * @param linkText  Enter Link Text In String.
     * @param Text     Enter Text On Web Element.
     */
    public static void findByLinkTextSendKey(String linkText, String Text) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By Name And SendKey.
     *
     * @param Name Enter Name in String.
     * @param Text Enter Text On Web Element.
     */
    public static void findByNameSendKey(String Name, String Text) {
        WebElement Element = Driver.findElement(By.name(Name));

        Element.sendKeys(Text);
    }

    /**
     * Find Web Element By Partial_Link_Text And SendKey.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @param Text            Enter Text On Web Element.
     */
    public static void findByPartialLinkTextSendKey(String PartialLinkText, String Text) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By Tag_Name And SendKey.
     *
     * @param TagName Enter Tag Name In String.
     * @param Text    Enter Text On Web Element.
     */
    public static void findByTagNameSendKey(String TagName, String Text) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        Element.sendKeys(Text);

    }

    /**
     * Find Web Element By xpath And SendKey.
     *
     * @param XpathExpression Enter Xpath Expression In string.
     * @param Text            Enter Text On Web Element.
     */
    public static void findByXpathSendKey(String XpathExpression, String Text) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        Element.sendKeys(Text);

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
     * @param Classname Enter Class Name In String.
     * @return Return Element Text In String.
     */
    //
    public static String findByClassNameGetText(String Classname) {
        WebElement Element = Driver.findElement(By.className(Classname));

        String ElementText = Element.getText();

        return ElementText;

    }

    /**
     * Find Web Element By CssSelector And Get Element Text.
     *
     * @param CssSelector Enter Css Selector in String.
     * @return Return Element Text In String.
     */
    public static String findByCssSelectorGetText(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By ID And Get Element Text.
     *
     * @param ID Enter ID In String.
     * @return Return Element Text In String.
     */
    public static String findByIdGetText(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By linkText And Get Element Text.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Element Text In String.
     */
    public static String findByLinkTextGetText(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Name And Get Element Text.
     *
     * @param Name Enter Name In String.
     * @return Return Element Text In String.
     */
    public static String findByNameGetText(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Text.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @return Return Element Text In String.
     */
    public static String findBynPartialLinkTextGetText(String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Text.
     *
     * @param TagName Enter Tag Name in String.
     * @return Return Element Text In String.
     */
    public static String findByTagNameGetText(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        String ElementText = Element.getText();

        return ElementText;
    }

    /**
     * Find Web Element By xpath And Get Element Text.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     * @return Return Element Text In String.
     */
    public static String findByXpathGetText(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        String ElementText = Element.getText();

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
        WebElement Element = Driver.findElement(By.className(Classname));

        String ElementTagName = Element.getTagName();

        return ElementTagName;

    }

    /**
     * Find Web Element By CssSelector And Get Element Tag Name.
     *
     * @param CssSelector Enter Css Selector In String.
     * @return Return Tag Name in String.
     */
    public static String findByCssSelectorGetTagName(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By ID And Get Element Tag Name.
     *
     * @param ID Enter Id In string.
     * @return Return Tag Name in String.
     */
    public static String findByIdGetTagName(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By linkText And Get Element Tag Name.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Tag Name in String.
     */
    public static String findByLinkTextGetTagName(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Name And Get Element Tag Name.
     *
     * @param Name Enter Name In String.
     * @return Return Tag Name in String.
     */
    public static String findByNameGetTagName(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Tag Name.
     *
     * @param PartialLinkText Enter Partial Link In String.
     * @return Return Tag Name in String.
     */
    public static String findByPartialLinkTextGetTagName(String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Tag Name.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Tag Name in String.
     */
    public static String findByTagNameGetTagName(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        String ElementTagName = Element.getTagName();

        return ElementTagName;
    }

    /**
     * Find Web Element By xpath And Get Element Tag Name.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     * @return Return Tag Name in String.
     */
    public static String findByXpathGetTagName(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        String ElementTagName = Element.getTagName();

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
        WebElement Element = Driver.findElement(By.className(Classname));

        boolean Value = Element.isDisplayed();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element Displayed or not.
     *
     * @param CssSelector Enter CssSelector In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByCssSelectorElementIsDisplayed(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element Displayed or not.
     *
     * @param ID Enter ID In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByIdElementIsDisplayed(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By linkText And Get Element Displayed or not.
     *
     * @param linkText Enter Link Text.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByLinkTextElementIsDisplayed(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element Displayed or not.
     *
     * @param Name Enter Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByNameElementIsDisplayed(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Displayed or not.
     *
     * @param PartialLinkText Enter Partial Link In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByPartialLinkTextElementIsDisplayed(String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Displayed or not.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByTagNameElementIsDisplayed(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        boolean Value = Element.isDisplayed();

        return Value;
    }

    /**
     * Find Web Element By xpath And Get Element Displayed or not.
     *
     * @param XpathExpression Enter Xpath Expression In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByXpathElementIsDisplayed(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        boolean Value = Element.isDisplayed();
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
        WebElement Element = Driver.findElement(By.className(Classname));

        boolean Value = Element.isSelected();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element Selected or Not.
     *
     * @param CssSelector Enter CssSelector In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByCssSelectorElementIsSelected(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element Selected or Not.
     *
     * @param ID Enter ID In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByIdelementIsSelected(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By linkText And Get Element Selected or Not.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByLinkTextElementIsSelected(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element Selected or Not.
     *
     * @param Name Enter Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByNameElementIsSelected(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element Selected or Not.
     *
     * @param PartialLinkText Enter Partial Link Test in String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByPartialLinkTextelementIsSelected(WebDriver Driver, String PartialLinkText) {

        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element Selected or Not.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByTagNameElementIsSelected(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        boolean Value = Element.isSelected();

        return Value;
    }

    /**
     * Find Web Element By xpath And Get Element Selected or Not.
     *
     * @param XpathExpression Enter Xpath Expression in String.
     * @return Return Boolean Value (True Or False).
     */
    //
    public static boolean findByXpathElementIsSelected(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));

        boolean Value = Element.isSelected();
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
        WebElement Element = Driver.findElement(By.className(Classname));

        boolean Value = Element.isEnabled();

        return Value;

    }

    /**
     * Find Web Element By CssSelector And Get Element currently Enabled or not.
     *
     * @param CssSelector Enter CssSelector in String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByCssSelectorElementIsEnabled(String CssSelector) {
        WebElement Element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By ID And Get Element currently Enabled or not.
     *
     * @param ID Enter ID In String
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByIdIselementIsEnabled(String ID) {
        WebElement Element = Driver.findElement(By.id(ID));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By linkText And Get Element currently Enabled or not.
     *
     * @param linkText Enter Link Text In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByLinkTextElementIsEnabled(String linkText) {
        WebElement Element = Driver.findElement(By.linkText(linkText));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Name And Get Element currently Enabled or not.
     *
     * @param Name Enter Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findBynameElementIsEnabled(String Name) {
        WebElement Element = Driver.findElement(By.name(Name));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Partial_Link_Text And Get Element currently Enabled or not.
     *
     * @param PartialLinkText Enter Partial Link Text In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByPartialLinkTextElementIsEnabled(String PartialLinkText) {
        WebElement Element = Driver.findElement(By.partialLinkText(PartialLinkText));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By Tag_Name And Get Element currently Enabled or not.
     *
     * @param TagName Enter Tag Name In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByTagNameElementIsEnabled(String TagName) {
        WebElement Element = Driver.findElement(By.tagName(TagName));

        boolean Value = Element.isEnabled();

        return Value;
    }

    /**
     * Find Web Element By xpath And Get Element currently Enabled or not.
     *
     * @param XpathExpression Enter Xpath In String.
     * @return Return Boolean Value (True Or False).
     */
    public static boolean findByxpathElementIsEnabled(String XpathExpression) {
        WebElement Element = Driver.findElement(By.xpath(XpathExpression));
        boolean Value = Element.isEnabled();
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
     * @param Xpath Enter Xpath Like ".//select[contains(@id,'year')]".
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

        String Browser = PropertiesConfig.getValue("BrowserName");

        if (Browser.equalsIgnoreCase("firefox")) {

            Driver = new FirefoxDriver();
            Driver.manage().window().maximize();
            // FirefoxDriverManager.getInstance().setup();
        } else if (Browser.equalsIgnoreCase("ie8")) {

        } else if (Browser.equalsIgnoreCase("ie9")) {

        } else if (Browser.equalsIgnoreCase("ie11")) {

        } else if (Browser.equalsIgnoreCase("opera")) {

        } else if (Browser.equalsIgnoreCase("chrome")) {

            Driver = new ChromeDriver();
            Driver.manage().window().maximize();
        } else if (Browser.equalsIgnoreCase("safari")) {

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

}
