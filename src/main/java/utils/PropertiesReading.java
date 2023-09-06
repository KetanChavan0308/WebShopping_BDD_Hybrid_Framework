package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {

    public static String setProperty(String key) {
	String value = null;
	String projectPath = System.getProperty("user.dir");
	try {
	    FileInputStream input = new FileInputStream(
		    projectPath + "./src/test/resources/config/Application.properties");
	    Properties prop = new Properties();
	    prop.load(input);
	    value = prop.getProperty(key);

	} catch (FileNotFoundException e) {

	    e.printStackTrace();
	} catch (IOException e) {

	    e.printStackTrace();
	}

	return value;

    }

}
