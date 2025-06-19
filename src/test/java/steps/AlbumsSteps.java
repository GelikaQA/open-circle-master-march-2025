package steps;

import io.cucumber.java.en.And;
import pages.AlbumsPage;

public class AlbumsSteps {

    AlbumsPage albumsPage = new AlbumsPage();

    @And("a user click Albums Buttom")
    public void auserOpenMainAlbumsPage() {
        albumsPage.ALBUMS_BUTTON_ON_THE_MAIN_PAGE();
    }

    @And("they click create new Album button")
    public void theyClickCreateNewAlbumbutton() {
        albumsPage.CREATE_NEW_ALBUM_BUTTON();
    }

    @And("they type name Album")
    public void theyTypeNameAlbum() {
        albumsPage.INPUT_CREATE_NEW_ALBUM_WINDOW();
    }
    @And("they click the Cancel button")
    public void theyClickTheCancelButton() {
        albumsPage.CANCEL_BUTTON_NEW_ALBUM_WINDOW();
    }
}