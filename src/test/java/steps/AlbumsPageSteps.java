package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AlbumsPage;
import pages.BasePage;

public class AlbumsPageSteps extends BasePage {
    AlbumsPage albumsPage = new AlbumsPage();

    @And("a user opens Albums Page")
    public void aUserOpensCreateAlbumsPage() {
        driver.get("http://opencircle.us/albums");
    }

    @And("they click Create New on Album Page")
    public void theyClickCreateNewOnAlbumPage() {
        albumsPage.clickCreateNew();
    }

    @And("they wait for Create New Album Window is visible")
    public void waitForCreateNewAlbumIsVisible() {
        albumsPage.waitForCreateNewAlbumIsVisible();
    }

    @When("they enter title {string} in Create New Album Window")
    public void theyEnterNameInCreateNewWindow(String text) {
        albumsPage.sendKeyToCreateNewAlbumWindow(text);
    }
    @And("they click Create Button in Create New Album Window")
    public void theyClickCreateButtonInCreateNewWindow() {
        albumsPage.clickCreateButtonInCreateNewWindow();
    }

   @And("they verify that they see Successful Creation Message")
    public void theyVerifyThatTheySeeSuccessfulMessage() {
        albumsPage.seeSuccessfulMessage();
    }

    @Then("they assert the album name {string} presented on Album Page")
    public void assertAlbumNamePresentedOnAlbumPage(String albumTitle) {
        albumsPage.assertAlbumIsDisplayed(albumTitle);
    }

}
