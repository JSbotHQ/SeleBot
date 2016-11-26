package Object;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;

public class General {

    //Open URL.
    public static void OpenURL(WebDriver Driver, String URL) {
        Driver.get(URL);
    }

    //Get Current Page URL.
    public static String GetCurrentURL(WebDriver Driver) {
        String CurrentURL = Driver.getCurrentUrl();

        return CurrentURL;
    }

    //Get Current Page Source.
    public static String GetPageSource(WebDriver Driver) {
        String PageSource = Driver.getPageSource();

        return PageSource;
    }

    //Page refresh.
    public static void refresh(WebDriver driver) {
        driver.navigate().refresh();
    }

    //Go To Previous Page.
    public static void goToPreviuosPage(WebDriver driver) {
        driver.navigate().back();
    }


    //Find Web Element By Class_Name.
    public static WebElement ClassName(WebDriver Driver, String classname) {
        WebElement element = Driver.findElement(By.className(classname));

        return element;
    }

    //Find Web Element By CssSelector.
    public static WebElement CssSelector(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        return element;
    }

    //Find Web Element By ID.
    public static WebElement Id(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        return element;
    }

    //Find Web Element By linkText.
    public static WebElement linkText(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        return element;
    }

    //Find Web Element By Name.
    public static WebElement name(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        return element;
    }

    //Find Web Element By Partial_Link_Text.
    public static WebElement partialLinkText(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        return element;
    }

    //Find Web Element By Tag_Name.
    public static WebElement tagName(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        return element;
    }

    //Find Web Element By xpath.
    public static WebElement xpath(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        return element;
    }

    //Click On Web Element.
    public static void click(WebElement element) {
        element.click();
    }

    //Find Web Element By Class_Name and Click.
    public static void ClassNameClick(WebDriver Driver, String classname) {
        WebElement element = Driver.findElement(By.className(classname));

        element.click();

    }

    //Find Web Element By CssSelector And Click.
    public static void CssSelectorClick(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        element.click();

    }

    //Find Web Element By ID And Click.
    public static void IdClick(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        element.click();

    }

    //Find Web Element By linkText And Click.
    public static void linkTextClick(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        element.click();

    }

    //Find Web Element By Name And Click.
    public static void NameClick(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        element.click();
    }

    //Find Web Element By Partial_Link_Text And Click.
    public static void PartialLinkTextClick(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        element.click();

    }

    //Find Web Element By Tag_Name And Click.
    public static void TagNameClick(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        element.click();

    }

    //Find Web Element By xpath And Click.
    public static void XpathClick(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        element.click();

    }

    //Clear Web Element Text.
    public static void clear(WebElement element) {
        element.clear();
    }

    //Find Web Element By Class_Name and Clear.
    public static void ClassNameClear(WebDriver Driver, String Classname) {
        WebElement element = Driver.findElement(By.className(Classname));

        element.clear();

    }

    //Find Web Element By CssSelector And Clear.
    public static void CssSelectorClear(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        element.clear();

    }

    //Find Web Element By ID And Clear.
    public static void IdClear(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        element.clear();

    }

    //Find Web Element By linkText And Clear.
    public static void linkTextClear(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        element.clear();

    }

    //Find Web Element By Name And Clear.
    public static void NameClear(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        element.clear();
    }

    //Find Web Element By Partial_Link_Text And Clear.
    public static void PartialLinkTextClear(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        element.clear();

    }

    //Find Web Element By Tag_Name And Clear.
    public static void TagNameClear(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        element.clear();

    }

    //Find Web Element By xpath And Clear.
    public static void XpathClear(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        element.clear();

    }

    //Send Text on Web Element
    public static void SendKeys(WebElement element, String Text) {
        element.sendKeys(Text);
    }

    //Find Web Element By Class_Name and SendKey.
    public static void ClassNameSendKey(WebDriver Driver, String Classname, String Text) {
        WebElement element = Driver.findElement(By.className(Classname));

        element.sendKeys(Text);

    }

