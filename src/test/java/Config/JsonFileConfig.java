package Config;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Viral on 11/26/2016.
 */
public class JsonFileConfig {

    /**
     * Read Key Value into the Json File.
     * @param KeyName Enter Get Value Key Name.
     * @return Return Key Value in String.
     */
    public static String readKeyValueInFile(String KeyName) {

        String ReadJsonFilePath = PropertiesConfig.getValue("ReadJsonFilePath");

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
    public static JSONObject readJsonObjectInFile(String ObjectKey) {

        String ReadJsonFilePath = PropertiesConfig.getValue("ReadJsonFilePath");

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
    public static String readKeyValueInJsonObject(JSONObject JsonObject, String KeyName) {

        JSONObject object = JsonObject;

        String value = object.get(KeyName).toString();

        return value;
    }

    /**
     * Create and Write in Json File.
     * @param ObjectName Enter Get Value Object Name.
     */
    public static void writeInJsonFile(JSONObject ObjectName) {
        try {

            String WriteJsonFilePath = PropertiesConfig.getValue("WriteJsonFilePath");

            FileWriter jsonFileWriter = new FileWriter(WriteJsonFilePath);

            jsonFileWriter.write(ObjectName.toJSONString());

            jsonFileWriter.flush();

            jsonFileWriter.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }


    /**
     * Add String Data In Json.
     * @param ObjectName Enter Get Value Object Name.
     * @param Key        Enter Key in string.
     * @param Value      Enter Value in String.
     */
    public static void addStringDataInJson(JSONObject ObjectName, String Key, String Value) {
        ObjectName.put(Key, Value);
    }

    /**
     * Add Integer Data In Json.
     * @param ObjectName Enter Get Value Key Name.
     * @param Key        Enter Key in string.
     * @param Value      Enter Value in Integer.
     */
    public static void addIntDataInJson(JSONObject ObjectName, String Key, int Value) {
        ObjectName.put(Key, Value);
    }

    /**
     * Add Json Object In Json
     * @param Final           Enter Final JsonObject Name.
     * @param Key             Enter Key in string.
     * @param JsonObjectValue Enter JsonObjectValue in JSONObject.
     */
    public static void addJsonObjectInJsonObject(JSONObject Final, String Key, JSONObject JsonObjectValue) {
        Final.put(Key, JsonObjectValue);
    }
}
