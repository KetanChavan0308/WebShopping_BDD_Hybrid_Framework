package commons;

import java.time.Duration;
import java.util.Date;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commons {
    public static void setBrowser(String browserName) {
	switch (browserName) {
	case "Chrome":
	    Constants.driver = WebDriverManager.chromedriver().create();
	    break;

	case "Firefox":
	    Constants.driver = WebDriverManager.firefoxdriver().create();
	    break;

	case "Edge":
	    Constants.driver = WebDriverManager.edgedriver().create();
	    break;

	case "Safari":
	    Constants.driver = WebDriverManager.safaridriver().create();
	    break;

	default:
	    System.out.println("Invalid Browser" + browserName);
	    break;
	}
    }

    public static void maximizeWindow() {
	Constants.driver.manage().window().maximize();
    }

    public static void implcitwait(int time) {
	Constants.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void launchUrl(String Url) {
	Constants.driver.get(Url);
    }

    public static void closeBrowser() {
	Constants.driver.close();
    }

    public static void closeAllBrowser() {
	Constants.driver.quit();
    }

    public static String timeStamp() {
	Date date = new Date();

	String id = date.toString().substring(11, 19).replace(" ", "").replace(":", "");
	return "Selenium" + id + "@gmail.com";
    }
}

