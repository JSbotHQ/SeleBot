package Methods;

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
     *
     * @param JSonFilePath
     * @param KeyName
     * @return Return Key Value in String.
     */
    public static String readKeyValueInFile(String JSonFilePath, String KeyName) {
        JSONParser parser = new JSONParser();
        String Value = null;
        try {

            Object obj = parser.parse(new FileReader(JSonFilePath));

            JSONObject jsonObt = (JSONObject) obj;

            Value = jsonObt.get(KeyName).toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Value;
    }

    /**
     * Read JSON Object Into The Json File.
     *
     * @param JSonFilePath
     * @param ObjectKey
     * @return Return Json Object.
     */
    public static JSONObject readJsonObjectInFile(String JSonFilePath, String ObjectKey) {
        JSONParser parser = new JSONParser();
        JSONObject JsonObject = null;
        try {

            Object File = parser.parse(new FileReader(JSonFilePath));

            JSONObject jsonObt = (JSONObject) File;

            JsonObject = (JSONObject) jsonObt.get(ObjectKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonObject;
    }

    /**
     * Read Key Value Into the Json Object.
     *
     * @param JsonObject
     * @param KeyName
     * @return Return Key Value in String.
     */
    public static String readKeyValueInJsonObject(JSONObject JsonObject, String KeyName) {

        JSONObject Object = JsonObject;

        String Value = Object.get(KeyName).toString();

        return Value;
    }

    /**
     * Create and Write in Json File.
     *
     * @param FilePathDestination Enter File Destination Path Like "C:\Users\user\Desktop\ABC.json".
     * @param ObjectName
     */
    public static void writeInJsonFile(String FilePathDestination, JSONObject ObjectName) {
        try {

            FileWriter jsonFileWriter = new FileWriter(FilePathDestination);


            jsonFileWriter.write(ObjectName.toJSONString());


            jsonFileWriter.flush();

            jsonFileWriter.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }


    /**
     * Add String Data In Json.
     *
     * @param ObjectName
     * @param Key        Enter Key in string.
     * @param Value      Enter Value in String.
     */
    public static void addStringDataInJson(JSONObject ObjectName, String Key, String Value) {
        ObjectName.put(Key, Value);
    }

    /**
     * Add Integer Data In Json.
     *
     * @param ObjectName
     * @param Key        Enter Key in string.
     * @param Value      Enter Value in Integer.
     */
    public static void addIntDataInJson(JSONObject ObjectName, String Key, int Value) {
        ObjectName.put(Key, Value);
    }

    /**
     * Add Json Object In Json
     *
     * @param Final
     * @param Key             Enter Key in string.
     * @param JsonObjectValue Enter JsonObjectValue in JSONObject.
     */
    public static void addJsonObjectInJsonObject(JSONObject Final, String Key, JSONObject JsonObjectValue) {
        Final.put(Key, JsonObjectValue);
    }
}
