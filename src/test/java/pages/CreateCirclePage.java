package pages;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

public class CreateCirclePage extends BasePage {
    private static final String ADMIN_PASSWORD_INPUT_FIELD = "xpath=//input[contains(@class, 'form_form_control')]";
    private static final String ADMIN_PAGE_SUBMIT_BUTTON = "xpath=//button[@type='submit']";
    private static final String CREATE_CIRCLE_TITLE_HEADER = "xpath=//h1[contains(@class, 'login_auth_title')]";
    private static final String CIRCLE_NAME_FIELD_ON_CREATE_CIRCLE_PAGE = "id=circleId";
    private static final String CREATE_CIRCLE_PASSCODE_INPUT_FIELD = "id=passCode";
    private static final String GENERATE_PASSCODE_BUTTON_ON_CREATE_CIRCLE_PAGE = "xpath=//button[@class='ant-btn css-o2xhy3 ant-btn-primary'][1]";
    private static final String COPY_PASSCODE_BUTTON_ON_CREATE_CIRCLE_PAGE = "xpath=//button[@class='ant-btn css-o2xhy3 ant-btn-primary'][2]";
    private static final String FIRSTNAME_ON_CREATE_CIRCLE_PAGE = "id=firstName";
    private static final String LASTNAME_ON_CREATE_CIRCLE_PAGE = "id=lastName";
    private static final String EMAIL_ON_CREATE_CIRCLE_PAGE = "id=email";
    private static final String CREATE_CIRCLE_PASSWORD_INPUT_FIELD = "id=password";
    private static final String CREATE_CIRCLE_CREATE_BUTTON = "xpath=//button[contains(@class, 'login_submit')]";
    private static final String CREATE_CIRCLE_SIGN_IN_HYPERLINK = "xpath=//button[contains(@class, 'login_link')][1]";
    private static final String CREATE_CIRCLE_JOIN_CIRCLE_HYPERLINK = "xpath=//button[contains(@class, 'login_link')][2]";
    private static final String CREATE_CIRCLE_COPY_ERROR_POPUP = "xpath=//div[contains(@class, 'ant-notification ant-notification-topRight')]//span[text()='Generate PassCode firstly']";
    private static final String CREATE_CIRCLE_NON_UNIQUE_EMAIL_ERROR_POPUP = "xpath=//div[contains(@class, 'ant-notification ant-notification-topRight')]//span[text()='A user with such an email exists.']";
    private static final String CREATE_CIRCLE_NON_UNIQUE_CIRCLE_NAME_ERROR_POPUP = "xpath=//div[@class='ant-notification-notice-with-icon']//span[text()='A Circle with this name exists.']";
    private static final String CREATE_CIRCLE_FIELD_CONSTRAINT_ERROR_MESSAGE = "xpath=//ul[@class='form_text_danger__LQWyf']/li[text()='Field accepts alphabetical char and digits, no special chars allowed, limited to 32 characters']";
    private static final String CREATE_CIRCLE_ERROR_MESSAGE_FOR_EMPTY_FIRST_NAME_FIELD = "xpath=//div[@class='form_form_group__gzDYz'][label[@for='firstName']]//li[text()='This input is required.']";
    //  private static final String LOGIN_CREATE_CIRCLE_SUCCESS_POPUP = "xpath=//div[@class='ant-notification-notice-content']//span[text='You have successfully registered.']""; This XPath is for the success message that pops up in Login page after Circle is successfully created

    public static String getAdminPasswordInputField() {
        return ADMIN_PASSWORD_INPUT_FIELD;
    }

    public static String getAdminPageSubmitButton() {
        return ADMIN_PAGE_SUBMIT_BUTTON;
    }

    public static String getCircleNameFieldOnCreateCirclePage() {
        return CIRCLE_NAME_FIELD_ON_CREATE_CIRCLE_PAGE;
    }

    public static String getGeneratePasscodeButtonOnCreateCirclePage() {
        return GENERATE_PASSCODE_BUTTON_ON_CREATE_CIRCLE_PAGE;
    }

    public static String getFirstnameOnCreateCirclePage() {
        return FIRSTNAME_ON_CREATE_CIRCLE_PAGE;
    }

    public static String getLastnameOnCreateCirclePage() {
        return LASTNAME_ON_CREATE_CIRCLE_PAGE;
    }

