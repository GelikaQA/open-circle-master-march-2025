package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static tools.CommonTools.getByObject;

public class ChangePasswordPage extends BasePage{
    private static final String PROFILE_ICON = "xpath=//span[@class='ant-avatar ant-avatar-circle profile_avatar__Ubcja css-o2xhy3']";
    private static final String CHANGE_PASSWORD_SECTION = "xpath=//span[text()='Change password']";
    private static final String CURRENT_PASSWORD_INPUT_FIELD = "xpath=//input[@id='oldPassword']";
    private static final String NEW_PASSWORD_INPUT_FIELD = "xpath=//input[@id='newPassword']";
    private static final String SAVE_BUTTON = "xpath=//div[@class='profile_passwordSaveContainer__fkz2n']//descendant::button";
    private static final String WARNING_MESSAGE_EMPTY_CURRENT_PASSWORD_INPUT_FIELD = "xpath=//span[text()='Field: oldPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20']";
    private static final String SUCCESS_POPUP_MESSAGE_PASSWORD_HAS_BEEN_CHANGED_DISPLAYED = "xpath=//div[@class='ant-notification-notice-description']/descendant::span";
    private static final String WARNING_POP_UP_MESSAGE_EMPTY_NEW_PASSWORD_FIELD = "xpath=//span[text()='Field: newPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20']";
    private static final String NEW_INVALID_PASSWORD_ERROR_MESSAGE = "xpath=//div[contains(@class, 'ant-form-item-explain-error') and contains (text(), 'Password should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20')]";
    private static final String INVALID_CURRENT__PASSWORD_POP_UP_MESSAGE = "xpath=//span[text()='Incorrect password']";
    private static final String CURRENT_PASSWORD_VISIBILITY_TOGGLE_ENABLED = "xpath=//input[@id='oldPassword']/following-sibling::span/child::span";
    private static final String NEW_PASSWORD_VISIBILITY_TOGGLE_ENABLED = "xpath=//input[@id='newPassword']/following-sibling::span/child::span";
    private static final String CURRENT_PASSWORD_HIDDEN_BY_DOTS = "xpath=//span[@class='ant-input-affix-wrapper ant-input-password ant-input-affix-wrapper-status-success css-o2xhy3']/child::input[@id='oldPassword' and @type='password']";
    private static final String NEW_PASSWORD_HIDDEN_BY_DOTS = "xpath=//span[@class='ant-input-affix-wrapper ant-input-password ant-input-affix-wrapper-status-success css-o2xhy3']/child::input[@id='newPassword' and @type='password']";

    public void openLoginPage() {
        driver.get("http://opencircle.us/login");
    }
    public static String getProfileIcon() {
        return PROFILE_ICON;
    }
    public static String getChangePasswordSection() {
        return CHANGE_PASSWORD_SECTION;
    }
    public static String getCurrentPasswordInputField() {
        return CURRENT_PASSWORD_INPUT_FIELD;
    }
    public static String getNewPasswordInputField() {
        return NEW_PASSWORD_INPUT_FIELD;
    }
    public static String getSaveButton() {
        return SAVE_BUTTON;
    }
    public static String getWarningMessageEmptyCurrentPasswordInputField() {
        return WARNING_MESSAGE_EMPTY_CURRENT_PASSWORD_INPUT_FIELD;
    }
    public void clickProfileIcon() {
        wait.forElementToBeDisplayed(10,
                getByObject(getProfileIcon()),
                "Profile icon");
        driver.findElement(getByObject(getProfileIcon())).click();
    }
    public void clickChangePasswordSection() {
        wait.forElementToBeDisplayed(10,
                getByObject(getChangePasswordSection()),
                "Change password section");
        driver.findElement(getByObject(getChangePasswordSection())).click();
    }
    public void enterPasswordInCurrentPasswordInputField(String password) {
        wait.forElementToBeDisplayed(10,
                getByObject(getCurrentPasswordInputField()),
                "Current password input field");
        WebElement foundElement = driver.findElement(getByObject(getCurrentPasswordInputField()));
        foundElement.sendKeys(password);
    }
    public void enterPasswordInNewPasswordInputField(String password) {
        wait.forElementToBeDisplayed(10,
                getByObject(getNewPasswordInputField()),
                "New password input field");
        WebElement foundElement = driver.findElement(getByObject(getNewPasswordInputField()));
        foundElement.sendKeys(password);
    }
    public void clickSaveButton() {
        wait.forElementToBeDisplayed(10,
                getByObject(getSaveButton()),
                "Save button");
        driver.findElement(getByObject(getSaveButton())).click();
    }
    public void WarningMessageEmptyCurrentPasswordInputField() {
        wait.forElementToBeDisplayed(10,
                getByObject(getWarningMessageEmptyCurrentPasswordInputField()),
                "Verify that they see Warning message empty current password input field");
        driver.findElement(getByObject(getWarningMessageEmptyCurrentPasswordInputField())).click();
    }
}