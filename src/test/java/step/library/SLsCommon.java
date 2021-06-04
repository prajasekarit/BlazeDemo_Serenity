package step.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import net.thucydides.core.annotations.Step;
import page.objects.POsHomePage;

public class SLsCommon {

	private static final String CONFIG_PROPERTIES = "src/test/resources/config.properties";
	//private final static org.slf4j.Logger logger =  LoggerFactory.getLogger(SLsCommon.class);
	
	POsHomePage posHomePage;

	@Step
	public void LoadConfigFile() throws IOException {
		Properties prop = getEnvFromConfigProperties();
		String systemEnv = System.getenv("Environment");
		String configEnv = prop.getProperty("env");
		/*
		 * String environment = isNotBlank(systemEnv) ? systemEnv : configEnv; String
		 * environment = "any"; POsCommon.open(environment, new String[0]);
		 */

	}

	private Properties getEnvFromConfigProperties() throws IOException {
		InputStream input = new FileInputStream(CONFIG_PROPERTIES);
		Properties prop = new Properties();
		prop.load(input);
		return prop;
	}

	@Step
	public void launchBrowser() {

		// String environment = "sit";
		posHomePage.open();
		
		// POsCommon.open(environment, new String[0]);

	}

}