    public static String getEmailOnCreateCirclePage() {
        return EMAIL_ON_CREATE_CIRCLE_PAGE;
    }

    public static String getCreateCirclePasscodeInputField() {
        return CREATE_CIRCLE_PASSWORD_INPUT_FIELD;
    }

    public static String getCreateCircleCreateButton() {
        return CREATE_CIRCLE_CREATE_BUTTON;
    }

    public static String getCreateCircleFieldConstraintErrorMessage() {
        return CREATE_CIRCLE_FIELD_CONSTRAINT_ERROR_MESSAGE;
    }

    public static String getCreateCircleErrorMessageForEmptyFirstNameField() {
        return CREATE_CIRCLE_ERROR_MESSAGE_FOR_EMPTY_FIRST_NAME_FIELD;
    }


    public void openCreateCirclePage() {
        driver.get("http://opencircle.us/create");
    }

    public void enterAdminPasswordOnAdminPage(String adminPassword) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getAdminPasswordInputField()),
                "Admin password input field");
        WebElement foundElement = driver.findElement(getByObject(getAdminPasswordInputField()));
        foundElement.sendKeys(adminPassword);
    }

    public void clickSubmitButton() {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getAdminPageSubmitButton()),
                "Admin page Submit button");
        WebElement foundElement = driver.findElement(getByObject(getAdminPageSubmitButton()));
        foundElement.click();
    }

    public void enterCircleNameOnCreateCirclePage(String circleName) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getCircleNameFieldOnCreateCirclePage()),
                "Circle name field");
        WebElement foundElement = driver.findElement(getByObject(getCircleNameFieldOnCreateCirclePage()));
        foundElement.sendKeys(circleName);
    }

    public void clickGenerateButtonOnCreateCirclePage() {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getGeneratePasscodeButtonOnCreateCirclePage()),
                "Generate passcode button");
        WebElement foundElement = driver.findElement(getByObject(getGeneratePasscodeButtonOnCreateCirclePage()));
        foundElement.click();
    }

    public void enterFirstNameOnCreateCirclePage(String firstName) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getFirstnameOnCreateCirclePage()),
                "First name field");
        WebElement foundElement = driver.findElement(getByObject(getFirstnameOnCreateCirclePage()));
        foundElement.sendKeys(firstName);
    }

    public void enterLastNameOnCreateCirclePage(String lastName) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getLastnameOnCreateCirclePage()),
                "Last name field");
        WebElement foundElement = driver.findElement(getByObject(getLastnameOnCreateCirclePage()));
        foundElement.sendKeys(lastName);
    }

    public void enterEmailOnCreateCirclePage(String email) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getEmailOnCreateCirclePage()),
                "Email field");
        WebElement foundElement = driver.findElement(getByObject(getEmailOnCreateCirclePage()));
        foundElement.sendKeys(email);
    }

    public void enterPasswordOnCreateCirclePage(String password) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getCreateCirclePasscodeInputField()),
                "Password field");
        WebElement foundElement = driver.findElement(getByObject(getCreateCirclePasscodeInputField()));
        foundElement.sendKeys(password);
    }

    public void clickCreateButtonOnCreateCirclePage() {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getCreateCircleCreateButton()),
                "Create button");
        WebElement foundElement = driver.findElement(getByObject(getCreateCircleCreateButton()));
        foundElement.click();
    }

    public void promptedByErrorMessageOnCreateCirclePage() {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getCreateCircleFieldConstraintErrorMessage()),
                "Error message");
        WebElement foundElement = driver.findElement(getByObject(getCreateCircleFieldConstraintErrorMessage()));
        assertTrue(foundElement.isDisplayed());
    }



    public void assertErrorMessageForEmptyFirstNameFieldOnCreateCirclePage(String error) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getCreateCircleErrorMessageForEmptyFirstNameField()),
                "Error message");
        WebElement foundElement = driver.findElement(getByObject(getCreateCircleErrorMessageForEmptyFirstNameField()));
        String elementText = foundElement.getText();

        String message = "Text '" + error + "' 'in " + getCreateCircleErrorMessageForEmptyFirstNameField() + " is presented.";
        assertTrue(message, elementText.contains(error));
    }
}
