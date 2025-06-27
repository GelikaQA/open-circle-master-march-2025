package pages;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

public class AlbumsPage extends BasePage {
    private static final String ALBUMS_BUTTON_ON_HOME_PAGE = "xpath=//div[text()='Albums']";
    private static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//img[@alt='Avatar']";
    private static final String INPUT_FIELD_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    private static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    private static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    private static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";
    private static final String POP_UP_MSG_IF_ALBUM_ALREADY_EXISTS = "xpath=//span[text()='Album with this name exists']";
    private static final String POP_UP_MSG_WHEN_ALBUM_IS_CREATED = "xpath=//div[@class='ant-notification-notice-with-icon']";
    private static final String POP_UP_TEXT_WHEN_ALBUM_IS_CREATED = "xpath=//div[@class='ant-notification-notice-description']";
    private static final String BUCKET_BUTTON_ON_THE_LAST_CREATED_ALBUM =
            "xpath=(//div[contains(@class, 'albums_bucketIcon')])[last()]";
    private static final String EXISTING_EMAIL = "arkadiy.popovtest@gmail.com";
    private static final String EXISTING_PASSWORD = "1234Qwer";

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
    public static String getPopUpMsgWhenAlbumIsCreated() {
        return POP_UP_MSG_WHEN_ALBUM_IS_CREATED;
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

    public void enterNewUniqueAlbumNameInPopUpWindow(String uniqueAlbumNameInPopUpWindow) {
        wait.forElementToBeDisplayed(10, getByObject(getInputFieldCreateNewAlbumWindow()),
                "Input field create new album");
        WebElement foundElement = driver.findElement(getByObject(getInputFieldCreateNewAlbumWindow()));
        foundElement.sendKeys(uniqueAlbumNameInPopUpWindow);
    }

    public void clickCreateButtonNewAlbumWindow() {
        wait.forElementToBeDisplayed(10, getByObject(getCreateButtonNewAlbumWindow()), "Element");
        WebElement foundElement = driver.findElement(getByObject(getCreateButtonNewAlbumWindow()));
        foundElement.click();
    }

    public void assertTextPresentedInPopUpMessage(String popUpMessage) {
        wait.forElementToBeDisplayed(10, getByObject(getPopUpMsgWhenAlbumIsCreated()),"Pop Up Message");
        WebElement foundElement = driver.findElement(getByObject(getPopUpMsgWhenAlbumIsCreated()));
        String elementText = foundElement.getText();
        assertTrue(elementText.contains(popUpMessage));
    }

    public void clickAlbumsButtonOnTheMainPage() {
        wait.forElementToBeDisplayed(10, getByObject(ALBUMS_BUTTON_ON_HOME_PAGE), "Albums Button");
        WebElement el = driver.findElement(getByObject(ALBUMS_BUTTON_ON_HOME_PAGE));
        el.click();
    }

    public void typeAlbumName(String albumName) {
        wait.forElementToBeDisplayed(10, getByObject(INPUT_FIELD_CREATE_NEW_ALBUM_WINDOW), "Input Create New Album Window");
        WebElement input = driver.findElement(getByObject(INPUT_FIELD_CREATE_NEW_ALBUM_WINDOW));
        input.clear();
        input.sendKeys(albumName);
    }

    public void clickCancelButtonNewAlbumWindow() {
        wait.forElementToBeDisplayed(10, getByObject(CANCEL_BUTTON_NEW_ALBUM_WINDOW), "Cancel Button New Album Window");
        WebElement el = driver.findElement(getByObject(CANCEL_BUTTON_NEW_ALBUM_WINDOW));
        el.click();
    }
}

//public void assertTextPresentedInPopUpMessage(String message) {
//  wait.forElementToBeDisplayed(10, getByObject(getPopUpMsgWhenAlbumIsCreated()), "Pop Up Message");
// WebElement foundElement = driver.findElement(getByObject(getPopUpMsgWhenAlbumIsCreated()));
//String actualText = foundElement.getText();
//assertTrue(elementText.contains(PopUpMessage));
//}

//    public void theySeeConfirmationPopUpWindowWithText(String targetElement) {
//        wait.forElementToBeDisplayed(10, getByObject(getPopUpMsgWhenAlbumIsCreated()), "Element");
//        WebElement foundElement = driver.findElement(getByObject(getPopUpMsgWhenAlbumIsCreated()));
//        assertTrue(foundElement.isDisplayed());
//    }