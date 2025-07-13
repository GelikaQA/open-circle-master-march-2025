package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import pages.ChangePasswordPage;
import tools.PropertiesLoader;

public class ChangePasswordSteps {

    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @Given("they click Profile icon")
    public void theyClickProfileIcon() {
        changePasswordPage.clickProfileIcon();
    }

    @When("they click Change password section")
    public void theyClickChangePasswordSection() {
        changePasswordPage.clickChangePasswordSection();
    }

    @And("they enter {string} in Current password input field on Change password page")
    public void theyEnterPasswordInCurrentPasswordInputFieldOnChangePasswordPage(String Password) {
        changePasswordPage.enterPasswordInCurrentPasswordInputFieldOnChangePasswordPage(Password);
    }

    @And("they enter {string} in New password input field on Change password page")
    public void theyEnterPasswordInNewPasswordInputFieldOnChangePasswordPage(String Password) {
        changePasswordPage.enterPasswordInNewPasswordInputFieldOnChangePasswordPage(Password);
    }

    @And("they click Save button on Change password page")
    public void theyClickSaveButtonOnChangePasswordPage() {
        changePasswordPage.clickSaveButtonOnChangePasswordPage();
    }

    @Then("assert warning message pops-up {string}")
    public void assertWarningMessagePopsUp(String message) {
        changePasswordPage.assertWarningMessagePopsUp(message);
    }

}