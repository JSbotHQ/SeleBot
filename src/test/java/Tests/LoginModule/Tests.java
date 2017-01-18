package Tests.LoginModule;


import Config.General.PerformAction;
import Config.SeleniumConfig.BrowserConfig;
import org.testng.annotations.Test;


public class Tests extends BrowserConfig {



    @Test
    public void login() {

        PerformAction performAction = new PerformAction(driver);
        String currentFileName = "login";
        performAction.openURL();
        performAction.click(currentFileName, "login Button");
        performAction.sendKeys(currentFileName, "email");
        performAction.pause(3);

    }

    @Test
    public void Register() {

        PerformAction performAction = new PerformAction(driver);
        String currentFileName = "login";
        performAction.click(currentFileName, "loginbutton");
        performAction.sendKeys(currentFileName, "email", "Test@Test.com");
        performAction.pause(3);

    }

}
