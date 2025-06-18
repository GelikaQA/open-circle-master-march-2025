package pages;

import tools.PropertiesLoader;

import static tools.CommonTools.getByObject;

public class LoginPage extends BasePage {

    private static final String SIGN_IN_BUTTON_ON_SIGN_IN_PAGE_LOCATOR = "xpath=//button/span[contains(text(), 'Sign in')]";
    private static final String EMAIL_INPUT_FIELD_LOCATOR = "id=email";
    private static final String PASSWORD_INPUT_FIELD_LOCATOR = "id=password";
    private static final String WARNING_MESSAGE_LOCATOR = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='Warning'])[1]/following::span[1]";
    private static final String SIGN_IN_MESSAGE_INVALID_EMAIL = "xpath=//li[text()='Invalid email address, limited to 32 characters']";
    private static final String SIGN_IN_MESSAGE_INVALID_PASSWORD = "xpath=//li[contains(text(),'Field should contain at least one upper-case')]";
    private static final String SIGN_IN_MESSAGE_POPUP_INVALID_EMAIL_PASSWORD = "xpath=//span[text()='Invalid email or password.']";
    private static final String CHAT_PAGE_HEADER_LOCATOR = "xpath=//div[contains(text(),'Bootcamp2025')]";

    public static String getSignInPage() {
        return PropertiesLoader.getProperties("signInUrl");
    }

    public static String getEmailInputFieldLocator() {
        return EMAIL_INPUT_FIELD_LOCATOR;
    }

    public static String getSignInButtonOnSignInPageLocator() {
        return SIGN_IN_BUTTON_ON_SIGN_IN_PAGE_LOCATOR;
    }

    public static String getPasswordInputFieldLocator() {
        return PASSWORD_INPUT_FIELD_LOCATOR;
    }

    public static String getWarningMessageLocator() {
        return WARNING_MESSAGE_LOCATOR;
    }
    public static String getChatPageHeaderLocator() { return CHAT_PAGE_HEADER_LOCATOR; }

    public void openSignInPage() {driver.get(getSignInPage());
    }

    public void clickSignInButton() {
        wait.forElementToBeDisplayed(10, getByObject(getSignInButtonOnSignInPageLocator()), "Sign In button");
        driver.findElement(getByObject(getSignInButtonOnSignInPageLocator())).click();
    }

    public void enterEmailOnSignInPage(String email) {
        wait.forElementToBeDisplayed(10, getByObject(getEmailInputFieldLocator()), "Email input field");
        driver.findElement(getByObject(getEmailInputFieldLocator())).sendKeys(email);
    }

    public void enterPasswordOnSignInPage(String email) {
        wait.forElementToBeDisplayed(10, getByObject(getPasswordInputFieldLocator()), "Password input field");
        driver.findElement(getByObject(getPasswordInputFieldLocator())).sendKeys(email);
    }

    public void assertNoUserWarningMessage() {
        wait.forElementToBeDisplayed(10, getByObject(getWarningMessageLocator()),
                "Warning message");
        assert driver.findElement(getByObject(getWarningMessageLocator())).getText().contains("User not found.");
    }
    public void assertChatPageHeaderLocator() {
        wait.forElementToBeDisplayed(10, getByObject(getChatPageHeaderLocator()),
                "Warning message");
        assert driver.findElement(getByObject(getChatPageHeaderLocator())).getText().contains("User not found.");
    }

}