    //Find Web Element By CssSelector And SendKey.
    public static void CssSelectorSendKey(WebDriver Driver, String CssSelector, String Text) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        element.sendKeys(Text);

    }

    //Find Web Element By ID And SendKey.
    public static void IdSendKey(WebDriver Driver, String id, String Text) {
        WebElement element = Driver.findElement(By.id(id));

        element.sendKeys(Text);

    }

    //Find Web Element By linkText And SendKey.
    public static void linkTextSendKey(WebDriver Driver, String linkText, String Text) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        element.sendKeys(Text);

    }

    //Find Web Element By Name And SendKey.
    public static void NameSendKey(WebDriver Driver, String name, String Text) {
        WebElement element = Driver.findElement(By.name(name));

        element.sendKeys(Text);
    }

    //Find Web Element By Partial_Link_Text And SendKey.
    public static void PartialLinkTextSendKey(WebDriver Driver, String partialLinkText, String Text) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        element.sendKeys(Text);

    }

    //Find Web Element By Tag_Name And SendKey.
    public static void TagNameSendKey(WebDriver Driver, String tagName, String Text) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        element.sendKeys(Text);

    }

    //Find Web Element By xpath And SendKey.
    public static void XpathSendKey(WebDriver Driver, String xpathExpression, String Text) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        element.sendKeys(Text);

    }

    //Get Element Text.
    public static String GetText(WebElement element) {
        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By Class_Name and Get Element Text.
    public static String ClassNameGetText(WebDriver Driver, String Classname) {
        WebElement element = Driver.findElement(By.className(Classname));

        String ElementText = element.getText();

        return ElementText;

    }

    //Find Web Element By CssSelector And Get Element Text.
    public static String CssSelectorGetText(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By ID And Get Element Text.
    public static String IdGetText(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By linkText And Get Element Text.
    public static String linkTextGetText(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By Name And Get Element Text.
    public static String NameGetText(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By Partial_Link_Text And Get Element Text.
    public static String PartialLinkTextGetText(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By Tag_Name And Get Element Text.
    public static String TagNameGetText(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        String ElementText = element.getText();

        return ElementText;
    }

    //Find Web Element By xpath And Get Element Text.
    public static String XpathGetText(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        String ElementText = element.getText();

        return ElementText;
    }

    //Get Element Tag Name.
    public static String GetTagName(WebElement element) {
        String ElementText = element.getTagName();

        return ElementText;
    }

    //Find Web Element By Class_Name and Get Element Tag Name.
    public static String ClassNameGetTagName(WebDriver Driver, String Classname) {
        WebElement element = Driver.findElement(By.className(Classname));

        String ElementTagName = element.getTagName();

        return ElementTagName;

    }

    //Find Web Element By CssSelector And Get Element Tag Name.
    public static String CssSelectorGetTagName(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Find Web Element By ID And Get Element Tag Name.
    public static String IdGetTagName(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Find Web Element By linkText And Get Element Tag Name.
    public static String linkTextGetTagName(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Find Web Element By Name And Get Element Tag Name.
    public static String NameGetTagName(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Find Web Element By Partial_Link_Text And Get Element Tag Name.
    public static String PartialLinkTextGetTagName(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Find Web Element By Tag_Name And Get Element Tag Name.
    public static String TagNameGetTagName(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Find Web Element By xpath And Get Element Tag Name.
    public static String XpathGetTagName(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        String ElementTagName = element.getTagName();

        return ElementTagName;
    }

    //Get Element Displayed or not.
    public static boolean Displayed(WebElement element) {
        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By Class_Name and Get Element Displayed or not.
    public static boolean ClassNameDisplay(WebDriver Driver, String Classname) {
        WebElement element = Driver.findElement(By.className(Classname));

        boolean Value = element.isDisplayed();

        return Value;

    }

    //Find Web Element By CssSelector And Get Element Displayed or not.
    public static boolean CssSelectorDisplay(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By ID And Get Element Displayed or not.
    public static boolean IdDisplay(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By linkText And Get Element Displayed or not.
    public static boolean linkTextDisplay(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By Name And Get Element Displayed or not.
    public static boolean NameDisplay(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By Partial_Link_Text And Get Element Displayed or not.
    public static boolean PartialLinkTextDisplay(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By Tag_Name And Get Element Displayed or not.
    public static boolean TagNameDisplay(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        boolean Value = element.isDisplayed();

        return Value;
    }

    //Find Web Element By xpath And Get Element Displayed or not.
    public static boolean XpathDisplay(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        boolean Value = element.isDisplayed();
        return Value;
    }


    //Get Element Selected or Not.
    public static boolean Selected(WebElement element) {
        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By Class_Name and Get Element Selected or Not.
    public static boolean ClassNameSelect(WebDriver Driver, String Classname) {
        WebElement element = Driver.findElement(By.className(Classname));

        boolean Value = element.isSelected();

        return Value;

    }

    //Find Web Element By CssSelector And Get Element Selected or Not.
    public static boolean CssSelectorSelect(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By ID And Get Element Selected or Not.
    public static boolean IdSelect(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By linkText And Get Element Selected or Not.
    public static boolean linkTextSelect(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By Name And Get Element Selected or Not.
    public static boolean NameSelect(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By Partial_Link_Text And Get Element Selected or Not.
    public static boolean PartialLinkTextSelect(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By Tag_Name And Get Element Selected or Not.
    public static boolean TagNameSelect(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        boolean Value = element.isSelected();

        return Value;
    }

    //Find Web Element By xpath And Get Element Selected or Not.
    public static boolean XpathSelect(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        boolean Value = element.isSelected();
        return Value;
    }

    //Get Element currently Enabled or not.
    public static boolean Enable(WebElement element) {
        boolean value = element.isEnabled();

        return value;
    }

    //Find Web Element By Class_Name and Get Element currently Enabled or not.
    public static boolean ClassNameEnable(WebDriver Driver, String Classname) {
        WebElement element = Driver.findElement(By.className(Classname));

        boolean Value = element.isEnabled();

        return Value;

    }

    //Find Web Element By CssSelector And Get Element currently Enabled or not.
    public static boolean CssSelectorEnable(WebDriver Driver, String CssSelector) {
        WebElement element = Driver.findElement(By.cssSelector(CssSelector));

        boolean Value = element.isEnabled();

        return Value;
    }

    //Find Web Element By ID And Get Element currently Enabled or not.
    public static boolean IdEnable(WebDriver Driver, String id) {
        WebElement element = Driver.findElement(By.id(id));

        boolean Value = element.isEnabled();

        return Value;
    }

    //Find Web Element By linkText And Get Element currently Enabled or not.
    public static boolean linkTextEnable(WebDriver Driver, String linkText) {
        WebElement element = Driver.findElement(By.linkText(linkText));

        boolean Value = element.isEnabled();

        return Value;
    }

    //Find Web Element By Name And Get Element currently Enabled or not.
    public static boolean NameEnable(WebDriver Driver, String name) {
        WebElement element = Driver.findElement(By.name(name));

        boolean Value = element.isEnabled();

        return Value;
    }

    //Find Web Element By Partial_Link_Text And Get Element currently Enabled or not.
    public static boolean PartialLinkTextEnable(WebDriver Driver, String partialLinkText) {
        WebElement element = Driver.findElement(By.partialLinkText(partialLinkText));

        boolean Value = element.isEnabled();

        return Value;
    }

    //Find Web Element By Tag_Name And Get Element currently Enabled or not.
    public static boolean TagNameEnable(WebDriver Driver, String tagName) {
        WebElement element = Driver.findElement(By.tagName(tagName));

        boolean Value = element.isEnabled();

        return Value;
    }

    //Find Web Element By xpath And Get Element currently Enabled or not.
    public static boolean XpathEnable(WebDriver Driver, String xpathExpression) {
        WebElement element = Driver.findElement(By.xpath(xpathExpression));

        boolean Value = element.isEnabled();
        return Value;
    }

    //Add Wait in secs.
    public static void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {

        }
    }

    //Highlight Element.
    public static void highlightElement(WebDriver driver, WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border = '3px solid yellow'", element);
        pause(2);
    }

    //Entered Sheet Number All Data Read.
    public ArrayList<String> ReadExcelSheetAllData(String filePath, int SheetNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(filePath));

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

    //Read Only Enter Row Data.
    public ArrayList<String> ReadSelectedRow(String filePath, int SheetNo, int RowNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(filePath));

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

    //Read Only Enter Column Data.
    public ArrayList<String> ReadselectColumn(String filePath, int SheetNo, int ColumnNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(filePath));

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

    //Read Only Single Cell.
    public String ReadSelectedCell(String filePath, int SheetNo, int RowNo, int ColumnNo) {

        String CellValue = null;
        try {
            FileInputStream inputStream = new FileInputStream(new File(filePath));

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
}