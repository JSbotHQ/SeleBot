package Config.General;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Viral on 11/26/2016.
 */
public class JsonFileConfig {

    PropertiesConfig prop = new PropertiesConfig();
    /**
     * Read Key Value into the Json File.
     * @param KeyName Enter Get Value Key Name.
     * @return Return Key Value in String.
     */
    public String readKeyValueInFile(String KeyName) {

        String ReadJsonFilePath = (String) prop.getValue("general", "ReadJsonFilePath");

        JSONParser parser = new JSONParser();
        String Value = null;
        try {
            Object obj = parser.parse(new FileReader(ReadJsonFilePath));

            JSONObject jsonObt = (JSONObject) obj;

            Value = jsonObt.get(KeyName).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Value;
    }

    /**
     * Read JSON Object Into The Json File.
     * @param ObjectKey Enter Get Value Object Name.
     * @return Return Json Object.
     */
    public JSONObject readJsonObjectInFile(String ObjectKey) {

        String ReadJsonFilePath = (String) prop.getValue("general", "ReadJsonFilePath");

        JSONParser parser = new JSONParser();
        JSONObject JsonObject = null;
        try {

            Object File = parser.parse(new FileReader(ReadJsonFilePath));

            JSONObject jsonObt = (JSONObject) File;

            JsonObject = (JSONObject) jsonObt.get(ObjectKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonObject;
    }

    /**
     * Read Key Value Into the Json Object.
     * @param JsonObject Enter Get Value Object Name.
     * @param KeyName    Enter Get Value Key Name.
     * @return Return Key Value in String.
     */
    public String readKeyValueInJsonObject(JSONObject JsonObject, String KeyName) {

        JSONObject object = JsonObject;

        String value = object.get(KeyName).toString();

        return value;
    }

    /**
     * Create and Write in Json File.
     * @param ObjectName Enter Get Value Object Name.
     */
    public void writeInJsonFile(JSONObject ObjectName) {
        try {

            String WriteJsonFilePath = (String) prop.getValue("general", "WriteJsonFilePath");

            FileWriter jsonFileWriter = new FileWriter(WriteJsonFilePath);

            jsonFileWriter.write(ObjectName.toJSONString());

            jsonFileWriter.flush();

            jsonFileWriter.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }



}
