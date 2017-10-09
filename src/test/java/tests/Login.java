package tests;


import config.Selebot.BrowserConfig;
import org.testng.annotations.Test;


public class Login extends BrowserConfig {





    @Test
    public void login() {


        click.on("login Button");
        enter.text("mahesh@jsbot.io").on("email");
        browser.pause(1);
        clear.text().from("email");
        select.from("signUpText").byVisibleText("");


    }



  /*  public void login2() {

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
*/

}
