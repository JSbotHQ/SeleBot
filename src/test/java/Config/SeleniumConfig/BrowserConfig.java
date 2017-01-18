package Config.SeleniumConfig;

import Config.General.Methods;
import Config.General.PerformAction;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

/**
 * Created by Viral on 11/26/2016.
 */
public class BrowserConfig {

    public String autoLog = "";
    protected WebDriver driver;




    @BeforeTest
    public void browserConfig() {

        autoLog = (String) prop.getValue("general", "AutoLog");

        DesiredCapabilities capability = null;

        String Browser = (String) prop.getValue("general", "BrowserName");




        if (Browser.equalsIgnoreCase("firefox")) {


            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();



        } else if (Browser.equalsIgnoreCase("ie11")) {

            capability = DesiredCapabilities.internetExplorer();

            InternetExplorerDriverManager.getInstance().setup();


            capability.setBrowserName("internet explorer");
            capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capability.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            capability.setJavascriptEnabled(true);


            driver = new InternetExplorerDriver(capability);

        } else if (Browser.equalsIgnoreCase("opera")) {
            capability = DesiredCapabilities.operaBlink();

            OperaDriverManager.getInstance().setup();
            //capability.setJavascriptEnabled(true);
            //browserName = capability.getVersion();
            // osName = capability.getPlatform().getCurrent().findByName();
            //browserVersion = capability.getVersion();
            driver = new OperaDriver(capability);

        } else if (Browser.equalsIgnoreCase("chrome")) {

            capability = DesiredCapabilities.chrome();

            ChromeDriverManager.getInstance().setup();
            capability.setJavascriptEnabled(true);

            driver = new ChromeDriver(capability);
        } else if (Browser.equalsIgnoreCase("safari")) {

            System.setProperty("webdriver.safari.driver", ".\\src\\test\\java\\Driver\\safari\\SafariDriver.safariextz");
            //driver = new SafariDriver();
            SafariDriver profile = new SafariDriver();

            capability = DesiredCapabilities.safari();
            capability.setJavascriptEnabled(true);
            capability.setBrowserName("safari");


        }

        driver.manage().window().maximize();
        Methods methods = new Methods(driver);
        PerformAction performAction = new PerformAction(driver);
        performAction.openURL();

        if (autoLog.equals("on")) {
            methods.log("Open Browser : " + Browser);
        }





    }


}
