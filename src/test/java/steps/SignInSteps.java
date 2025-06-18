package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;


public class SignInSteps {

    LoginPage signInPage = new LoginPage();
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

    @When("a user enter {string} in email input field on Login page")
    public void enterValidEmail(String email)
    { signInPage.enterEmailOnSignInPage(email);
    }

    @And("a user enter {string} in password input field on Login page")
    public void theyEnterInPasswordInputFieldOnLoginPage(String password) {
        signInPage.enterPasswordOnSignInPage(password);
    }

    @And("a user click Sign In button on Login page")
    public void theyClickSignInButton() {signInPage.clickSignInButton();
    }

    @Then("a user verify that they on circle Home page")
    public void aUserVerifyThatTheyOnCircleHomePage() {
        homePage.assertCircleNameIsDisplayedOnHomePage();
    }
}
