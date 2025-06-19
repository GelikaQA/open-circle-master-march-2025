package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import static hooks.Setup.driver;

public class AlbumsPage {
    public static final String ALBUMS_BUTTON_ON_THE_MAIN_PAGE = "xpath=//div[text()='Albums']";
    public static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//b[text()='Create new']";
    public static final String LABEL_CREATE_NEW_ALBUM_WINDOW = "xpath=//div[text()='Create a new Album']";
    public static final String INPUT_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    public static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    public static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    public static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";

    public static String getAlbumsButtonOnTheMainPage(){
        return ALBUMS_BUTTON_ON_THE_MAIN_PAGE;
    }
    public void ALBUMS_BUTTON_ON_THE_MAIN_PAGE() {
        driver.get("http://opencircle.us/albums");
    }
    public static String getCreateNewAlbumButton() {
        return CREATE_NEW_ALBUM_BUTTON;
    }
        public void CREATE_NEW_ALBUM_BUTTON() {
            driver.get("http://opencircle.us/albums");
        }
    public static String getInputCreateNewAlbumWindow(){
        return INPUT_CREATE_NEW_ALBUM_WINDOW;
    }
    public void INPUT_CREATE_NEW_ALBUM_WINDOW() {
        driver.get("http://opencircle.us/albums");
    }
    public static String getCancelButtonNewAlbumWindow() {
        return CANCEL_BUTTON_NEW_ALBUM_WINDOW;
    }
    public void CANCEL_BUTTON_NEW_ALBUM_WINDOW() {
        driver.get("http://opencircle.us/albums");
    }
    }