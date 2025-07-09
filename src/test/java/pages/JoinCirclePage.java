package pages;

import org.openqa.selenium.WebElement;
import tools.PropertiesLoader;

import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import static org.junit.Assert.assertNotEquals;

public class JoinCirclePage extends BasePage {
    private static final String JOIN_CIRCLE_ENTIRE_PAGE_VERIFICATION = "xpath=//div[contains(@class,'login_auth_body')]//h1[text()='Join Circle']";
    private static final String JOIN_CIRCLE_CIRCLE_NAME_INPUT_FIELD = "name=circleId";
    private static final String JOIN_CIRCLE_PASSCODE_INPUT_FIELD = "name=passCode";
    private static final String JOIN_CIRCLE_FIRST_NAME_INPUT_FIELD = "name=firstName";
    private static final String JOIN_CIRCLE_LAST_NAME_INPUT_FIELD = "name=lastName";
    private static final String JOIN_CIRCLE_EMAIL_INPUT_FIELD = "name=email";
    private static final String JOIN_CIRCLE_PASSWORD_INPUT_FIELD = "name=password";
    private static final String JOIN_CIRCLE_JOIN_SUBMIT_BUTTON = "xpath=//button[@type='submit']//span[text()='Join']";
    private static final String JOIN_CIRCLE_SIGN_IN_REDIRECT_BUTTON = "xpath=//button[@type='button']//span[text()='Sign in']";
    private static final String JOIN_CIRCLE_CREATE_CIRCLE_REDIRECT_BUTTON = "xpath=//button[@type='button']//span[text()='Create Circle']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_SUCCESS_REGISTRATION = "xpath=//div[@class='ant-notification-notice-description']//span[text()='You have successfully registered.']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_INCORRECT_PASSCODE = "xpath=//div[@class='ant-notification-notice-description']//span[text()='Incorrect Passcode. Please try again']";
    private static final String JOIN_CIRCLE_FIRST_NAME_FIELD_MESSAGE_FIELD_ACCEPTS = "xpath=//ul[contains(@class, 'form_text_danger')]//li[contains(text(), 'Field accepts alphabetical')]";
    private static final String JOIN_CIRCLE_CIRCLE_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//label[@for='circleId']/following-sibling::ul[contains(@class,'form_text_danger')]/li";
    private static final String JOIN_CIRCLE_PASSCODE_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//label[@for='passCode']/following-sibling::ul[contains(@class,'form_text_danger')]/li";
    private static final String JOIN_CIRCLE_FIRST_NAME_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//label[@for='firstName']/following-sibling::ul[contains(@class,'form_text_danger')]/li";
    private static final String JOIN_CIRCLE_LAST_NAME_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//label[@for='lastName']/following-sibling::ul[contains(@class,'form_text_danger')]/li";
    private static final String JOIN_CIRCLE_EMAIL_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//label[@for='email']/following-sibling::ul[contains(@class,'form_text_danger')]/li";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//label[@for='password']/following-sibling::ul[contains(@class,'form_text_danger')]/li";
    private static final String JOIN_CIRCLE_LAST_NAME_FIELD_MESSAGE_FIELD_ACCEPTS = "xpath=//ul[contains(@class,'form_text_danger')]//li[starts-with(text(),'Field accepts alphabetical')]";
    private static final String JOIN_CIRCLE_EMAIL_FIELD_MESSAGE_INVALID_EMAIL = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'Invalid email address')]";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_MESSAGE_FIELD_SHOULD = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'Field should contain at least one')]";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_EMAIL_EXIST = "xpath=//span[text()='A user with such an email exists.']";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_MASKED = "xpath=//input[@name='password' and @type='password']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_INCORRECT_CIRCLE_NAME = "xpath=//div[contains(@class,'ant-notification-notice-description')]//span[text()='Incorrect Circle Name. Please try again']";

    public static String getJoinCirclePagePasswordFieldMasked() {
        return JOIN_CIRCLE_PASSWORD_FIELD_MASKED;
    }
    public static String getJoinCircleCircleNameInputField() {
        return JOIN_CIRCLE_CIRCLE_NAME_INPUT_FIELD;
    }

    public static String getJoinCirclePasscodeInputField() {
        return JOIN_CIRCLE_PASSCODE_INPUT_FIELD;
    }

    public static String getJoinCircleFirstNameInputField() {
        return JOIN_CIRCLE_FIRST_NAME_INPUT_FIELD;
    }

    public static String getJoinCircleLastNameInputField() {
        return JOIN_CIRCLE_LAST_NAME_INPUT_FIELD;
    }

    public static String getJoinCircleEmailInputField() {
        return JOIN_CIRCLE_EMAIL_INPUT_FIELD;
    }

    public static String getJoinCirclePasswordInputField() {
        return JOIN_CIRCLE_PASSWORD_INPUT_FIELD;
    }

    public static String getJoinCircleJoinSubmitButton() {
        return JOIN_CIRCLE_JOIN_SUBMIT_BUTTON;
    }

    public static String getJoinCircleEntirePageVerification() {
        return JOIN_CIRCLE_ENTIRE_PAGE_VERIFICATION;
    }

    public static String getJoinCirclePopUpMessageIncorrectPasscode() {
        return JOIN_CIRCLE_POP_UP_MESSAGE_INCORRECT_PASSCODE;
    }

    public static String getJoinCirclePopUpMessageIncorrectFirstName() {
        return JOIN_CIRCLE_LAST_NAME_FIELD_MESSAGE_FIELD_ACCEPTS;
    }

    public static String getJoinCirclePageFirstNameFieldIsRequired() {
        return JOIN_CIRCLE_FIRST_NAME_FIELD_MESSAGE_INPUT_IS_REQUIRED;
    }

    public void openJoinCirclePage() {
        driver.get(PropertiesLoader.getProperties("joinCircleUrl"));
    }

    public void enterCircleNameOnJoinCirclePage(String circleName) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCircleCircleNameInputField()),
                "Circle name input field");
        WebElement foundElement = driver.findElement(getByObject(getJoinCircleCircleNameInputField()));
        foundElement.sendKeys(circleName);
    }

    public void enterPasscodeFieldOnTheJoinCirclePage(String Passcode) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePasscodeInputField()),
                "Passcode input field");
        WebElement foundElement = driver.findElement(getByObject(getJoinCirclePasscodeInputField()));
        foundElement.sendKeys(Passcode);
    }

    public void enterFirstNameOnJoinCirclePage(String FirstName) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCircleFirstNameInputField()),
                "First name input field");
        WebElement foundElement = driver.findElement(getByObject(getJoinCircleFirstNameInputField()));
        foundElement.sendKeys(FirstName);
    }

    public void enterLastNameOnJoinCirclePage(String LastName) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCircleLastNameInputField()),
                "Last Name input field");
        WebElement foundElement = driver.findElement(getByObject(getJoinCircleLastNameInputField()));
        foundElement.sendKeys(LastName);
    }

    public void enterEmailOnJoinCirclePage(String Email) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCircleEmailInputField()),
                "Email input field");
        WebElement foundElement = driver.findElement(getByObject(getJoinCircleEmailInputField()));
        foundElement.sendKeys(Email);
    }

    public void enterPasswordOnJoinCirclePage(String password) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePasswordInputField()),
                "Password input field");
        WebElement passwordField = driver.findElement(getByObject(getJoinCirclePasswordInputField()));
        passwordField.sendKeys(password);
    }

    public void theyPressButtonJoinOnTheJoinCirclePage() {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCircleJoinSubmitButton()),
                "SIGN UP BUTTON");
        WebElement signUpButton = driver.findElement(getByObject(getJoinCircleJoinSubmitButton()));
        signUpButton.click();
    }

    public void assertTheyAreStillOnJoinCirclePage() {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCircleEntirePageVerification()),
                "JOIN CIRCLE PAGE LOCATE/VERIFY");
        WebElement foundElement = driver.findElement(getByObject(getJoinCircleEntirePageVerification()));
        assertTrue(foundElement.isDisplayed());
    }

    public void assertWarningMessageIncorrectPasscodeOnJoinCirclePageIsDisplayed(String incorrectPasscode) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePopUpMessageIncorrectPasscode()),
                "Incorrect Passcode. Please try again");
        WebElement foundElement = driver.findElement(getByObject(getJoinCirclePopUpMessageIncorrectPasscode()));
        String elementText = foundElement.getText();

        String message = "Text '" + incorrectPasscode + "' in " + getJoinCirclePopUpMessageIncorrectPasscode() + " is not presented. 'Actual text is '" + elementText + "'";
        assertTrue(message, elementText.contains(incorrectPasscode));
    }

    public void assertWarningMessageForFirstNameOnJoinCirclePageIsDisplayed(String incorrectFirstName) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePopUpMessageIncorrectFirstName()),
                "Field accepts alphabetical char and digits, no special chars allowed, limited to 32 character");
        WebElement foundElement = driver.findElement(getByObject(getJoinCirclePopUpMessageIncorrectFirstName()));
        String elementText = foundElement.getText();

        String message = "Text '" + incorrectFirstName + "' in " + getJoinCirclePopUpMessageIncorrectFirstName() + " is not presented. 'Actual text is '" + elementText + "'";
        assertTrue(message, elementText.contains(incorrectFirstName));
    }

    public void assertFirstNameFieldWarningMessageIsDisplayed(String incorrectFirstName) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePageFirstNameFieldIsRequired()),
                "This input is required");
        WebElement foundElement = driver.findElement(getByObject(getJoinCirclePageFirstNameFieldIsRequired()));
        String elementText = foundElement.getText();

        String message = "Text '" + incorrectFirstName + "' in " + getJoinCirclePageFirstNameFieldIsRequired() + " is not presented. 'Actual text is '" + elementText + "'";
        assertTrue(message, elementText.contains(incorrectFirstName));
    }

    public void theyCopyHiddenPasswordOnTheJoinCirclePage() {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePasswordInputField()),
                "Password input field");
        WebElement passwordField = driver.findElement(getByObject(getJoinCirclePasswordInputField()));

        Actions actions = new Actions(driver);
        actions
                .moveToElement(passwordField)
                .click()
                .keyDown(Keys.CONTROL)
                .sendKeys("a", "c")
                .keyUp(Keys.CONTROL)
                .perform();
        }

    public void thePasswordIsNotCopiedIntoClipboardFromPasswordField() {
        String clipboardContent = getClipboardContents();
        String actualPassword = getPasswordInputValue(); // Gets the password field value
        System.out.println("Clipboard: " + clipboardContent);
        System.out.println("Entered password: " + actualPassword);

        assertNotEquals("ERROR: password should not be copied into clipboard", actualPassword, clipboardContent); //Asserts that clipboard ≠ password
    }

    private String getClipboardContents() { // Additional method to get clipboard data
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            return (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getPasswordInputValue() { // Additional method get text from the password input field
        WebElement passwordField = driver.findElement(getByObject(getJoinCirclePasswordInputField()));
        return passwordField.getAttribute("value");
    }

    public void theyEnterValidPasswordInPasswordFieldOnJoinCirclePage(String password) {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePasswordInputField()),
                "Password input field");
        driver.findElement(getByObject(getJoinCirclePasswordInputField())).sendKeys(password);
    }

    public void thePasswordIsMasked() {
        wait.forElementToBeDisplayed(10, getByObject(getJoinCirclePagePasswordFieldMasked()),
                "Password is masked");
       }

//    for next test case
    public void theyActivatedContextMenuOnTheJoinCirclePage(){
        WebElement passwordField = driver.findElement(getByObject(getJoinCirclePasswordInputField()));

        Actions actions = new Actions(driver);
        actions
                .moveToElement(passwordField)
                .contextClick() // Mouse right click button simulation
                .perform();

    }
}