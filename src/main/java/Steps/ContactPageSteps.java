package Steps;

    import Pages.ContactPage;
    import cucumber.api.java.en.Then;
    import cucumber.api.java.en.When;



public class ContactPageSteps {

    ContactPage CP = new ContactPage();


        @When("^I click on the Contact Page link$")
        public void iClickOnTheContactPageLink() throws Throwable {
        CP.clickOnTheContactPagelink();
    }

        @When("^I click on the Submit button$")
        public void iClickOnTheSubmitButton() throws Throwable {
        CP.clickOnTheSubmitButton();
        }

        @Then("^NameFirstIsRequired field appears and turns red$")
        public void nameFirstIsRequired() throws Throwable {
            CP.NameFirstIsRequiredIsRed();
    }
}
