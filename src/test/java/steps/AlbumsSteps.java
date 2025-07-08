package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AlbumsPage;

public class AlbumsSteps {

    AlbumsPage albumsPage = new AlbumsPage();

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

    //@Then("they verify that they see element {string}")
    //public void theyVerifyThatTheySeeElement(String element) {
      //  albumsPage.assertElementIsDisplayed(element);
    //}

    @And("they click Create button in create new album window")
    public void clickCreateButtonNewAlbumWindow() {
        albumsPage.clickCreateButtonNewAlbumWindow();
    }

    @And("they see confirmation pop up window with text {string}")
    public void theySeeConfirmationPopUpWindowWithText(String message) {
        albumsPage.assertElementIsDisplayed(message);
    }

    @And("they verify that they Successful Creation Message")
    public void theyVerifyThatTheySuccessfulCreationMessage() {
        albumsPage.assertTextPresentedInPopUpMessage("Success");
    }

    @Then("they assert the album name {string} presented on Album Page")
    public void assertAlbumNamePresentedOnAlbumPage(String albumTitle) {
        albumsPage.assertAlbumIsDisplayed(albumTitle);
    }

    @And("they delete album named {string} from Album Page")
    public void deleteAlbumNamed(String album) {
        albumsPage.clickDeleteAlbum(album);
    }

    @Then("confirmation message appears {string}")
    public void confirmationMessageAppears(String warningMessage) {
        albumsPage.assertDuplicateAlbumMessageDisplayed(warningMessage);
    }

//    @Then("new album with the given name is not present on the page")
//    public void new_album_with_the_given_name_is_not_present_on_the_page() {
//        albumsPage.assertDuplicateAlbumNotCreated("Test12345");
//    }

    @And("they click Cancel button on Create New Button Window")
    public void theyClickTheCancelButton() {
        albumsPage.clickCancelButtonNewAlbumWindow();
    }

    @And("they create new album with the name {string}")
    public void theyCreateNewAlbumWithTheName(String albumName) {
        albumsPage.createAlbum(albumName);
    }
}
