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

        Methods.findByXpathClick(".//a[contains(text(),'Login')]");
        Methods.waitForElementFindByXpath(".//input[@id='authEmail']");
        Methods.findByXpathSendKey(".//input[@id='authEmail']", "test@test.com");
        Methods.findByNameSendKey("password", "123456");
        Methods.waitForElementFindByXpath(".//button[contains(text(),'Login To ViGoReport')]");
        Methods.findByXpathClick(".//button[contains(text(),'Login To ViGoReport')]");

    }

    @AfterTest
    public void end() {
        Methods.browserClose();
        Methods.browserQuit();
    }

}
