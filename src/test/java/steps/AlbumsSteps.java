package steps;

import io.cucumber.java.en.And;
import pages.AlbumsPage;
import pages.BasePage;

public class AlbumsSteps {

    AlbumsPage albumsPage = new AlbumsPage();
    BasePage basePage = new BasePage();

    public static void main(String[] args) {

    }

    @And("they click the Albums button")
    public void theyClickTheAlbumsButton() {
        albumsPage.clickElement();
    }
    @And("click Create new album button on Albums page")
    public void createNewAlbumButton() {
        albumsPage.clickElement();
    }
}
