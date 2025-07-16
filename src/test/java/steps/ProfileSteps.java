package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProfilePage;


public class ProfileSteps {

    ProfilePage profilePage = new ProfilePage();

    @And("they click on the Avatar icon")
    public void theyClickOnTheAvatarIconOnTheProfilePage() {
        profilePage.clickOnTheAvatarIconOnTheProfilePage();
    }

    @And("they click on the Delete button")
    public void theyClickOnTheDeleteButtonOnTheProfilePage() {
        profilePage.clickOnTheDeleteButtonOnTheProfilePage();
    }

    @Then("the Upload button is present")
    public void theUploadButtonOnTheProfilePageIsPresent() {
        profilePage.assertTheUploadButtonOnTheProfilePageIsPresent();}

    @When("they clear Last name field on the Profile Page")
    public void theyClearLastNameFieldOnTheProfilePage() {
        profilePage.clearLastNameFieldOnTheProfilePage();
    }

    @And("they enter {string} in Last name field on the Profile Page")
    public void theyEnterLastNameInLastNameFieldOnTheProfilePage(String lastName) {
        profilePage.enterLastNameOnTheProfilePage(lastName);
    }

    @And("they click the Save button")
    public void theyClickTheSaveButtonOnTheProfilePage() {
        profilePage.clickTheSaveButtonOnTheProfilePage();
    }

    @Then("Last name {string} in Last Name field on Profile Page is present")
    public void lastNameInLastNameFieldOnProfilePageIsPresent(String lastName) {
        profilePage.assertLastNameInLastNameFieldOnProfilePageIsPresent(lastName);
    }

    @When("they clear First name field on the Profile page")
    public void theyClearFirstNameFieldOnTheProfilePage() {
        profilePage.clearFirstNameFieldOnTheProfilePage();
    }

    @And("they enter {string} in First name field on the Profile Page")
    public void theyEnterFirstNameOnProfilePage(String firstName) {
        profilePage.enterFirstNameOnProfilePage(firstName);
    }

    @Then("First name on Profile page is updated to {string}")
    public void assertFirstNameOnProfilePageIsDisplayed(String firstName) {
        profilePage.assertFirstNameOnProfilePageIsDisplayed(firstName);
    }

    @And("a user is logged out of the account")
    public void aUserIsLoggedOutOfTheAccount() {
        profilePage.clickOnTheAvatarIconOnTheProfilePage();
        profilePage.clickLogOutButton();
    }
}