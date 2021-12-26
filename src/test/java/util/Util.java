package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {

    public String getPropertyValue(String propertyName) {
        String propertyValue = " ";
        Properties properties = new Properties();
        try(InputStream fileInputStream = Util.class.getClassLoader().getResourceAsStream("config.properties")){
            properties.load(fileInputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch(IOException e){
            e.printStackTrace();
        }
        return propertyValue;
    }
}
