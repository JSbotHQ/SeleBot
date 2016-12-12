package Config.General;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Viral on 12/12/2016.
 */
public class Testing {


    public static void main(String[] args) {

        Testing ts = new Testing();

        ts.loadProperty("login", "loginbutton");


    }

    public Properties loadPropertyFile(String propertyFile) {

        Properties prop = new Properties();
        InputStream input = null;


        try {
            File file = new File("src\\resources\\ObjectRepo\\" + propertyFile + ".properties");


            input = new FileInputStream(file.getAbsoluteFile());


            // load a properties file
            prop.load(input);


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return prop;
    }

    public void loadProperty(String fileName, String propertyName) {

        String elementType = "";
        String elementLocator = "";
        Properties elementProp = loadPropertyFile(fileName);


        if (elementProp.getProperty(propertyName + ".xpath") != null) {

            elementType = "xpath";
            elementLocator = elementProp.getProperty(propertyName + ".xpath");
        }


        if (elementProp.getProperty(propertyName + ".id") != null) {

            elementType = "id";
            elementLocator = elementProp.getProperty(propertyName + ".id");
        }


        if (elementProp.getProperty(propertyName + ".className") != null) {

            elementType = "className";
            elementLocator = elementProp.getProperty(propertyName + ".className");
        }


        if (elementProp.getProperty(propertyName + ".tagName") != null) {

            elementType = "tagName";
            elementLocator = elementProp.getProperty(propertyName + ".tagName");
        }


        if (elementProp.getProperty(propertyName + ".name") != null) {

            elementType = "name";
            elementLocator = elementProp.getProperty(propertyName + ".name");
        }


        if (elementProp.getProperty(propertyName + ".linkText") != null) {

            elementType = "linkText";
            elementLocator = elementProp.getProperty(propertyName + ".linkText");
        }


        if (elementProp.getProperty(propertyName + ".partialLinkText") != null) {

            elementType = "partialLinkText";
            elementLocator = elementProp.getProperty(propertyName + ".partialLinkText");
        }


        if (elementProp.getProperty(propertyName + ".cssSelector") != null) {

            elementType = "cssSelector";
            elementLocator = elementProp.getProperty(propertyName + ".cssSelector");
        }


        System.out.println(elementType);
        System.out.println(elementLocator);

    }


}

