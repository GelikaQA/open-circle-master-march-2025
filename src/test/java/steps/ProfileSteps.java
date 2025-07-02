package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProfilePage;


public class ProfileSteps {

    ProfilePage profilePage = new ProfilePage();

    @And("they click on the Avatar icon")
    public void theyClickOnTheAvatarIcon() {
        profilePage.clickOnTheAvatarIcon();
    }

    @And("they click on the Delete button")
    public void theyClickOnTheDeleteButton() {
        profilePage.clickOnTheDeleteButton();
    }

    @Then("they see the Upload button")
    public void theySeeTheUploadButton() {
        profilePage.seeTheUploadButton();
    }

    @When("they clear Last name field on the Profile Page")
    public void theyClearLastNameFieldOnTheProfilePage() {
        profilePage.clearLastNameFieldOnTheProfilePage();
    }

    @And("they enter {string} in Last name field on the Profile Page")
    public void theyEnterSmith1InTheLastNameFieldOnTheProfilePage(String lastName) {
        profilePage.enterLastNameOnTheProfilePage(lastName);
    }

    @And("they click the Save button")
    public void theyClickTheSaveButton() {
        profilePage.clickTheSaveButton();
    }

    @Then("Last name {string} presented in Last name field")
    public void lastNameSmith1PresentedInLastNameField(String lastName) {
        profilePage.lastNameSmith1PresentedInLastNameField(lastName);
    }
}