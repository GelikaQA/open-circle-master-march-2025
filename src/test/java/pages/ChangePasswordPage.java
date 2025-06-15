package pages;

public class ChangePasswordPage {

    private static final String PROFILE_ICON = "xpath=//div[@class='profile_container__LOFPn']/child::span'";
    private static final String PROFILE_CHANGE_PASSWORD_SECTION ="xpath=//div[@class='ant-collapse-header']/descendant::span[text()='Change password']";
    private static final String CHANGE_PASSWORD_CURRENT_PASSWORD_INPUT_FIELD = "xpath=//input[@id='oldPassword']";
    private static final String CHANGE_PASSWORD_DROPDOWN = "xpath=//div[@class='ant-collapse-expand-icon']/child::span";
    private static final String CURRENT_PASSWORD_INPUT_FIELD = "xpath=//input[@id='oldPassword']";
    private static final String NEW_PASSWORD_INPUT_FIELD  ="xpath=//input[@id='newPassword']";
    private static final String CHANGE_PASSWORD_SAVE_BUTTON  ="xpath=//div[@class='profile_passwordSaveContainer__fkz2n']//descendant::button";
    private static final String SUCCESS_POPUP_MESSAGE_PASSWORD_HAS_BEEN_CHANGED_DISPLAYED  ="xpath=//div[@class='ant-notification-notice-description']/descendant::span";
    private static final String WARNING_POP_UP_MESSAGE_EMPTY_CURRENT_PASSWORD_FIELD  ="xpath=//span[text()='Field: oldPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20']";
    private static final String WARNING_POP_UP_MESSAGE_EMPTY_NEW_PASSWORD_FIELD  ="xpath=//span[text()='Field: newPassword; Error: Field should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20']";
    private static final String NEW_INVALID_PASSWORD_ERROR_MESSAGE  ="xpath=//div[contains(@class, 'ant-form-item-explain-error') and contains (text(), 'Password should contain at least one upper-case, at least one lower-case and at least one digit and be between 8 and 20')]";
    private static final String INVALID_CURRENT__PASSWORD_POP_UP_MESSAGE  ="xpath=//span[text()='Incorrect password']";
    private static final String CURRENT_PASSWORD_VISIBILITY_TOGGLE_ENABLED  ="xpath=//input[@id='oldPassword']/following-sibling::span/child::span";
    private static final String NEW_PASSWORD_VISIBILITY_TOGGLE_ENABLED  ="xpath=//input[@id='newPassword']/following-sibling::span/child::span";
    private static final String CURRENT_PASSWORD_HIDDEN_BY_DOTS  ="xpath=//span[@class='ant-input-affix-wrapper ant-input-password ant-input-affix-wrapper-status-success css-o2xhy3']/child::input[@id='oldPassword' and @type='password']";
    private static final String NEW_PASSWORD_HIDDEN_BY_DOTS  ="xpath=//span[@class='ant-input-affix-wrapper ant-input-password ant-input-affix-wrapper-status-success css-o2xhy3']/child::input[@id='newPassword' and @type='password']";
}