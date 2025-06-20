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


    @And("And they enter \"Old\" unique Album name in the pop up field")
    public void enterNewUniqueAlbumNameOnPopUpWindow(String inputFieldInPopUpWindow) {
        albumsPage.enterNewUniqueAlbumNameOnPopUpWindow(inputFieldInPopUpWindow);
    }


    @And("they enter {string} unique Album name in the pop up field")
    public void theyEnterUniqueAlbumNameInThePopUpField(String arg0) {

    }
}
