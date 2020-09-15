package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties property;

    public static String getProperties(String name) {
        String xx="";
        try {
            FileInputStream file = new FileInputStream("src/test/resources/Configuration.properties");
            Properties config = new Properties();
            config.load(file);
            xx = config.getProperty(name);
        }catch(Exception e){  }

        return  xx;
    }


}
