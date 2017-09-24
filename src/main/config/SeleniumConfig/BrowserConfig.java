package config.SeleniumConfig;

import config.General.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

/**
 * Created by Viral on 11/26/2016.
 */
public class BrowserConfig {

    public boolean autoLog;
    protected WebDriver driver;
    protected PerformAction performAction;
    protected Verify verify;
    JsonFileConfig fileConfig = new JsonFileConfig();
    protected static String ObjectReportFileName = "";
    protected Browser browser;
    protected Click click;
    protected Clear clear;
    protected Get get;
    protected SendKeys enter;

    @BeforeTest
    public void browserConfig() {


        DesiredCapabilities capability = null;

        String Browser = fileConfig.getBrowser();
        if (Browser.equalsIgnoreCase("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else if (Browser.equalsIgnoreCase("ie11")) {
            capability = DesiredCapabilities.internetExplorer();
            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver(capability);
        } else if (Browser.equalsIgnoreCase("opera")) {
            capability = DesiredCapabilities.operaBlink();
            OperaDriverManager.getInstance().setup();
            driver = new OperaDriver(capability);
        } else if (Browser.equalsIgnoreCase("chrome")) {
            ChromeDriverManager.getInstance().setup();
            capability = DesiredCapabilities.chrome();
            capability.setJavascriptEnabled(true);
            driver = new ChromeDriver(capability);
        }

        driver.manage().window().maximize();
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);

        performAction = new PerformAction(driver);
        click = new Click(driver);
        enter = new SendKeys(driver);
        browser = new Browser(driver);
        clear = new Clear(driver);
        get = new Get(driver);
        verify = new Verify(driver);

        browser.openUrl();

    }


}
