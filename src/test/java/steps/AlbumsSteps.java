package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AlbumsPage;
import pages.BasePage;

public class AlbumsSteps {

    AlbumsPage albumsPage = new AlbumsPage();
    BasePage basePage = new BasePage();

        @And("they click the Albums button")
    public void theyClickTheAlbumsButton() {
        albumsPage.clickAlbumsButtonOnHomePage();
    }
    @And("click Create new album button on Albums page")
    public void createNewAlbumButton() {
        albumsPage.clickAlbumsButtonOnHomePage();
    }
    @And("they enter a new unique Album name")
    public void theyEnteraNewUniqueAlbumName(String text, String inputElement) {
        albumsPage.sendKeyToElement(text, inputElement);
    }

    @And("they enter {string} unique Album name in the pop up field")
    public void theyEnterNewUniqueAlbumNameInThePopUpField(String CreateANewAlbum) {
            albumsPage.enterNewUniqueAlbumNameOnPopUpWindow(CreateANewAlbum);
    }
}
