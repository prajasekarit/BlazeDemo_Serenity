package step.definitions;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.library.*;

@SuppressWarnings("unused")
public class SDsHomePage {

//	private final static Logger logger = (Logger) LoggerFactory.getLogger(SDsHomePage.class);

	@Steps
	SLsHomePage SLsHomePage;

	@Steps
	SLsCommon SLsCommon;

	@Given("^User will launch the Website$")
	public void user_will_launch_the_website() throws Throwable {
		SLsCommon.launchBrowser();
	}

	@When("^User click on the Destination link$")
	public void user_click_on_the_destination_link() throws Throwable {
		SLsHomePage.destinationLink();
	}

	@When("^User click the Travel the world Link$")
	public void user_click_the_travel_the_world_link() throws Throwable {
		SLsHomePage.clickTravelWorld();
	}

	@Then("^webpage redirected to (.+) page$")
	public void webpage_redirected_to_page(String vacation) throws Throwable {
		SLsHomePage.validateUrl(vacation);
	}

	@Then("^validate user navigated to BlazeDemo home page$")
	public void validate_user_navigated_to_blazedemo_home_page() throws Throwable {
		SLsHomePage.validate_Home_page();
	}

	@And("^Valiadte the Header (.+) in page$")
	public void valiadte_the_header_in_page(String text) throws Throwable {
		SLsHomePage.validate_Header(text);
	}

	@And("^validate the departure and Destination city dropdowns are clickable$")
	public void validate_the_departure_and_destination_city_dropdowns_are_clickable() throws Throwable {
		SLsHomePage.validate_Dropdown();
	}

	@Then("^validate the 'Find Flights' Button is clickable$")
	public void validate_the_find_flights_button_is_clickable() throws Throwable {
		SLsHomePage.validate_FindFlight();
	}

	@When("^User click on the 'Find Flights' button$")
	public void user_click_on_the_find_flights_button() throws Throwable {
		SLsHomePage.click_FindFlights();
	}

	@Then("^Select the Destination City as (.+)$")
	public void select_the_destination_city_as(String destinationcity) throws Throwable {
		SLsHomePage.DestCity(destinationcity);
	}

	@Then("^verify the (.+) page is launched$")
	public void verify_the_page_is_launched(String reserve) throws Throwable {
		SLsHomePage.reserve_Header(reserve);
	}

	@Then("^validate the Header in the Reserve page$")
	public void validate_the_header_in_the_reserve_page() throws Throwable {
		SLsHomePage.reserve_valHeader();
	}

	@And("^Select the Departure city as (.+)$")
	public void select_the_departure_city_as(String departurecity) throws Throwable {
		SLsHomePage.departure_city(departurecity);
	}

	@And("^Validate the header has the (.+) and (.+) Information$")
	public void validate_the_header_has_the_and_information(String departurecity, String destinationcity)
			throws Throwable {
		SLsHomePage.valHeaderCity(departurecity, destinationcity);
	}

	@And("^Confirm the \"([^\"]*)\" button is clickable$")
	public void confirm_the_something_button_is_clickable(String strArg1) throws Throwable {
		SLsHomePage.ChooseFlight();
	}

	@Then("^Validate the Header of Purchase page$")
	public void validate_the_header_of_purchase_page() throws Throwable {
		SLsHomePage.validate_Pur_Header();
	}

	@Then("^Verify and click on the 'Purchase Flight' Button$")
	public void verify_and_click_on_the_purchase_flight_button() throws Throwable {

		SLsHomePage.clickPurchaseFlight();
	}

	@And("^choose the Flight in Reserve page$")
	public void choose_the_flight_in_reserve_page() throws Throwable {
		SLsHomePage.clickChooseFlight();
	}

	@And("^Validate the Individual Fields (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$")
	public void validate_the_individual_fields_(String name, String address, String city, String state, String zip,
			String cardtype, String cardno, String month, String year, String nameoncard) throws Throwable {
		SLsHomePage.Val_User_Fields(name, address, city, state, zip, cardtype, cardno, month, year, nameoncard);
	}

	@When("^the Confirmation page is launched Validate the PageResponse$")
	public void the_confirmation_page_is_launched_validate_the_pageresponse() throws Throwable {
		SLsHomePage.validate_Conf_Header();
	}

	@And("^Confirm that 'ID' is got generated$")
	public void confirm_that_id_is_got_generated() throws Throwable {
		SLsHomePage.confPageValidation();
	}
}
