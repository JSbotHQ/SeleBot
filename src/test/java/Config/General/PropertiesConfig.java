package Config.General;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 02-Dec-16.
 */
public class PropertiesConfig {


    /**
     * Get Value From general.properties File.
     *
     * @param key Enter Get Value Key Name.
     * @return Return Value In String.
     */
    public static String getValue(String key) {
        String value = null;
        try {
            File file = new File(".\\src\\resources\\general.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();

            properties.load(fileInput);

            value = properties.getProperty(key);

            System.out.println("Read Value From Property File --->>>> " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }


}
