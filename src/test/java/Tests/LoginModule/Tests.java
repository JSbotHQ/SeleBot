package Tests.LoginModule;


import Config.Methods;
import org.testng.annotations.Test;



public class Tests {

    @Test
    public void test() {
Methods.browserConfig();
Methods.openURL();
Methods.browserQuit();
    }

}
