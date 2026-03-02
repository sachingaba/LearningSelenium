package com.thetestingacademy.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String Key){


        Properties p = new Properties();
String pathofProperties = System.getProperty("user.dir")+ "/src/test/java/com/thetestingacademy/resources/data.properties";


        try {
            FileInputStream fis = new FileInputStream(pathofProperties);

            p.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

return p.getProperty(Key);
    }
}
