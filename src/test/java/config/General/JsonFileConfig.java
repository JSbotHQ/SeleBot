package config.General;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Viral on 11/26/2016.
 */
public class JsonFileConfig {


    public static void main(String[] args) {

        JsonFileConfig s = new JsonFileConfig();
        System.out.println(s.getElementValue("login", "login Button").get("locatorType"));


    }

    public JSONObject loadJsonFile(String jsonFilePath) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;


        try {

            Object obj = parser.parse(new FileReader(jsonFilePath));

            jsonObject = (JSONObject) obj;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public JSONObject getGeneralFile() {

        File jsonFile = new File("src\\resources\\general.json");

        JSONObject file = loadJsonFile(jsonFile.getAbsolutePath());

        return file;
    }

    public boolean getAutoHighlightValue() {
        boolean bool;

        JSONObject object = getGeneralFile();

        bool = (boolean) ((JSONObject) object.get("general")).get("HighightElement");
        return bool;
    }

    public boolean getAutoLog() {
        boolean bool;

        JSONObject object = getGeneralFile();

        bool = (boolean) ((JSONObject) object.get("general")).get("AutoLog");
        return bool;

    }

    public String getURL() {
        String bool;

        JSONObject object = getGeneralFile();

        bool = ((JSONObject) object.get("project")).get("URL").toString();
        return bool;

    }

    public String getBrowser() {
        String bool;
        JSONObject object = getGeneralFile();

        bool = ((JSONObject) object.get("project")).get("BrowserName").toString();
        return bool;

    }

    public JSONObject getElementValue(String fileName, String elementName) {

        Map<String, String> elementData = new HashMap<String, String>();
        File jsonFile = new File("src\\resources\\ObjectRepo\\" + fileName + ".json");
        JSONObject file = loadJsonFile(jsonFile.getAbsolutePath());
        JSONObject object = (JSONObject) file.get(elementName);
        return object;
    }





}
