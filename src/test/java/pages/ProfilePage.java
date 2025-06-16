package pages;

public class ProfilePage {
    private static final String PROFILE_AVATAR_ICON = "xpath=//div[contains(@class, 'profile_container')]";
    private static final String PROFILE_PAGE_TITLE = "xpath=//*[text()='Profile']";
    private static final String PROFILE_FIRST_NAME_INPUT_FIELD = "xpath=//input[@id='firstName']";
    private static final String PROFILE_LAST_NAME_INPUT_FIELD ="xpath=//input[@id='lastName']";
    private static final String PROFILE_SAVE_BUTTON = "xpath=//button[@type='submit' and @class='ant-btn css-o2xhy3 ant-btn-primary profile_saveNames__LN7Zn']";
    private static final String PROFILE_AVATAR_DELETE_BUTTON = "xpath=//button[@type='button' and @class='ant-btn css-o2xhy3 ant-btn-link profile_deleteImage__3FHe2']";
    private static final String PROFILE_UPLOAD_BUTTON = "xpath=//div[@class='ant-upload ant-upload-select']";
    private static final String PROFILE_CLOSE_BUTTON = "xpath=//button[@class='ant-drawer-close']";
    private static final String PROFILE_RESET_BUTTON ="xpath=//button[@type='button' and @class='ant-btn css-o2xhy3 ant-btn-default profile_reset__m5oZY']";
    private static final String ERROR_MESSAGE_SPEC_CHARS = "xpath=//div[text()='Field accepts alphabetical char and digits, no special chars allowed']";
    private static final String ERROR_MESSAGE_EMPTY_FIELD ="xpath=//div[text()='Please input your Last Name']";


}
