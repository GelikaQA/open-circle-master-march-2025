package pages;

public class JoinCirclePage {
    private static final String JOIN_CIRCLE_ENTIRE_PAGE_VERIFICATION = "xpath=//div[contains(@class,'login_auth_body')]//h1[text()='Join Circle']";
    private static final String JOIN_CIRCLE_CIRCLE_NAME_INPUT_FIELD = "name=circleId";
    private static final String JOIN_CIRCLE_PASSCODE_INPUT_FIELD	= "name=passCode";
    private static final String JOIN_CIRCLE_FIRST_NAME_INPUT_FIELD = "name=firstName";
    private static final String JOIN_CIRCLE_LAST_NAME_INPUT_FIELD = "name=lastName";
    private static final String JOIN_CIRCLE_EMAIL_INPUT_FIELD = "name=email";
    private static final String JOIN_CIRCLE_PASSWORD_INPUT_FIELD = "name=password";
    private static final String JOIN_CIRCLE_JOIN_SUBMIT_BUTTON = "type=submit";
    private static final String JOIN_CIRCLE_SIGN_IN_REDIRECT_BUTTON = "xpath=//button[@type='button']//span[text()='Sign in']";
    private static final String JOIN_CIRCLE_CREATE_CIRCLE_REDIRECT_BUTTON = "xpath=//button[@type='button']//span[text()='Create Circle']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_SUCCESS_REGISTRATION = "xpath=//div[@class='ant-notification-notice-description']//span[text()='You have successfully registered.']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_ICORRECT_PASSCODE = "xpath=//div[@class='ant-notification-notice-description']//span[text()='Incorrect Passcode. Please try again']";
    private static final String JOIN_CIRCLE_FN_FIELD_MESSAGE_FIELD_ACCEPTS = "xpath=//ul[contains(@class, 'form_text_danger')]//li[contains(text(), 'Field accepts alphabetical')]";
    private static final String JOIN_CIRCLE_FN__CIRCLE_EMAIL_PASSWORD_FIELD_MESSAGE_INPUT_IS_REQUIRED = "xpath=//ul[contains(@class,'form_text_danger')]//li[text()='This input is required.']";
    private static final String JOIN_CIRCLE_LN_FIELD_MESSAGE_FIELD_ACCEPTS = "xpath=//ul[contains(@class,'form_text_danger')]//li[starts-with(text(),'Field accepts alphabetical')]";
    private static final String JOIN_CIRCLE_LN_FIELD_MESSAGE_INPUT_IS_REQUIRED	 = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'This input is required.')]";
    private static final String JOIN_CIRCLE_EMAIL_FIELD_MESSAGE_INVALID_EMAIL = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'Invalid email address')]";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_MESSAGE_FIELD_SHOULD = "xpath=//ul[contains(@class,'form_text_danger')]//li[contains(text(),'Field should contain at least one')]";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_EMAIL_EXIST = "xpath=//span[text()='A user with such an email exists.']";
    private static final String JOIN_CIRCLE_PASSWORD_FIELD_ENTERED_VALUE_123456zZ = "xpath=//input[@id='password' and @value='123456zZ']";
    private static final String JOIN_CIRCLE_POP_UP_MESSAGE_ICORRECT_CIRCLE_NAME = "xpath=//div[contains(@class,'ant-notification-notice-description')]//span[text()='Incorrect Circle Name. Please try again']";

}
