package Tests.LoginModule;


import Config.Methods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Tests {

    @BeforeTest
    public void config() {
        Methods.browserConfig();
        Methods.openURL();
    }

     @Test
    public void test() {

        WebElement element = Methods.xpath(".//a[contains(text(),'Home')]");
        System.err.println(Methods.findByXpathElementIsDisplayed(".//a[contains(text(),'Home')]"));
        boolean select = Methods.findByXpathElementIsSelected(".//a[contains(text(),'Home')]");
        System.out.println("Element is selected????? " + select);
        boolean Enabled = Methods.findByxpathElementIsEnabled(".//a[contains(text(),'Home')]");
        System.out.println("Element is enabled????  " + Enabled);
        Methods.highlightElement(element);
        Methods.openMailinatorInbox("test@mailinator.com");
        String URL = Methods.getCurrentURL();
        System.out.println("Current tab URL is : " + URL);
        String pageSources = Methods.getPageSource();
        System.out.println("Current page sources is : " + pageSources);


    }

    @Test()
    public void loginAndSelectdroupdoen() {
        Methods.findByXpathClick(".//a[contains(text(),'Login')]");
        Methods.pause(3);
        Methods.findByXpathSendKey(".//input[@id='authEmail']", "test@test.com");
        Methods.findByNameSendKey("password", "123456");
        Methods.pause(2);
        Methods.findByXpathClick(".//button[contains(text(),'Login To ViGoReport')]");
        Methods.pause(2);
        Methods.findByXpathClick(".//a[contains(text(),'New Project')]");
        Methods.pause(2);
        WebElement combo = Methods.xpath(".//select[@id='projectType']");
        Methods.selectRandomOptionFromCombo(combo, 5);
        Methods.pause(2);
        Methods.selectValueInDroupDownUseXpath(".//select[@id='projectType']","TestNG");

    }

    @AfterTest
    public void end() {
        Methods.browserClose();
        Methods.browserQuit();
    }


}
