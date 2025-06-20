package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.SignInPage;


public class SignInSteps {

    SignInPage signInPage = new SignInPage();
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();

    @Given("a Circle User is on Sign In page")
    public void openSignInPage() {
        signInPage.openSignInPage();
    }

    @When("they enter {string} address")
    public void enterInvalidEmail(String email) {
        signInPage.enterEmailOnSignInPage(email);
    }

    @And("they enter {string}")
    public void theyEnterPassword(String password) {
        signInPage.enterPasswordOnSignInPage(password);
    }

    @And("click Sign In button")
    public void clickSignInButton() {
        signInPage.clickSignInButton();
    }

    @Then("they see a warning message")
    public void theySeeWarningMessage() {
        signInPage.assertNoUserWarningMessage();
    }

    @Given("a user opens Login page")
    public void aUserOpensLoginPage() {
        signInPage.openSignInPage();
    }

    @When("they enter {string} in Email input field on Login page")
    public void enterValidEmail(String email) {
        email = email.replace("·", " ");
        signInPage.enterEmailOnSignInPage(email);
    }

    @And("they enter {string} in Password input field on Login page")
    public void theyEnterInPasswordInputFieldOnLoginPage(String password) {
        signInPage.enterPasswordOnSignInPage(password);
    }

    @And("they click Sign In button on Login page")
    public void theyClickSignInButton() {
        signInPage.clickSignInButton();
    }

    @Then("they verify that they are on Circle Home page")
    public void aUserVerifyThatTheyOnCircleHomePage() {
        homePage.assertCircleNameIsDisplayedOnHomePage();
    }

    @Given("a user is logged into the account")
    public void aUserIsLoggedIntoTheAccount() {
        signInPage.openSignInPage();
        signInPage.enterEmailOnSignInPage(SignInPage.getExistingEmail());
        signInPage.enterPasswordOnSignInPage(SignInPage.getExistingPassword());
        signInPage.clickSignInButton();
        homePage.assertCircleNameIsDisplayedOnHomePage();
    }

    @Then("error message under the email field is displayed: {string}")
    public void errorMessageUnderTheEmailFieldIsDisplayed(String InvalidEmailAddress) {
        signInPage.assertLoginPageEmailFieldMessageInvalidEmail(InvalidEmailAddress);
    }
}