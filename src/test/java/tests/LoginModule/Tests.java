package tests.LoginModule;


import config.SeleniumConfig.BrowserConfig;
import org.testng.annotations.Test;


public class Tests extends BrowserConfig {


    @Test
    public void login() {

        String currentFileName = "login";
        performAction.openURL();
        performAction.click(currentFileName, "login Button");
        performAction.sendKeys(currentFileName, "email");
        performAction.pause(3);
        performAction.sendKeys(currentFileName, "password");
        performAction.click(currentFileName, "login to VigoReport");

    }


    @Test
    public void login2() {

        String currentFileName = "login";

        performAction.openURL();
        performAction.click(currentFileName, "login Button");
        performAction.sendKeys(currentFileName, "email");
        performAction.pause(3);
        performAction.sendKeys(currentFileName, "password");
        performAction.click(currentFileName, "login to VigoReport");
        performAction.waitForElement(currentFileName, "project Lable On HomePage");
        verify.elementIsDisplayed(currentFileName, "project Lable On HomePage");


    }


}
