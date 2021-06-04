package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@NamedUrls({ @NamedUrl(name = "sit", url = "http://blazedemo.com/") })
@DefaultUrl("http://blazedemo.com/")
public class POsCommon extends PageObject {
	private final static Logger logger = (Logger) LoggerFactory.getLogger(POsCommon.class);

	// private static String env = null;
	private WebDriver driver;

	public POsCommon(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.driver.manage().window().maximize();
	}

	ElementXpath exp = new ElementXpath();
}
