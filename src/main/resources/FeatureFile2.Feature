Feature: Navigating to Pages

//  Scenario: Navigate to Kearney Event Center Home Page
//    Given I have navigated to the "KearneyEventsHomePage" url
//    Then the Kearney Events Home page will be displayed

  Scenario: Navigate to the Contact Page
    Given I have navigated to the "ContactPage" url
    And I click on the Submit button
    Then NameFirstIsRequired field appears and turns red


