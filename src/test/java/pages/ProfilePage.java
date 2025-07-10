package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

public class ProfilePage extends BasePage {
    private static final String PROFILE_AVATAR_ICON = "xpath=//div[contains(@class, 'profile_container')]";
    private static final String PROFILE_PAGE_TITLE = "xpath=//*[text()='Profile']";
    private static final String PROFILE_FIRST_NAME_INPUT_FIELD = "xpath=//input[@id='firstName']";
    private static final String PROFILE_LAST_NAME_INPUT_FIELD = "xpath=//input[@id='lastName']";
    private static final String PROFILE_SAVE_BUTTON = "xpath=//button[@type='submit' and @class='ant-btn css-o2xhy3 ant-btn-primary profile_saveNames__LN7Zn']";
    private static final String PROFILE_AVATAR_DELETE_BUTTON = "xpath=//button[@type='button' and @class='ant-btn css-o2xhy3 ant-btn-link profile_deleteImage__3FHe2']";
    private static final String PROFILE_UPLOAD_BUTTON = "xpath=//div[@class='ant-upload ant-upload-select']";
    private static final String PROFILE_CLOSE_BUTTON = "xpath=//button[@class='ant-drawer-close']";
    private static final String PROFILE_RESET_BUTTON = "xpath=//button[@type='button' and @class='ant-btn css-o2xhy3 ant-btn-default profile_reset__m5oZY']";
    private static final String ERROR_MESSAGE_SPEC_CHARS = "xpath=//div[text()='Field accepts alphabetical char and digits, no special chars allowed']";
    private static final String ERROR_MESSAGE_EMPTY_FIELD = "xpath=//div[text()='Please input your Last Name']";

    public static String getProfileAvatarIcon() {
        return PROFILE_AVATAR_ICON;
    }

    public static String getProfileAvatarDeleteButton() {
        return PROFILE_AVATAR_DELETE_BUTTON;
    }

    public static String getProfileUploadButton() {
        return PROFILE_UPLOAD_BUTTON;
    }

    public static String getProfileLastNameInputField() {
        return PROFILE_LAST_NAME_INPUT_FIELD;
    }

    public static String getProfileSaveButton() {
        return PROFILE_SAVE_BUTTON;
    }

    public static String getProfilePageTitle() {
        return PROFILE_PAGE_TITLE;
    }

    public static String getProfileFirstNameInputField() {
        return PROFILE_FIRST_NAME_INPUT_FIELD;
    }

    public static String getProfileCloseButton() {
        return PROFILE_CLOSE_BUTTON;
    }

    public static String getProfileResetButton() {
        return PROFILE_RESET_BUTTON;
    }

    public static String getErrorMessageSpecChars() {
        return ERROR_MESSAGE_SPEC_CHARS;
    }

    public static String getErrorMessageEmptyField() {
        return ERROR_MESSAGE_EMPTY_FIELD;
    }

    public void clickOnTheAvatarIcon() {
        wait.forElementToBeDisplayed(10, getByObject(getProfileAvatarIcon()), "Avatar Icon");
        WebElement foundElement = driver.findElement(getByObject(getProfileAvatarIcon()));
        foundElement.click();
    }

    public void clickOnTheDeleteButton() {
        wait.forElementToBeDisplayed(10, getByObject(getProfileAvatarDeleteButton()),
                "Avatar Delete Button");
        WebElement foundElement = driver.findElement(getByObject(getProfileAvatarDeleteButton()));
        foundElement.click();
    }

    public void assertTheUploadButtonIsPresent() {
        wait.forElementToBeDisplayed(10, getByObject(getProfileUploadButton()), "Upload Button");
        WebElement foundElement = driver.findElement(getByObject(getProfileUploadButton()));
        assertTrue(foundElement.isDisplayed());
    }

    public void clearLastNameFieldOnTheProfilePage() {
        WebElement foundElement = driver.findElement(getByObject(getProfileLastNameInputField()));
        foundElement.click();
        foundElement.sendKeys(Keys.chord(Keys.COMMAND, "a"), Keys.DELETE);
    }

    public void enterLastNameOnTheProfilePage(String lastName) {
        wait.forElementToBeDisplayed(10, getByObject(getProfileLastNameInputField()),
                "Last name input field");
        WebElement foundElement = driver.findElement(getByObject(getProfileLastNameInputField()));
        foundElement.sendKeys(lastName);
    }

    public void clickTheSaveButton() {
        wait.forElementToBeDisplayed(10, getByObject(getProfileSaveButton()),
                "Save button");
        WebElement foundElement = driver.findElement(getByObject(getProfileSaveButton()));
        foundElement.click();
    }

    public void assertLastNameInLastNameFieldOnProfilePageIsPresent(String lastName) {
        WebElement foundElement = driver.findElement(getByObject(getProfileLastNameInputField()));
        String elementText = foundElement.getAttribute("value");
        String message = "Text '" + lastName + "' 'in Last name input field is not presented. 'Actual text is '"
                + elementText + "'";
        assertTrue(message, elementText.contains(lastName));
    }

    public void clearFirstNameFieldOnTheProfilePage() {
        WebElement foundElement1 = driver.findElement(getByObject(getProfileFirstNameInputField()));
        foundElement1.click();
        foundElement1.sendKeys(Keys.chord(Keys.COMMAND, "a"), Keys.DELETE);
    }

    public void enterInLowercaseLettersInTheFirstNameField(String firstName) {
        wait.forElementToBeDisplayed(10, getByObject(getProfileFirstNameInputField()), "First Name Input Field");
        WebElement foundElement = driver.findElement(getByObject(getProfileFirstNameInputField()));
        foundElement.sendKeys(firstName);
    }

    public void assertFirstNameOnProfilePageIsDisplayed(String firstName) {
        WebElement foundElement = driver.findElement(getByObject(getProfileFirstNameInputField()));
        String elementText = foundElement.getAttribute("value");
        String message = "Text '" + firstName + "' 'in Last name input field is not presented. 'Actual text is '"
                + elementText + "'";
        assertTrue(message, elementText.contains(firstName));
    }
}