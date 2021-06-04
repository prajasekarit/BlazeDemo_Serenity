package page.objects;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://blazedemo.com/")
public class POsHomePage extends PageObject {

	public POsHomePage(WebDriver driver) {
		super(driver);
	}

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(POsHomePage.class);

	@FindBy(xpath = "//h1[contains(text(),'Welcome to the Simple Travel Agency!')]")
	private WebElementFacade welcomeTitle;

	@FindBy(xpath = "//a[contains(text(),'destination of the week! The Beach!')]")
	private WebElementFacade destinationLink;

	@FindBy(xpath = "//a[contains(text(),'home')]")
	private WebElementFacade Home;

	@FindBy(xpath = "//a[contains(text(),'Travel The World')]")
	private WebElementFacade Travel_world;

	@FindBy(xpath = "//body/div[3]/form[1]/select[1]")
	private WebElementFacade departure_city;

	@FindBy(xpath = "//body/div[3]/form[1]/select[2]")
	private WebElementFacade destination_city;

	@FindBy(xpath = "//body/div[3]/form[1]/div[1]/input[1]")
	private WebElementFacade find_Flights;

	public void validate_Header(String text) {
		logger.info("<------------Validating the Header Text------->");
		Assert.assertEquals(text, welcomeTitle.getText());

	}

	public void destinationLink() {

		logger.info("<------------Clicking on the Destination Link------->");
		Assert.assertTrue(destinationLink.isClickable());
		destinationLink.click();

	}

	public void validateUrl(String vacation) {
		String reDirectedurl = getDriver().getCurrentUrl();
		logger.info("<------------Validatng the Destination Link------->");
		Assert.assertEquals(vacation, reDirectedurl);

	}

	public void clickTravelWorld() {

		logger.info("<------------Clicking on the Travel World Link------->");
		Assert.assertTrue(Travel_world.isClickable());
		Travel_world.click();

	}

	public void validate_Home_page() {
		String reDirectedurl = getDriver().getCurrentUrl();
		logger.info("<------------Validatng the Home Page Link------->");
		Assert.assertEquals("https://blazedemo.com/index.php", reDirectedurl);

	}

	public void validate_Dropdown() {

		logger.info("<------------Validatng the Departure City DropDown------->");
		
		Select se = new Select(departure_city);
		se.selectByValue("Boston");
		//Assert.assertTrue(departure_city.getText().contains("PortLand"));

		logger.info("<------------Validatng the Destination City DropDown------->");
		Select sel = new Select(destination_city);
		sel.selectByValue("London");
		//Assert.assertTrue(destination_city.getText().contains("London"));
	}

	public void validate_FindFlight() {
		logger.info("<------------Validatng the Find Flights Button DropDown------->");
		Assert.assertTrue(find_Flights.isClickable());
	}

	// Reserve Page

	@FindBy(xpath = "//h3[contains(text(),'Flights from')]")
	private WebElementFacade reserve_Header;

	@FindBy(xpath = "//thead/tr/th[1]")
	private WebElementFacade reserve_Choose;

	@FindBy(xpath = "//thead/tr/th[2]")
	private WebElementFacade reserve_Flight;

	@FindBy(xpath = "//thead/tr/th[3]")
	private WebElementFacade reserve_Airline;

	@FindBy(xpath = "//thead/tr/th[4]")
	private WebElementFacade reserve_Departs;

	@FindBy(xpath = "//thead/tr/th[5]")
	private WebElementFacade reserve_Arrives;

	@FindBy(xpath = "//thead/tr/th[6]")
	private WebElementFacade reserve_Price;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	private WebElementFacade reserve_chooseFlight;

	public void click_FindFlights() {
		logger.info("<------------Clicking the Find Flights Button------->");
		find_Flights.click();
	}

	public void DestCity(String destinationcity) {

		logger.info("<------------Validatng the Destination City DropDown------->");
		Select sel = new Select(destination_city);
		sel.selectByValue(destinationcity);
	//	Assert.assertEquals(destinationcity, destination_city.getText());

	}

	public void reserve_Header(String reserve) {
		logger.info("<------------Validatng the Reserve Page URL------->");
		String url = getDriver().getCurrentUrl();
		Assert.assertEquals(reserve, url);
	}

	public void reserve_valHeader() {
		logger.info("<------------Validatng the Reserve Page Table Columns------->");
		Assert.assertTrue(reserve_Choose.getText().contains("Choose"));
		Assert.assertTrue(reserve_Flight.getText().contains("Flight"));
		Assert.assertTrue(reserve_Departs.getText().contains("Departs:"));
		Assert.assertTrue(reserve_Arrives.getText().contains("Arrives:"));
		Assert.assertTrue(reserve_Price.getText().contains("Price"));

	}

	public void departure_city(String departurecity) {
		logger.info("<------------Validatng the Departure City DropDown------->");
		Select se = new Select(departure_city);
		se.selectByValue(departurecity);
	//	Assert.assertEquals(departurecity, departure_city.getText());

	}

