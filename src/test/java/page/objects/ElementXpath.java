package page.objects;

import java.util.HashMap;

import org.openqa.selenium.By.ByXPath;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementXpath extends PageObject {

	public WebElementFacade getXpath(String key) {
		HashMap<Object, Object> xpathMap = new HashMap<>();
		xpathMap.put("HomePage_Header", "");
		return find(ByXPath.xpath((String) xpathMap.get(key)));
		// return find(ByXPath.xpath(xpathMap.get(key)));
	}

}
