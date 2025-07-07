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

    @And("they enter {string} in the Passcode field on the Join Circle page")
    public void entersInThePasscodeFieldOnTheJoinCirclePage(String passcode) {
        joinCirclePage.enterPasscodeFieldOnTheJoinCirclePage(passcode);

    }

    @And("they enter {string} in the First Name field on the Join Circle page")
    public void entersInTheFirstNameFieldOnTheJoinCirclePage(String firstName) {
        joinCirclePage.enterFirstNameOnJoinCirclePage(firstName);
    }

    @And("they enter {string} in the Last Name field on the Join Circle page")
    public void entersInTheLastNameFieldOnTheJoinCirclePage(String lastName) {
        joinCirclePage.enterLastNameOnJoinCirclePage(lastName);
    }

    @And("they enter {string} in the Email field on the Join Circle page")
    public void entersInTheEmailFieldOnTheJoinCirclePage(String email) {
        joinCirclePage.enterEmailOnJoinCirclePage(email);
    }

    @And("they enter {string} in the Password field on the Join Circle page")
    public void entersInThePasswordFieldOnTheJoinCirclePage(String password) {
        joinCirclePage.enterPasswordOnJoinCirclePage(password);
    }

    @And("They press button Join on the Join Circle page")
    public void theyPressButtonJoinOnTheJoinCirclePage() {
        joinCirclePage.theyPressButtonJoinOnTheJoinCirclePage();

    }

    @Then("they are still on the Join Circle page as the registration was not completed")
    public void theyAreStillOnTheJoinCirclePageAsTheRegistrationWasNotCompleted() {
        joinCirclePage.assertTheyAreStillOnJoinCirclePage();
    }

    @And("Warning message appears: {string}")
    public void warningMessageAppearsIncorrectPasscodePleaseTryAgain(String incorrectPasscode) {
        joinCirclePage.assertWarningMessageIncorrectPasscodeOnJoinCirclePageIsDisplayed(incorrectPasscode);
    }

    @And("Warning message is displayed: {string}")
    public void warningMessageIsDisplayed(String incorrectFirstName) {
        joinCirclePage.assertWarningMessageForFirstNameOnJoinCirclePageIsDisplayed(incorrectFirstName);
    }

    @And("under the field First Name the Warning message is displayed: {string}")
    public void underTheFieldFirstNameTheWarningMessageThisInputIsRequiredIsDisplayed(String emptyFirstName) {
        joinCirclePage.assertFirstNameFieldWarningMessageThisInputIsRequiredIsDisplayed(emptyFirstName);
    }

    @And("they selected and copy entered password on the Join Circle page")
    public void theySelectedAndCopyEnteredPasswordOnTheJoinCirclePage() {
        joinCirclePage.theyCopySelectedHiddenPasswordOnTheJoinCirclePage();
    }

    @And("they activated context menu on the Join Circle page")
    public void theyActivatedContextMenuOnTheJoinCirclePage() {
        joinCirclePage.theyActivatedContextMenuOnTheJoinCirclePage();
    }

    @Then("The password is not copied into clipboard")
    public void thePasswordIsNotCopiedIntoClipboard() {
        joinCirclePage.thePasswordIsNotCopiedIntoClipboardFromPasswordField();
    }

// for next test case
//    @And("they copy password from the context menu on the Join Circle page")
//    public void theyCopyPasswordFromTheContextMenuOnTheJoinCirclePage() {
//        joinCirclePage.theyCopyPasswordFromTheContextMenuOnTheJoinCirclePage();
//    }
}