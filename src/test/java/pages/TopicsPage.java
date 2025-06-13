package pages;

public class TopicsPage  {

    private static final String EMAIL_INPUT_FIELD = "xpath=//input[@id='email']";
    private static final String PASSWORD_INPUT_FIELD = "xpath=//button[@type='submit']";
    private static final String NEW_TOPIC_CREATE_BUTTON = "xpath=//button[@type='button' and contains(@class, 'ant-btn-primary')]/span”
    private static final String CREATE_NEW_TOPIC_CANCEL_BUTTON = "xpath=//button[@type='button' and contains(@class, 'ant-btn-default')]/span”
    private static final String TOPIC_CREATION_SUCCESS_MESSAGE = "xpath=//span[contains(text(), 'Topic has been created')
    private static final String TOPIC_CREATION_ERROR_MESSAGE = "xpath=//span[contains(text(), 'Topic with this name exists')]"
    private static final String TOPIC_CREATION_CHAR_ERROR_MESSAGE = "xpath=//span[contains(text(), 'Topic name must be between 1 and 80')]"
    private static final String FIRST_TOPIC_CONTAINER = "xpath= //ul[contains(@id, 'rc-menu')]/child::li[1]/span”
    private static final String MESSAGE_INPUT_FIELD = "xpath=//div[contains(@class, 'editor')]/p"
    private static final String BOLD_BUTTON = "xpath=//button[contains(@class, 'bold')]”
    private static final String ITALIC_BUTTON = "xpath=//button[contains(@class, 'italic')]”
    private static final String UNDERLINE_BUTTON = "xpath=//button[contains(@class, 'underline')]”
    private static final String STRIKETHROUGH_BUTTON ="xpath=//button[contains(@class, 'strike')]”
    private static final String QUOTE_BUTTON = "xpath=//button[contains(@class, 'quote')]”
    private static final String SEND_BUTTON = "xpath=//div[contains(@class, 'sendIcon')]”
    private static final String CLEAN_STYLE_BUTTON = "xpath=//button[contains(@class, 'clean')]”
    private static final String HEADING_1_OPTION_STYLE = "xpath=//span[contains(@class, 'picker-item')][@data-value='1']”
    private static final String HEADING_2_OPTION_STYLE = "xpath=//span[contains(@class, 'picker-item')][@data-value='2']”
    private static final String NORMAL_OPTION_STYLE = "xpath=//span[contains(@class, 'picker-item ql-selected')]”




}
