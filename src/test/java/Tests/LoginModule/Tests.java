package Tests.LoginModule;


import Config.Methods;

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
    public void Login() {

        System.out.println(Methods.getCurrentDateTime());
        System.out.println(Methods.findByXpathGetText(".//a[contains(text(),'Login')]"));
        Methods.waitForElementFindByXpath(".//a[contains(text(),'Login')]");
        Methods.findByXpathClick(".//a[contains(text(),'Login')]");
        Methods.waitForElementFindByXpath(".//input[@Id='authEmail']");
        Methods.findByXpathSendKey(".//input[@Id='authEmail']", "test@test.com");
        Methods.findByNameSendKey("password", "123456");
        Methods.waitForElementFindByXpath(".//button[contains(text(),'Login To ViGoReport')]");
        Methods.findByXpathClick(".//button[contains(text(),'Login To ViGoReport')]");



    }


    @Test
    public void reg() {

        System.out.println(Methods.getCurrentDateTime());
        System.out.println(Methods.findByXpathGetText(".//a[contains(text(),'SignUp')]"));
        Methods.pause(2);
        Methods.mouseHoverFindByXpath(".//a[contains(text(),'SignUp')]");
        Methods.pause(2);
        Methods.findByXpathHighlightElement(".//a[contains(text(),'SignUp')]");
        Methods.pause(2);
        Methods.findByXpathClick(".//a[contains(text(),'SignUp')]");
        Methods.pause(2);




    }

    @AfterTest
    public void end() {
        Methods.browserClose();
        Methods.browserQuit();
    }

}
