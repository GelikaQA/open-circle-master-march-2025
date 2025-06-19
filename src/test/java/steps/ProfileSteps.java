package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
}