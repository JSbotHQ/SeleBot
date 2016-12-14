package Config.General;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by user on 02-Dec-16.
 */
public class PropertiesConfig {


    public Properties loadPropertyFile(String propertyFile) {

        Properties prop = new Properties();
        InputStream input = null;


        try {
            File file = null;
            if (!propertyFile.equals("general")) {

                file = new File("src\\resources\\ObjectRepo\\" + propertyFile + ".properties");

            } else {
                file = new File("src\\resources\\" + propertyFile + ".properties");

            }

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


    public Object getValue(String fileName, String key) {
        Properties prop = loadPropertyFile(fileName);
        return prop.get(key);
    }


}
