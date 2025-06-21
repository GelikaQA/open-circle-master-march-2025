package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @And("they click Save button on Change Password page")
    public void theyClickSaveButtonOnChangePasswordPage() {
        changePasswordPage.theyClickSaveButtonOnChangePasswordPage();
    }

    @Then("assert Warning message empty current password input field is displayed")
    public void assertWarningMessageEmptyCurrentPasswordInputFieldIsDisplayed() {
        changePasswordPage.assertWarningMessageEmptyCurrentPasswordInputFieldIsDisplayed();
    }


    @And("they enter valid password  {string} in the Current password field on Change Password page")
    public void theyEnterValidPasswordInTheCurrentPasswordFieldOnChangePasswordPage(String password) {
        changePasswordPage.enterValidPasswordInCurrentPasswordInputFieldOnChangePasswordPage(password);
    }

    @Then("assert Warning message empty New password input field is displayed")
    public void assertWarningMessageEmptyNewPasswordInputFieldIsDisplayed() {
        changePasswordPage.assertWarningMessageEmptyNewPasswordInputFieldIsDisplayed();
    }
}