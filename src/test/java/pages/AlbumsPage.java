package pages;

import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

public class AlbumsPage extends BasePage{
    private static final String ALBUMS_BUTTON_ON_HOME_PAGE = "xpath=//div[text()='Albums']";
    private static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//b[text()='Create new']";
    private static final String LABEL_CREATE_NEW_ALBUM_WINDOW = "xpath=//div[text()='Create a new Album']";
    private static final String INPUT_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    private static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    private static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    private static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";
    private static final String POP_UP_MSG_IF_ALBUM_ALREADY_EXISTS = "xpath=//span[text()='Album with this name exists']";
    private static final String POP_UP_MSG_WHEN_ALBUM_IS_CREATED = "xpath=//div[@class='ant-notification-notice-with-icon']";
    private static final String ALBUMS_RIGHT_PANEL = "xpath=//div[contains(@class,'layout_rightPanel')]";

    public String getAlbumsButtonOnHomePage() {
        return ALBUMS_BUTTON_ON_HOME_PAGE;
    }

    public String getCreateNewAlbumButton() {
        return CREATE_NEW_ALBUM_BUTTON;
    }

    public static String getLabelCreateNewAlbumWindow() {
        return LABEL_CREATE_NEW_ALBUM_WINDOW;
    }

    public static String getInputCreateNewAlbumWindow() {
        return INPUT_CREATE_NEW_ALBUM_WINDOW;
    }

    public static String getCreateButtonNewAlbumWindow() {
        return CREATE_BUTTON_NEW_ALBUM_WINDOW;
    }

    public static String getPopUpMsgWhenAlbumIsCreated() {
        return POP_UP_MSG_WHEN_ALBUM_IS_CREATED;
    }
    public static String getAlbumsRightPanel(){
        return ALBUMS_RIGHT_PANEL;
    }
    public void clickCreateNew() {
        wait.forElementToBeDisplayed(10, getByObject(getCreateNewAlbumButton()), "Create New Icon");
        WebElement foundElement = driver.findElement(getByObject(getCreateNewAlbumButton()));
        foundElement.click();
    }
    public void waitForCreateNewAlbumIsVisible() {
        wait.forElementToBeDisplayed(10, getByObject(getLabelCreateNewAlbumWindow()), "Create New Album Window");
        wait.forElementToBeInteractable(10, getByObject(getLabelCreateNewAlbumWindow()), "Create New Album Window");
    }
    public void sendKeyToCreateNewAlbumWindow(String keyParam) {
        wait.forElementToBeDisplayed(10, getByObject(getInputCreateNewAlbumWindow()), "Input Create New Album Window");
        WebElement foundElement = driver.findElement(getByObject(getInputCreateNewAlbumWindow()));
        foundElement.sendKeys(keyParam);
    }
    public void clickCreateButtonInCreateNewWindow() {
        wait.forElementToBeDisplayed(10, getByObject(getCreateButtonNewAlbumWindow()), "Create Button");
        WebElement foundElement = driver.findElement(getByObject(getCreateButtonNewAlbumWindow()));
        foundElement.click();
    }
    public void seeSuccessfulMessage() {
        wait.forElementToBeDisplayed(10, getByObject(getPopUpMsgWhenAlbumIsCreated()), "Success Message");
        WebElement foundElement = driver.findElement(getByObject(getPopUpMsgWhenAlbumIsCreated()));
        assertTrue(foundElement.isDisplayed());
    }
    public void assertAlbumIsDisplayed(String albumName) {
        String targetElement = "xpath=//div[contains(@class,'albums_text')]/b[text()='" + albumName + "']";
        wait.forElementToBeDisplayed(10, getByObject(targetElement), "Album Name");
        WebElement foundElement = driver.findElement(getByObject(targetElement));
        assertTrue(foundElement.isDisplayed());
    }

}
