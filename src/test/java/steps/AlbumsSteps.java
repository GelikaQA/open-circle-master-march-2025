package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AlbumsPage;
import pages.BasePage;

public class AlbumsSteps {

    AlbumsPage albumsPage = new AlbumsPage();
    CommonSteps commonSteps = new CommonSteps();
    BasePage basePage = new BasePage();

    @And("they click the Albums button")
    public void clickAlbumsButtonOnHomePage() {
        albumsPage.clickAlbumsButtonOnHomePage();
    }

    @And("click Create new album button on Albums page")
    public void clickCreateNewAlbumButton() {
        albumsPage.clickCreateNewAlbumButton();
    }

    @And("they enter {string} unique Album name in the pop up field in create new album window")
    public void enterNewUniqueAlbumNameInPopUpWindow(String uniqueAlbumNameInPopUpWindow) {
        albumsPage.enterNewUniqueAlbumNameInPopUpWindow(uniqueAlbumNameInPopUpWindow);
    }

    @And("they click Create button in create new album window")
    public void clickCreateButtonNewAlbumWindow() {
        albumsPage.clickCreateButtonNewAlbumWindow();
    }


    @And("they see confirmation pop up window with text {string}")
    public void theySeeConfirmationPopUpWindowWithText(String message) {
        albumsPage.assertElementIsDisplayed(message);
    }

    @And("they verify that they Successful Creation Message")
    public void theyVerifyThatTheySuccessefulCreationMessage() {
        albumsPage.assertTextPresentedInPopUpMessage("Success");
    }

    @When("the user clicks the Albums button")
    public void the_user_clicks_the_albums_button() {
        albumsPage.clickAlbumsButtonOnTheMainPage();
    }

    @When("they click the Create New Album button")
    public void they_click_the_create_new_album_button() {
        albumsPage.clickCreateNewAlbumButton();
    }

    @When("they enter a name for the album")
    public void they_enter_a_name_for_the_album() {
        albumsPage.typeAlbumName("Test Album");
    }

    @When("they click the Cancel button")
    public void they_click_the_cancel_button() {
        albumsPage.clickCancelButtonNewAlbumWindow();
    }
}

//@And("click Bucket Button on the Album they just created")
//public void clickBucketButtonOnTheAlbumTheyJustCreated() {
//  albumsPage.clickBucketButtonOnTheAlbumTheyJustCreated();
//}

//@Then("they verify that they see element {string}")
//public void theyVerifyThatTheySeeElement(String element) {
//  albumsPage.assertElementIsDisplayed(element);
//}