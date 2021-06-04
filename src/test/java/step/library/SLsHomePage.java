package step.library;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import page.objects.POsHomePage;
import step.definitions.SDsHomePage;

@SuppressWarnings("unused")
public class SLsHomePage {
	
//	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(SLsHomePage.class);

	POsHomePage POsHomePage;

	@Step
	public void validate_Header(String text) {

		POsHomePage.validate_Header(text);

	}

	@Step
	public void destinationLink() {

		POsHomePage.destinationLink();

	}

	@Step
	public void validateUrl(String vacation) {

		POsHomePage.validateUrl(vacation);

	}

	@Step
	public void clickTravelWorld() {

		POsHomePage.clickTravelWorld();

	}

	@Step
	public void validate_Home_page() {
		POsHomePage.validate_Home_page();

	}

	@Step
	public void validate_Dropdown() {

		POsHomePage.validate_Dropdown();

	}

	@Step
	public void validate_FindFlight() {
		POsHomePage.validate_FindFlight();
	}

	@Step
	public void ChooseFlight() {
		POsHomePage.Validate_ChooseFlight();

	}

	@Step
	public void departure_city(String departurecity) {
		POsHomePage.departure_city(departurecity);

	}

	@Step
	public void reserve_valHeader() {
		POsHomePage.reserve_valHeader();

	}

	@Step
	public void reserve_Header(String reserve) {
		POsHomePage.reserve_Header(reserve);

	}

	@Step
	public void DestCity(String destinationcity) {
		POsHomePage.DestCity(destinationcity);

	}

	@Step
	public void click_FindFlights() {
		POsHomePage.click_FindFlights();
	}

	@Step
	public void valHeaderCity(String departurecity, String destinationcity) {
		POsHomePage.valHeaderCity(departurecity, destinationcity);

	}

	@Step
	public void Val_User_Fields(String name, String address, String city, String state, String zip, String cardtype,
			String cardno, String month, String year, String nameoncard) {
		POsHomePage.passengerName(name);
		POsHomePage.passengerAddress(address);
		POsHomePage.passengerCity(city);
		POsHomePage.passengerState(state);
		POsHomePage.passengerZipCode(zip);
		POsHomePage.passengerCardType(cardtype);
		POsHomePage.passengerCardNumber(cardno);
		POsHomePage.passengerCardMonth(month);
		POsHomePage.passengerCardYear(year);
		POsHomePage.passengerCardName(nameoncard);
		POsHomePage.enableRememberMeCheckBox();
		POsHomePage.disableRememberMeCheckBox();

	}

	@Step
	public void clickChooseFlight() {

		POsHomePage.clickChooseFlight();

	}

	@Step
	public void clickPurchaseFlight() {
		POsHomePage.clickPurchaseFlights();

	}

	@Step
	public void validate_Pur_Header() {
		POsHomePage.verifyPurchasePageDisplayed();

	}

	@Step
	public void validate_Conf_Header() {

		POsHomePage.validate_Conf_Header();
	}

	@Step
	public void confPageValidation() {
		POsHomePage.confirmationPageValidation();

	}

}
