package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static helper.Constants.PATH_TO_PROPERTIES;

public class PropertyProvider {

    private Properties properties = new Properties();

    public PropertyProvider() {
        try (FileInputStream input = new FileInputStream(PATH_TO_PROPERTIES)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDriver() {
        return properties.getProperty("webDriverChrome");
    }

    public String getPath() {
        return properties.getProperty("pathDriver");
    }
}