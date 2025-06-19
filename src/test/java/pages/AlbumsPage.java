package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tools.CommonTools.getByObject;

public class AlbumsPage extends BasePage {
    private static final String ALBUMS_BUTTON_ON_THE_MAIN_PAGE = "xpath=//div[text()='Albums']";
    private static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//b[text()='Create new']";
    private static final String LABEL_CREATE_NEW_ALBUM_WINDOW = "xpath=//div[text()='Create a new Album']";
    private static final String INPUT_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    private static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    private static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    private static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";
    private static final String POP_UP_MSG_IF_ALBUM_ALREADY_EXISTS = "xpath=//span[text()='Album with this name exists']";
    private static final String POP_UP_MSG_WHEN_ALBUM_IS_CREATED = "xpath=//div[@class='ant-notification-notice-with-icon']";
    private static final String BUCKET_BUTTON_ON_THE_LAST_CREATED_ALBUM = "xpath= (//div[contains(@class, 'albums_bucketIcon')])[1]";

    public void clickElement() {
        wait.forElementToBeDisplayed(10, getByObject(ALBUMS_BUTTON_ON_THE_MAIN_PAGE), "Element");
        WebElement foundElement = driver.findElement(getByObject(ALBUMS_BUTTON_ON_THE_MAIN_PAGE));
        foundElement.click();
    }




    public void ALBUMS_BUTTON_ON_THE_MAIN_PAGE() {
        driver.get("http://opencircle.us/albums");
    }
    public void CREATE_NEW_ALBUM_BUTTON() {
        driver.get("http://opencircle.us/albums");
    }
    public void LABEL_CREATE_NEW_ALBUM_WINDOW() {
        driver.get("http://opencircle.us/albums");
    }
    public void INPUT_CREATE_NEW_ALBUM_WINDOW() {
        driver.get("http://opencircle.us/albums");
    }
    public void CLOSE_BUTTON_NEW_ALBUM_WINDOW() {
        driver.get("http://opencircle.us/albums");
    }
    public void CREATE_BUTTON_NEW_ALBUM_WINDOW() {
        driver.get("http://opencircle.us/albums");
    }
    public void POP_UP_MSG_IF_ALBUM_ALREADY_EXISTS() {
        driver.get("http://opencircle.us/albums");
    }
    public void POP_UP_MSG_WHEN_ALBUM_IS_CREATED() {
        driver.get("http://opencircle.us/albums");
    }
    public void BUCKET_BUTTON_ON_THE_LAST_CREATED_ALBUM() {
        driver.get("http://opencircle.us/albums");
    }

    public void clickByXpath(String xpath) {
        WebElement button = driver.findElement(By.xpath(xpath));
        button.click();

    }


}
