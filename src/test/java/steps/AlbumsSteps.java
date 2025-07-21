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
        albumsPage.assertDuplicateAlbumMessageIsDisplayed(warningMessage);
    }

    @And("they click Cancel button on Create New Album Window")
    public void theyClickTheCancelButton() {
        albumsPage.clickCancelButtonNewAlbumWindow();
    }

    @And("they create new album with the name {string}")
    public void theyCreateNewAlbumWithTheName(String albumName) {
        albumsPage.createAlbum(albumName);
    }

    @Then("they verify no duplicate album with the name {string} was created")
    public void verifyNoDuplicateAlbumCreated(String albumName) {
        albumsPage.assertDuplicateAlbumNotCreated(albumName);
    }

    @And("they verify no album with the name {string} was created")
    public void theyVerifyNoAlbumWithTheNameWasCreated(String albumName) {
        albumsPage.assertAlbumIsNotDisplayed(albumName);
    }
}
