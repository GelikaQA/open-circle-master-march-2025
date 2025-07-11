package pages;

import org.openqa.selenium.WebElement;
import tools.PropertiesLoader;

import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

public class CreateCirclePage extends BasePage {
    private static final String ADMIN_PASSWORD_INPUT_FIELD = "xpath=//input[contains(@class, 'form_form_control')]";
    private static final String ADMIN_PAGE_SUBMIT_BUTTON = "xpath=//button[@type='submit']";
    private static final String CIRCLE_NAME_FIELD_ON_CREATE_CIRCLE_PAGE = "id=circleId";
    private static final String GENERATE_PASSCODE_BUTTON_ON_CREATE_CIRCLE_PAGE = "xpath=//button[@class='ant-btn css-o2xhy3 ant-btn-primary'][1]";
    private static final String FIRSTNAME_ON_CREATE_CIRCLE_PAGE = "id=firstName";
    private static final String LASTNAME_ON_CREATE_CIRCLE_PAGE = "id=lastName";
    private static final String EMAIL_ON_CREATE_CIRCLE_PAGE = "id=email";
    private static final String CREATE_CIRCLE_PASSWORD_INPUT_FIELD = "id=password";
    private static final String CREATE_CIRCLE_CREATE_BUTTON = "xpath=//button[contains(@class, 'login_submit')]";
    private static final String CREATE_CIRCLE_FIRST_NAME_VALIDATION = "xpath=//div[label[@for='firstName']]//li";
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

    public static String getCreateCircleFirstNameValidation() {
        return CREATE_CIRCLE_FIRST_NAME_VALIDATION;
    }

    public void openCreateCirclePage() {
        driver.get(PropertiesLoader.getProperties("createCircleUrl"));
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

//    public void anErrorMessagePopulatesBelowTheFirstNameFieldOnTheCreateCirclePage(String error) {
//        wait.forElementToBeDisplayed(
//                10,
//                getByObject(getCreateCircleFieldConstraintErrorMessage()),
//                "Error message");
//        WebElement foundElement = driver.findElement(getByObject(getCreateCircleFieldConstraintErrorMessage()));
//        String elementText = foundElement.getText();
//
//        String message = "Text '" + error + "' 'in " + getCreateCircleFieldConstraintErrorMessage() + " is presented.";
//        assertTrue(message, elementText.contains(error));
//    }

    public void checkMessageExistsForFirstNameFieldOnCreateCirclePage(String error) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getCreateCircleFirstNameValidation()),
                "Error message");
        WebElement foundElement = driver.findElement(getByObject(getCreateCircleFirstNameValidation()));
        String elementText = foundElement.getText();

        String message = "Text '" + error + "' 'in " + getCreateCircleFirstNameValidation() + " is presented.";
        assertTrue(message, elementText.contains(error));
    }
}
