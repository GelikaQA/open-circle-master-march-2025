package pages;

import hooks.Wait;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

import static hooks.Setup.driver;

public class AlbumsPage {
    private static final String ALBUMS_BUTTON_ON_THE_MAIN_PAGE = "xpath=//div[text()='Albums']";
    private static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//b[text()='Create new']";
    private static final String LABEL_CREATE_NEW_ALBUM_WINDOW = "xpath=//div[text()='Create a new Album']";
    private static final String INPUT_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    private static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    private static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    private static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";
    private static final String POP_UP_MSG_IF_ALBUM_ALREADY_EXISTS = "xpath=//span[text()='Album with this name exists']";
    private static final String POP_UP_MSG_WHEN_ALBUM_IS_CREATED = "xpath=//div[@class='ant-notification-notice-with-icon']";
    private Wait wait;

    public AlbumsPage() {
        this.wait = new Wait(driver);
    }

    public static String getAlbumsButtonOnTheMainPage(){
        return ALBUMS_BUTTON_ON_THE_MAIN_PAGE;

    }

    // Clicks the Albums button on the main page
    public void clickAlbumsButtonOnTheMainPage() {
        wait.forElementToBeDisplayed(10, getByObject(ALBUMS_BUTTON_ON_THE_MAIN_PAGE), "Albums Button");
        WebElement el = driver.findElement(getByObject(ALBUMS_BUTTON_ON_THE_MAIN_PAGE));
        el.click();
    }

    public String getCreateNewAlbumButton() {
        return CREATE_NEW_ALBUM_BUTTON;
    }

    // Clicks the "Create new" album button
    public void clickCreateNewAlbumButton() {
        wait.forElementToBeDisplayed(10, getByObject(CREATE_NEW_ALBUM_BUTTON), "Create New Album Button");
        WebElement el = driver.findElement(getByObject(CREATE_NEW_ALBUM_BUTTON));
        el.click();
    }

    public String getInputCreateNewAlbumWindow(){
        return INPUT_CREATE_NEW_ALBUM_WINDOW;
    }

    // Clicks the input field in the Create New Album window
    public void clickInputCreateNewAlbumWindow() {
        wait.forElementToBeDisplayed(10, getByObject(INPUT_CREATE_NEW_ALBUM_WINDOW), "Input Create New Album Window");
        WebElement el = driver.findElement(getByObject(INPUT_CREATE_NEW_ALBUM_WINDOW));
        el.click();
    }

    public void typeAlbumName(String albumName) {
        wait.forElementToBeDisplayed(10, getByObject(INPUT_CREATE_NEW_ALBUM_WINDOW), "Input Create New Album Window");
        WebElement input = driver.findElement(getByObject(INPUT_CREATE_NEW_ALBUM_WINDOW));
        input.clear();
        input.sendKeys(albumName);
    }

    public String getCancelButtonNewAlbumWindow() {
        return CANCEL_BUTTON_NEW_ALBUM_WINDOW;
    }

    // Clicks the Cancel button in the Create New Album window
    public void clickCancelButtonNewAlbumWindow() {
        wait.forElementToBeDisplayed(10, getByObject(CANCEL_BUTTON_NEW_ALBUM_WINDOW), "Cancel Button New Album Window");
        WebElement el = driver.findElement(getByObject(CANCEL_BUTTON_NEW_ALBUM_WINDOW));
        el.click();
    }
}

