package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commons.Commons;
import constants.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.PropertiesReading;

public class Hooks {
    @Before
    public void setUp() {
	Commons.setBrowser(PropertiesReading.setProperty("Browser"));
	Commons.maximizeWindow();
	Commons.implcitwait(9);
	Commons.launchUrl(PropertiesReading.setProperty("Url"));
    }

    @After
    public void tearDown(Scenario scenario) {

	String ScenarioName = scenario.getName().replace(" ", "_");
	if (scenario.isFailed()) {
	    byte[] shots = ((TakesScreenshot) Constants.driver).getScreenshotAs(OutputType.BYTES);

	    scenario.attach(shots, "image/png", ScenarioName);

	}

	Commons.closeAllBrowser();
    }
}
