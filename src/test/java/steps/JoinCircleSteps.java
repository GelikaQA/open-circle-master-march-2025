package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JoinCirclePage;
import tools.PropertiesLoader;

import static pages.JoinCirclePage.getJoinCirclePasswordInputField;

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
        joinCirclePage.enterPasscodeOnJoinCirclePage(passcode);

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
        joinCirclePage.clickJoinButtonOnJoinCirclePage();

    }

    @Then("they are still on the Join Circle page as the registration was not completed")
    public void theyAreStillOnTheJoinCirclePageAsTheRegistrationWasNotCompleted() {
        joinCirclePage.assertTheyAreOnJoinCirclePage();
    }

    @And("Warning message appears: {string}")
    public void warningMessageAppearsIncorrectPasscodePleaseTryAgain(String incorrectPasscode) {
        joinCirclePage.assertWarningMessageIncorrectPasscodeOnJoinCirclePageIsDisplayed(incorrectPasscode);
    }

    @And("under the field First Name the Warning message is displayed: {string}")
    public void underTheFieldFirstNameTheWarningMessageThisInputIsRequiredIsDisplayed(String incorrectFirstName) {
        joinCirclePage.assertFirstNameFieldWarningMessageIsDisplayed(incorrectFirstName);
    }

    @And("they selected and copy entered password on the Join Circle page")
    public void theySelectedAndCopyEnteredPasswordOnTheJoinCirclePage() {
        joinCirclePage.copyHiddenPasswordOnJoinCirclePage();
    }

    @And("they activated context menu on the Join Circle page")
    public void theyActivatedContextMenuOnTheJoinCirclePage() {
        joinCirclePage.openedContextMenuOnJoinCirclePage();
    }

    @Then("The {string} is not copied into clipboard")
    public void thePasswordIsNotCopiedIntoClipboard(String password) {
        joinCirclePage.assertPasswordIsNotCopiedIntoClipboardFromPasswordField(password);
    }

    @When("they enter a valid password in the password field on the Join Circle page")
    public void theyEnterValidPasswordInPasswordFieldOnJoinCirclePage() {
        joinCirclePage.enterValidPasswordInPasswordFieldOnJoinCirclePage(PropertiesLoader.getProperties("password"));
    }

    @Then("The password is masked on Join Circle Page")
    public void thePasswordIsMaskedOnJoinCirclePage() {
        joinCirclePage.assertPasswordIsMasked(getJoinCirclePasswordInputField());
    }

// for next test case
//    @And("they copy password from the context menu on the Join Circle page")
//    public void theyCopyPasswordFromTheContextMenuOnTheJoinCirclePage() {
//        joinCirclePage.CopyPasswordFromContextMenuOnJoinCirclePage();
//    }
@Then("under the field 'Last Name' the Warning message is displayed: {string}")
public void warningMessageUnderLastNameFieldIsDisplayed(String expectedWarningMessage) {
    joinCirclePage.assertWarningMessageForLastNameOnJoinCirclePageIsDisplayed(expectedWarningMessage);
}
}

