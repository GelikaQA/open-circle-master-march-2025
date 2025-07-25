package pages;

import org.openqa.selenium.WebElement;
import java.util.List;

import static org.junit.Assert.*;
import static tools.CommonTools.*;

public class AlbumsPage extends BasePage {
    private static final String ALBUMS_BUTTON_ON_HOME_PAGE = "xpath=//div[text()='Albums']";
    private static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//img[@alt='Avatar']";
    private static final String INPUT_FIELD_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    private static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    private static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    private static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";

    public static String getAlbumsButtonOnHomePage() {
        return ALBUMS_BUTTON_ON_HOME_PAGE;
    }

    public static String getCreateNewAlbumButton() {
        return CREATE_NEW_ALBUM_BUTTON;
    }

    public static String getInputFieldCreateNewAlbumWindow() {
        return INPUT_FIELD_CREATE_NEW_ALBUM_WINDOW;
    }

    public static String getCreateButtonNewAlbumWindow() {
        return CREATE_BUTTON_NEW_ALBUM_WINDOW;
    }

    public static String getCloseButtonNewAlbumWindow() {
        return CLOSE_BUTTON_NEW_ALBUM_WINDOW;
    }

    public static String getCancelButtonNewAlbumWindow() {
        return CANCEL_BUTTON_NEW_ALBUM_WINDOW;
    }

    public static String deleteAlbumLocator(String albumTitle) {
        return "xpath=//div[contains(@class,'albums_text')]/descendant::b[text()='" +
                albumTitle + "']/../../div/div[2]";
    }

    public static String selectAlbumLocator(String albumTitle) {
        return "xpath=//div[contains(@class,'albums_text')]/b[text()='" + albumTitle + "']";
    }

    public static String albumIconsListLocator(String albumTitle) {
        return  "xpath=//div[contains(@class,'albums_text')]/descendant::b[text()='" +
                albumTitle + "']/../../div/div";
    }

    public static void saveUniqueAlbumName(String albumName){
        putInContext("uniqueAlbumName", generateUniqueName(albumName));
    }

    public static String getUniqueAlbumName(String albumName){
        return getFromContext(albumName).toString();
    }

    public void clickAlbumsButtonOnHomePage() {
        wait.forElementToBeDisplayed(10, getByObject(getAlbumsButtonOnHomePage()), "Element");
        WebElement foundElement = driver.findElement(getByObject(getAlbumsButtonOnHomePage()));
        foundElement.click();
    }

    public void clickCreateNewAlbumButton() {
        wait.forElementToBeDisplayed(10, getByObject(getCreateNewAlbumButton()), "Element");
        WebElement foundElement = driver.findElement(getByObject(getCreateNewAlbumButton()));
        foundElement.click();
    }

    public void enterNewUniqueAlbumNameInPopUpWindow(String albumName) {
        wait.forElementToBeDisplayed(10, getByObject(getInputFieldCreateNewAlbumWindow()),
                "Input field create new album");
        WebElement foundElement = driver.findElement(getByObject(getInputFieldCreateNewAlbumWindow()));
        foundElement.sendKeys(albumName);
    }

    public void generateNewUniqueAlbumNameInPopUpWindow() {
        if (!scenarioContext.containsKey("uniqueAlbumName")){
            saveUniqueAlbumName("album");
        }
        enterNewUniqueAlbumNameInPopUpWindow(getUniqueAlbumName("uniqueAlbumName"));
    }

    public void clickCreateButtonNewAlbumWindow() {
        wait.forElementToBeDisplayed(10, getByObject(getCreateButtonNewAlbumWindow()), "Element");
        WebElement foundElement = driver.findElement(getByObject(getCreateButtonNewAlbumWindow()));
        foundElement.click();
    }

    public void assertAlbumIsDisplayed(String albumName) {
        wait.forElementToBeDisplayed(10, getByObject(selectAlbumLocator(albumName)), "Album Name");
        WebElement foundElement = driver.findElement(getByObject(selectAlbumLocator(albumName)));
        assertTrue(foundElement.isDisplayed());
    }

    public void assertUniqueAlbumIsDisplayed() {
        assertAlbumIsDisplayed(getUniqueAlbumName("uniqueAlbumName"));
    }

    public void clickDeleteAlbum(String album) {
        wait.forElementToBeDisplayed(10, getByObject(selectAlbumLocator(album)), "Select Album");
        WebElement foundElement = driver.findElement(getByObject(deleteAlbumLocator((album))));
        foundElement.click();
        wait.forElementToBeNotDisplayed(10, getByObject(selectAlbumLocator((album))), "Select Album");
    }

    public void clickDeleteUniqueAlbum(){
        clickDeleteAlbum(getUniqueAlbumName("uniqueAlbumName"));
    }

    public void clickCancelButtonNewAlbumWindow() {
        wait.forElementToBeDisplayed(10, getByObject(getCancelButtonNewAlbumWindow()), "Cancel button");
        WebElement cancelButton = driver.findElement(getByObject(getCancelButtonNewAlbumWindow()));
        cancelButton.click();
    }

    public void createAlbum(String albumName) {
        clickAlbumsButtonOnHomePage();
        clickCreateNewAlbumButton();
        enterNewUniqueAlbumNameInPopUpWindow(albumName);
        clickCreateButtonNewAlbumWindow();
    }

    public void createAlbumWithUniqueName(){
        clickAlbumsButtonOnHomePage();
        clickCreateNewAlbumButton();
        generateNewUniqueAlbumNameInPopUpWindow();
        clickCreateButtonNewAlbumWindow();
    }

    public void assertDuplicateAlbumNotCreated(String albumName) {
        List<WebElement> albums = driver.findElements(getByObject(selectAlbumLocator(albumName)));
        int albumCount = albums.size();
        assertTrue("Found " + albumCount + " albums with name '" + albumName +
                "'. Expected only one (no duplicate).", albumCount <= 1);
    }

    public void assertAlbumIsNotDisplayed(String albumName) {
        List<WebElement> listOfAlbums = driver.findElements(getByObject(selectAlbumLocator(albumName)));
            assertTrue(listOfAlbums.isEmpty());
    }

    public void assertAlbumIsNotDisplayed() {
        assertAlbumIsNotDisplayed(getUniqueAlbumName("uniqueAlbumName"));
    }

    public void assertBucketIconIsDisplayed(String albumName, boolean canDelete) {
        wait.forElementToBeDisplayed(10, getByObject(selectAlbumLocator(albumName)), "Album");
        List<WebElement> albumIcons = driver.findElements(getByObject(albumIconsListLocator(albumName)));
        if (canDelete){
            assertEquals(2,albumIcons.size());
        }else {
            assertEquals(1,albumIcons.size());
        }
    }

    public void assertBucketIconIsDisplayed(boolean canDelete){
        assertBucketIconIsDisplayed(getUniqueAlbumName("uniqueAlbumName"), canDelete);
    }
}