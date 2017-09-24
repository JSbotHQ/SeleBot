package config.General;

public class SelebotUtility {


    public String getJsonFileName(String className) {
        return className.split(".java")[0];
    }


}
