package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AlbumsPage;
import pages.BasePage;

public class AlbumsSteps {

    AlbumsPage albumsPage = new AlbumsPage();
    CommonSteps commonSteps = new CommonSteps();
    BasePage basePage = new BasePage();

    @And("a user opens Albums Page")
    public void aUserOpensCreateAlbumsPage() {
        driver.get("http://opencircle.us/albums");
    }

    @And("they click the Albums button")
    public void theyClickTheAlbumsButton() {
        albumsPage.clickAlbumsButtonOnHomePage();
    }
    @And("click Create new album button on Albums page")
    public void theyClickCreateNewAlbumButton() {
        albumsPage.clickClickCreateNewAlbumButton();

    }



    @And("they enter a new unique Album name")
    public void theyEnteraNewUniqueAlbumName(String text, String inputElement) {
        albumsPage.sendKeyToElement(text, inputElement);
    }

    //@And("they enter a new unique Album name")
    //public void theyEnterNewUniqueAlbumNameInThePopUpField(String CreateANewAlbum) {
      //      albumsPage.enterNewUniqueAlbumNameOnPopUpWindow(CreateANewAlbum);
    //}
}