	public void valHeaderCity(String departurecity, String destinationcity) {
		logger.info("<------------Validatng the Reserve Page Header------->");
		Assert.assertTrue(reserve_Header.getText().contains(departurecity));
		Assert.assertTrue(reserve_Header.getText().contains(destinationcity));
	}

	public void Validate_ChooseFlight() {

		logger.info("<------------Validatng the Choose This Flight is Visible------->");
		Assert.assertTrue(reserve_chooseFlight.isClickable());
	}

	// Purchase Page

	@FindBy(xpath = "//descendant::h2")
	private WebElementFacade purchasePageTitle;

	@FindBy(name = "inputName")
	private WebElementFacade name;

	@FindBy(name = "address")
	private WebElementFacade address;

	@FindBy(name = "city")
	private WebElementFacade city;

	@FindBy(name = "state")
	private WebElementFacade state;

	@FindBy(name = "zipCode")
	private WebElementFacade zipCode;

	@FindBy(name = "cardType")
	private WebElementFacade cardType;

	@FindBy(name = "creditCardNumber")
	private WebElementFacade cardNumber;

	@FindBy(name = "creditCardMonth")
	private WebElementFacade month;

	@FindBy(name = "creditCardYear")
	private WebElementFacade year;

	@FindBy(name = "nameOnCard")
	private WebElementFacade cardName;

	@FindBy(name = "rememberMe")
	private WebElementFacade rememberMeCheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElementFacade purchaseFlight;

	public void verifyPurchasePageDisplayed() {
		logger.info("<------------Validatng the Purchase Page Fields------->");
		Assert.assertTrue(purchasePageTitle.isVisible());
		purchasePageTitle.isDisplayed();
	}

	public void passengerName(String value) {

		Assert.assertTrue(name.isVisible());
		name.clear();
		name.sendKeys(value);
	}

	public void passengerAddress(String value) {

		Assert.assertTrue(address.isVisible());
		address.clear();
		address.sendKeys(value);
	}

	public void passengerCity(String value) {

		Assert.assertTrue(city.isVisible());
		city.clear();
		city.sendKeys(value);
	}

	public void passengerState(String value) {

		Assert.assertTrue(state.isVisible());
		state.clear();
		state.sendKeys(value);
	}

	public void passengerZipCode(String value) {

		Assert.assertTrue(zipCode.isVisible());
		zipCode.clear();
		zipCode.sendKeys(value);
	}

	public void passengerCardType(String value) {

		Assert.assertTrue(cardType.isVisible());
		Select sel = new Select(cardType);
		sel.selectByValue(value);
	}

	public void passengerCardNumber(String value) {

		Assert.assertTrue(cardNumber.isVisible());
		cardNumber.clear();
		cardNumber.sendKeys(value);
	}

	public void passengerCardMonth(String value) {

		Assert.assertTrue(month.isVisible());
		month.clear();
		month.sendKeys(value);
	}

	public void passengerCardYear(String value) {

		Assert.assertTrue(year.isVisible());
		year.clear();
		year.sendKeys(value);
	}

	public void passengerCardName(String value) {

		Assert.assertTrue(cardName.isVisible());
		cardName.clear();
		cardName.sendKeys(value);
	}

	public void enableRememberMeCheckBox() {

		Assert.assertTrue(rememberMeCheckBox.isVisible());
		if (!rememberMeCheckBox.isSelected())
			rememberMeCheckBox.click();
	}

	public void disableRememberMeCheckBox() {

		Assert.assertTrue(rememberMeCheckBox.isVisible());
		if (rememberMeCheckBox.isSelected())
			rememberMeCheckBox.click();
	}

	public void clickPurchaseFlights() {

		Assert.assertTrue(purchaseFlight.isVisible());
		purchaseFlight.click();
	}

	public void clickChooseFlight() {

		reserve_chooseFlight.click();

	}

	// Confirmation Page

	@FindBy(xpath = "//h1[contains(text(),'Thank you for your purchase today!')]")
	private WebElementFacade Conf_Page_Header;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElementFacade Conf_Page_ID;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElementFacade Conf_Page_ID_Val;

	@FindBy(xpath = "//tbody/tr[2]/td[1]")
	private WebElementFacade Conf_Page_Status;

	public void validate_Conf_Header() {
		logger.info("<------------Validatng the Confirmation Page Fields------->");
		Assert.assertTrue(Conf_Page_Header.getText().contains("Thank you for your purchase today!"));

	}

	public void confirmationPageValidation() {
		System.out.println(Conf_Page_ID.getText());
		Assert.assertTrue(Conf_Page_ID.getText().contains("Id"));
		System.out.println(Conf_Page_Status.getText());
		Assert.assertTrue(Conf_Page_Status.getText().contains("Status"));

	}

}
