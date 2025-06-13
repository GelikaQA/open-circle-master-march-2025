package pages;

public class CreateCirclePage {
    private static final String CREATE_CIRCLE_TITLE_HEADER = "//h1[contains(@class, 'login_auth_title')]";
    private static final String CIRCLE_NAME_FIELD_ON_CREATE_CIRCLE_PAGE = "//input[@id='circleId']";
    private static final String CREATE_CIRCLE_PASSCODE_INPUT_FIELD = "//input[@id='passCode']";
    private static final String GENERATE_PASSCODE_BUTTON_ON_CREATE_CIRCLE_PAGE = "//button[@class='ant-btn css-o2xhy3 ant-btn-primary'][1]";
    private static final String COPY_PASSCODE_BUTTON_ON_CREATE_CIRCLE_PAGE = "//button[@class='ant-btn css-o2xhy3 ant-btn-primary'][2]";
    private static final String FIRSTNAME_ON_CREATE_CIRCLE_PAGE = "//input[@id='firstName']";
    private static final String LASTNAME_ON_CREATE_CIRCLE_PAGE = "//input[@id='lastName']";
    private static final String EMAIL_ON_CREATE_CIRCLE_PAGE = "//input[@id='email']";
    private static final String CREATE_CIRCLE_PASSWORD_INPUT_FIELD = "//input[@id='password']";
    private static final String CREATE_CIRCLE_CREATE_BUTTON = "//button[contains(@class, 'login_submit')]";
    private static final String CREATE_CIRCLE_SIGN_IN_HYPERLINK = "//button[contains(@class, 'login_link')][1]";
    private static final String CREATE_CIRCLE_JOIN_CIRCLE_HYPERLINK =  "//button[contains(@class, 'login_link')][2]";
    private static final String CREATE_CIRCLE_COPY_ERROR_POPUP = "//div[contains(@class, 'ant-notification ant-notification-topRight')]//span[text()='Generate PassCode firstly']";
    private static final String CREATE_CIRCLE_NON_UNIQUE_EMAIL_ERROR_POPUP = "//div[contains(@class, 'ant-notification ant-notification-topRight')]//span[text()='A user with such an email exists.']";
    private static final String CREATE_CIRCLE_NON_UNIQUE_CIRCLE_NAME_ERROR_POPUP = "//div[@class='ant-notification-notice-with-icon']//span[text()='A Circle with this name exists.']";
///  private static final String LOGIN_CREATE_CIRCLE_SUCCESS_POPUP = "//div[@class='ant-notification-notice-content']//span[text='You have successfully registered.']""; This XPath is for the success message that pops up in Login page after Circle is successfully created
}
