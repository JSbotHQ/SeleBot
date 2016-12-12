package Tests.LoginModule;


import Config.SeleniumConfig.BrowserConfig;
import org.testng.annotations.Test;


public class Tests extends BrowserConfig {



    @Test
    public void Login() {


        performAction.click("login", "loginbutton");


        performAction.sendKeys("login", "email", "Test@Test.com");

        performAction.pause(3);


    }



}
