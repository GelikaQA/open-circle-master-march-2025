package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChangePasswordPage;

public class ChangePasswordSteps {
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @Given("they click Profile icon")
    public void theyClickProfileIcon() {
        changePasswordPage.clickProfileIcon();
    }
    @And("they click Change password section")
    public void theyClickChangePasswordSection() {
        changePasswordPage.clickChangePasswordSection();
    }
    @And("they enter {string} in Current password input field")
    public void theyEnterPasswordInCurrentPasswordInputField(String Password) {
        changePasswordPage.enterPasswordInCurrentPasswordInputField(Password);
    }
    @And("they enter {string} in New password input field")
    public void theyEnterPasswordInNewPasswordInputField(String Password) {
        changePasswordPage.enterPasswordInNewPasswordInputField(Password);
    }
    @And("they click Save button")
    public void theySaveButton() {
        changePasswordPage.clickSaveButton();
    }
    @Then("assert Warning message empty current password input field is displayed")
    public void assertWarningMessageEmptyCurrentPasswordInputFieldIsDisplayed() {
        changePasswordPage.clickSaveButton();
    }

}
