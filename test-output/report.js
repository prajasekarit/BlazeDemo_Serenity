$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/HomePage.feature");
formatter.feature({
  "name": "BlazeDemo Application Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the Home page of BlazeDemo Application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.step({
  "name": "Valiadte the Header \u003ctext\u003e in page",
  "keyword": "And "
});
formatter.step({
  "name": "User click on the Destination link",
  "keyword": "When "
});
formatter.step({
  "name": "webpage redirected to \u003cVacation\u003e page",
  "keyword": "Then "
});
formatter.step({
  "name": "User click the Travel the world Link",
  "keyword": "When "
});
formatter.step({
  "name": "validate user navigated to BlazeDemo home page",
  "keyword": "Then "
});
formatter.step({
  "name": "validate the departure and Destination city dropdowns are clickable",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "text",
        "Vacation"
      ]
    },
    {
      "cells": [
        "Welcome to the Simple Travel Agency!",
        "https://blazedemo.com/vacation.html"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the Home page of BlazeDemo Application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Valiadte the Header Welcome to the Simple Travel Agency! in page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on the Destination link",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "webpage redirected to https://blazedemo.com/vacation.html page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click the Travel the world Link",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "validate user navigated to BlazeDemo home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "validate the departure and Destination city dropdowns are clickable",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Validate the ReservePage Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.step({
  "name": "Select the Departure city as \u003cDeparture_city\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select the Destination City as \u003cDestination_City\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on the \u0027Find Flights\u0027 button",
  "keyword": "When "
});
formatter.step({
  "name": "verify the \u003creserve\u003e page is launched",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate the header has the \u003cDeparture_city\u003e and \u003cDestination_City\u003e Information",
  "keyword": "And "
});
formatter.step({
  "name": "validate the Header in the Reserve page",
  "keyword": "Then "
});
formatter.step({
  "name": "Confirm the \"Choose ths Flight\" button is clickable",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Departure_city",
        "Destination_City",
        "reserve"
      ]
    },
    {
      "cells": [
        "Paris",
        "London",
        "https://blazedemo.com/reserve.php"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the ReservePage Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the Departure city as Paris",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the Destination City as London",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on the \u0027Find Flights\u0027 button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the https://blazedemo.com/reserve.php page is launched",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the header has the Paris and London Information",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "validate the Header in the Reserve page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Confirm the \"Choose ths Flight\" button is clickable",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Validate the Purchase Page Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.step({
  "name": "Select the Departure city as \u003cDeparture_city\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select the Destination City as \u003cDestination_City\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on the \u0027Find Flights\u0027 button",
  "keyword": "When "
});
formatter.step({
  "name": "choose the Flight in Reserve page",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the Header of Purchase page",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate the Individual Fields \u003cname\u003e,\u003caddress\u003e,\u003ccity\u003e,\u003cstate\u003e,\u003cZip\u003e,\u003cCard_type\u003e,\u003ccard_no\u003e,\u003cmonth\u003e,\u003cyear\u003e,\u003cname_on_card\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Verify and click on the \u0027Purchase Flight\u0027 Button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Departure_city",
        "Destination_City",
        "name",
        "address",
        "city",
        "state",
        "Zip",
        "Card_type",
        "card_no",
        "month",
        "year",
        "name_on_card"
      ]
    },
    {
      "cells": [
        "Paris",
        "London",
        "raja",
        "Brindhavan Street",
        "Chennai",
        "TamilNadu",
        "600091",
        "amex",
        "1234567898743214",
        "12",
        "2015",
        "Raja"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the Purchase Page Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the Departure city as Paris",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the Destination City as London",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on the \u0027Find Flights\u0027 button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "choose the Flight in Reserve page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the Header of Purchase page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the Individual Fields raja,Brindhavan Street,Chennai,TamilNadu,600091,amex,1234567898743214,12,2015,Raja",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify and click on the \u0027Purchase Flight\u0027 Button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Validate the Confirmation Page Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.step({
  "name": "Select the Departure city as \u003cDeparture_city\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select the Destination City as \u003cDestination_City\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on the \u0027Find Flights\u0027 button",
  "keyword": "When "
});
formatter.step({
  "name": "choose the Flight in Reserve page",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the Individual Fields \u003cname\u003e,\u003caddress\u003e,\u003ccity\u003e,\u003cstate\u003e,\u003cZip\u003e,\u003cCard_type\u003e,\u003ccard_no\u003e,\u003cmonth\u003e,\u003cyear\u003e,\u003cname_on_card\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Verify and click on the \u0027Purchase Flight\u0027 Button",
  "keyword": "Then "
});
formatter.step({
  "name": "the Confirmation page is launched Validate the PageResponse",
  "keyword": "When "
});
formatter.step({
  "name": "Confirm that \u0027ID\u0027 is got generated",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Departure_city",
        "Destination_City",
        "name",
        "address",
        "city",
        "state",
        "Zip",
        "Card_type",
        "card_no",
        "month",
        "year",
        "name_on_card"
      ]
    },
    {
      "cells": [
        "Paris",
        "London",
        "raja",
        "Brindhavan Street",
        "Chennai",
        "TamilNadu",
        "600091",
        "amex",
        "1234567898743214",
        "12",
        "2015",
        "Raja"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the Confirmation Page Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User will launch the Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the Departure city as Paris",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the Destination City as London",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on the \u0027Find Flights\u0027 button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "choose the Flight in Reserve page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the Individual Fields raja,Brindhavan Street,Chennai,TamilNadu,600091,amex,1234567898743214,12,2015,Raja",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify and click on the \u0027Purchase Flight\u0027 Button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the Confirmation page is launched Validate the PageResponse",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Confirm that \u0027ID\u0027 is got generated",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});