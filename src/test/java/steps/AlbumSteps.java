package steps;

import io.cucumber.java.en.When;
import pages.AlbumsPage;

public class AlbumSteps {
    AlbumsPage albumsPage = new AlbumsPage();

    @When("a user click Albums Buttom")
    public void a_user_click_albums_buttom() {
        albumsPage.clickAlbumsButtonOnTheMainPage();
    }

    @When("they click create new album bottom")
    public void they_click_create_new_album_bottom() {
        albumsPage.clickCreateNewAlbumButton();
    }

    @When("they type name Album")
    public void they_type_name_album() {
        albumsPage.typeAlbumName("Test Album");
    }

    @When("they click the Cancel button")
    public void they_click_the_cancel_button() {
        albumsPage.clickCancelButtonNewAlbumWindow();
    }
}
