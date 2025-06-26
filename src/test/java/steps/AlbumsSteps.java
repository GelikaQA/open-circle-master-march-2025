package steps;

import io.cucumber.java.en.And;
import pages.AlbumsPage;
import pages.BasePage;

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

    //@And("click Bucket Button on the Album they just created")
    //public void clickBucketButtonOnTheAlbumTheyJustCreated() {
      //  albumsPage.clickBucketButtonOnTheAlbumTheyJustCreated();
    //}

    @And("they see confirmation pop up window with text {string}")
    public void theySeeConfirmationPopUpWindowWithText(String message) {
        albumsPage.assertElementIsDisplayed(message);
    }

    @And("they verify that they Successful Creation Message")
    public void theyVerifyThatTheySuccessefulCreationMessage() {
        albumsPage.assertTextPresentedInPopUpMessage("Success");
    }
}
