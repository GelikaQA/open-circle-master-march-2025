package pages;

import org.openqa.selenium.WebElement;

import static tools.CommonTools.getByObject;

public class JoinCirclePage extends BasePage {
    private static final String JOIN_CIRCLE_ENTIRE_PAGE_VERIFICATION = "xpath=//div[contains(@class,'login_auth_body')]//h1[text()='Join Circle']";
    private static final String JOIN_CIRCLE_CIRCLE_NAME_INPUT_FIELD = "name=circleId";
    private static final String JOIN_CIRCLE_PASSCODE_INPUT_FIELD	= "name=passCode";
    private static final String JOIN_CIRCLE_FIRST_NAME_INPUT_FIELD = "name=firstName";
    private static final String JOIN_CIRCLE_LAST_NAME_INPUT_FIELD = "name=lastName";
    private static final String JOIN_CIRCLE_EMAIL_INPUT_FIELD = "name=email";
    private static final String JOIN_CIRCLE_PASSWORD_INPUT_FIELD = "name=password";
    private static final String JOIN_CIRCLE_JOIN_SUBMIT_BUTTON = "xpath=//button[@type='submit']//span[text()='Join']";
    private static final String JOIN_CIRCLE_SIGN_IN_REDIRECT_BUTTON = "xpath=//button[@type='button']//span[text()='Sign in']";
    private static final String JOIN_CIRCLE_CREATE_CIRCLE_REDIRECT_BUTTON = "xpath=//button[@type='button']//span[text()='Create Circle']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_SUCCESS_REGISTRATION = "xpath=//div[@class='ant-notification-notice-description']//span[text()='You have successfully registered.']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_INCORRECT_PASSCODE = "xpath=//div[@class='ant-notification-notice-description']//span[text()='Incorrect Passcode. Please try again']";
    private static final String JOIN_CIRCLE_FN_FIELD_MESSAGE_FIELD_ACCEPTS = "xpath=//ul[contains(@class, 'form_text_danger')]//li[contains(text(), 'Field accepts alphabetical')]";
    private static final String JOIN_CIRCLE_FN__CIRCLE_EMAIL_PASSWORD_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//ul[contains(@class,'form_text_danger')]//li[text()='This input is required.']";
    private static final String JOIN_CIRCLE_LN_FIELD_MESSAGE_FIELD_ACCEPTS = "xpath=//ul[contains(@class,'form_text_danger')]//li[starts-with(text(),'Field accepts alphabetical')]";
    private static final String JOIN_CIRCLE_LN_FIELD_MESSAGE_INPUT_IS_REQUIRED	 = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'This input is required.')]";
    private static final String JOIN_CIRCLE_EMAIL_FIELD_MESSAGE_INVALID_EMAIL = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'Invalid email address')]";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_MESSAGE_FIELD_SHOULD = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'Field should contain at least one')]";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_EMAIL_EXIST = "xpath=//span[text()='A user with such an email exists.']";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_ENTERED_VALUE_123456zZ = "xpath=//input[@id='password' and @value='123456zZ']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_INCORRECT_CIRCLE_NAME = "xpath=//div[contains(@class,'ant-notification-notice-description')]//span[text()='Incorrect Circle Name. Please try again']";

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
    public void openJoinCirclePage() {
        driver.get("http://opencircle.us/join");
    }

    public void enterCircleNameOnJoinCirclePage(String circleName) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getJoinCircleCircleNameInputField()),
                "Circle name input field");
        WebElement foundElement = driver.findElement(getByObject(getJoinCircleCircleNameInputField()));
        foundElement.sendKeys(circleName);
    }
