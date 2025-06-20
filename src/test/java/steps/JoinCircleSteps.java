package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JoinCirclePage;

public class JoinCircleSteps {

    JoinCirclePage joinCirclePage = new JoinCirclePage();

    @Given("a user opens Join Circle page")
    public void aUserOpensJoinCirclePage() {
        joinCirclePage.openJoinCirclePage();
    }

    @When("they enter {string} in the field Circle Name on the Join Circle page")
    public void theyEnterInTheFieldCircleNameOnTheJoinCirclePage(String circleName) {
        joinCirclePage.enterCircleNameOnJoinCirclePage(circleName);
    }


    @And("enters {string} in the Passcode field on the Join Circle page")
    public void entersInThePasscodeFieldOnTheJoinCirclePage(String Passcode) {
        joinCirclePage.enterPasscodeFieldOnTheJoinCirclePage(Passcode);

    }

    @And("enters {string} in the First Name field on the Join Circle page")
    public void entersInTheFirstNameFieldOnTheJoinCirclePage(String FirstName) {
        joinCirclePage.enterFirstNameOnJoinCirclePage(FirstName);
    }

    @And("enters {string} in the Last Name field on the Join Circle page")
    public void entersInTheLastNameFieldOnTheJoinCirclePage(String LastName) {
        joinCirclePage.enterLastNameOnJoinCirclePage(LastName);
    }

    @And("enters {string} in the Email field on the Join Circle page")
    public void entersInTheEmailFieldOnTheJoinCirclePage(String Email) {
        joinCirclePage.enterEmailOnJoinCirclePage(Email);
    }

    @And("enters {string} in the Password field on the Join Circle page")
    public void entersInThePasswordFieldOnTheJoinCirclePage(String Password) {
        joinCirclePage.enterPasswordOnJoinCirclePage(Password);
    }

    @And("They press button {string} on the Join Circle page")
    public void theyPressButtonJoinOnTheJoinCirclePage(String SignInButton) {
        joinCirclePage.clickElement(SignInButton);

    }

    @Then("they are still on the Join Circle page as the registration was not  completed")
    public void theyAreStillOnTheJoinCirclePageAsTheRegistrationWasNotCompleted() {
        joinCirclePage.assertTheyAreStillOnJoinCirclePage();
    }

    @And("And At right side corner Warning message appears: {string}")
    public void andAtRightSideCornerWarningMessageAppearsIncorrectPasscodePleaseTryAgain(String IncorrectPasscode) {
        joinCirclePage.assertAtRightSideCornerWarningMessageAppearsIncorrectPasscode(IncorrectPasscode);
    }

    @And("a warning message {string} is displayed under the Passcode field")
    public void aWarningMessageIncorrectPasscodePleaseTryAgainIsDisplayedUnderThePasscodeField() {
    }
}
