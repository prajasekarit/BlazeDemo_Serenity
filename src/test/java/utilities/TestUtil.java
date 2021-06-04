package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TestUtil {

	private static final Logger logger = LoggerFactory.getLogger(TestUtil.class);

	public void clickCustom(WebElementFacade anylink, PageObject po) {
		this.waitForServicesloadingToComplete(po);
		this.movetoElement(anylink, po);
		po.waitForCondition().until(ExpectedConditions.elementToBeClickable(anylink));
		WebDriver driver = po.getDriver();
		logger.info("Going to click: {}", anylink);
		this.clickUsingJavascript(anylink, driver);
	}

	public void clickUsingJavascript(WebElementFacade anylink, WebDriver driver) {

		logger.info("Clicking the link in Javascript way.. {}", anylink);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", anylink);

	}

	public void ClickCustomSoft(WebElementFacade anylink, PageObject po) {

		try {
			this.clickCustom(anylink, po);
		} catch (Exception e) {
			logger.error("Click Failed..Trying Javascript Click.. ", e.getMessage());
			this.clickUsingJavascript(anylink, po.getDriver());
		}

	}

	public void movetoElement(WebElementFacade anylink, PageObject po) {
		try {
			logger.info("move to Element");
			Actions actions = new Actions(po.getDriver());
			actions.moveToElement(anylink);
			actions.perform();
		} catch (Exception e) {
			logger.warn("Swalloing exception when scrolling into view. ", e.getMessage());
		}

	}

	private void waitForServicesloadingToComplete(PageObject po) {
		try {
			po.waitForCondition()
					.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div{@class='loading-layer']")));
			logger.info("No loading icon is showing..");
		} catch (Exception e) {
			logger.warn("Test Continues..", e.getMessage());
		}

	}

	public void waitForServiceToLoad(PageObject po) {
		try {
			po.waitForCondition()
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div{@class='loading-layer']")));
			logger.info("loading icon is showing now..");
		} catch (Exception e) {
			logger.warn("Test Continues..", e.getMessage());
		}

	}

}
