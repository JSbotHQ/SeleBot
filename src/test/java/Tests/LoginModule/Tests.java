package Tests.LoginModule;


import Config.SeleniumConfig.BrowserConfig;
import org.testng.annotations.Test;


public class Tests extends BrowserConfig {

    String currentFileName = "login";

    @Test
    public void Login() {


        performAction.click(currentFileName, "loginbutton");

        performAction.sendKeys(currentFileName, "email", "Test@Test.com");

        performAction.pause(3);


    }



}
