Feature: BlazeDemo Application Test

@Test-1
Scenario Outline: Validate the Home page of BlazeDemo Application
Given User will launch the Website
And Valiadte the Header <text> in page
When User click on the Destination link
Then webpage redirected to <Vacation> page
When User click the Travel the world Link
Then validate user navigated to BlazeDemo home page
And validate the departure and Destination city dropdowns are clickable
Examples: 
|text|Vacation|
|Welcome to the Simple Travel Agency!|https://blazedemo.com/vacation.html|

@Test-2      
Scenario Outline: Validate the ReservePage Details
Given User will launch the Website
And Select the Departure city as <Departure_city>
Then Select the Destination City as <Destination_City>
When User click on the 'Find Flights' button
Then verify the <reserve> page is launched
And Validate the header has the <Departure_city> and <Destination_City> Information
Then validate the Header in the Reserve page
And Confirm the "Choose ths Flight" button is clickable
Examples: 
|Departure_city|Destination_City|reserve|
|Paris|London|https://blazedemo.com/reserve.php|

@Test-3
Scenario Outline: Validate the Purchase Page Details
 
Given User will launch the Website
And Select the Departure city as <Departure_city>
Then Select the Destination City as <Destination_City>
When User click on the 'Find Flights' button
And choose the Flight in Reserve page
Then Validate the Header of Purchase page
And Validate the Individual Fields <name>,<address>,<city>,<state>,<Zip>,<Card_type>,<card_no>,<month>,<year>,<name_on_card>
Then Verify and click on the 'Purchase Flight' Button
Examples: 
|Departure_city|Destination_City|name|address|city|state|Zip|Card_type|card_no|month|year|name_on_card|
|Paris|London|raja|Brindhavan Street|Chennai|TamilNadu|600091|amex|1234567898743214|12|2015|Raja|
      
@Test-4
Scenario Outline: Validate the Confirmation Page Details
Given User will launch the Website
And Select the Departure city as <Departure_city>
Then Select the Destination City as <Destination_City>
When User click on the 'Find Flights' button
And choose the Flight in Reserve page
And Validate the Individual Fields <name>,<address>,<city>,<state>,<Zip>,<Card_type>,<card_no>,<month>,<year>,<name_on_card>
Then Verify and click on the 'Purchase Flight' Button
When the Confirmation page is launched Validate the PageResponse
And Confirm that 'ID' is got generated    
Examples: 
|Departure_city|Destination_City|name|address|city|state|Zip|Card_type|card_no|month|year|name_on_card|
|Paris|London|raja|Brindhavan Street|Chennai|TamilNadu|600091|amex|1234567898743214|12|2015|Raja|
   