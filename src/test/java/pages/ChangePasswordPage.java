package pages;

import org.openqa.selenium.WebElement;
import static tools.CommonTools.getByObject;

public class ChangePasswordPage extends BasePage{
    private static final String PROFILE_ICON = "xpath=//span[@class='ant-avatar-string']";
    private static final String CHANGE_PASSWORD_SECTION = "xpath=//span[text()='Change password']";
    private static final String CURRENT_PASSWORD_INPUT_FIELD = "xpath=//input[@id='oldPassword']";
    private static final String NEW_PASSWORD_INPUT_FIELD = "xpath=//input[@id='newPassword']";
    private static final String SAVE_BUTTON = "xpath=//div[contains(@class,'profile_passwordSave')]";
    private static final String CURRENT_PASSWORD_VISIBILITY_TOGGLE = "xpath=//input[@id='oldPassword']/following-sibling::span/child::span";
    private static final String NEW_PASSWORD_VISIBILITY_TOGGLE = "xpath=//input[@id='newPassword']/following-sibling::span/child::span";
    private static final String CURRENT_PASSWORD_HIDDEN_BY_DOTS = "xpath=//input[@id='oldPassword']";
    private static final String NEW_PASSWORD_HIDDEN_BY_DOTS = "xpath=//input[@id='newPassword']";

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

}