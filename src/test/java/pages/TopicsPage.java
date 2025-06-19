package pages;

import hooks.Wait;
import org.openqa.selenium.WebElement;

import static hooks.Setup.driver;
import static tools.CommonTools.getByObject;

public class TopicsPage {


    private static final String TOPIC_PLUS_ICON_BUTTON = "xpath=//div[contains(@class, 'crateChannelBtn')]";
    private static final String PLACEHOLDER_INPUT_NEW_TOPIC_NAME = "xpath=//input[@placeholder]";
    private static final String CLOSE_TOPIC_BUTTON = "xpath=//button[@class= 'ant-modal-close']";
    private static final String CREATE_NEW_TOPIC_CREATE_BUTTON = "xpath=//button[@type='button' and contains(@class, 'ant-btn-primary')]/span";
    private static final String CREATE_NEW_TOPIC_CANCEL_BUTTON = "xpath=//button[@type='button' and contains(@class, 'ant-btn-default')]/span";
    private static final String TOPIC_CREATION_SUCCESS_MESSAGE = "xpath=//span[contains(text(), 'Topic has been created')]";
    private static final String TOPIC_CREATION_ERROR_MESSAGE = "xpath=//span[contains(text(), 'Topic with this name exists')]";
    private static final String TOPIC_CREATION_CHAR_ERROR_MESSAGE = "xpath=//span[contains(text(), 'Topic name must be between 1 and 80')]";
    private static final String FIRST_TOPIC_CONTAINER = "xpath= //ul[contains(@id, 'rc-menu')]/child::li[1]/span";
    private static final String MESSAGE_INPUT_FIELD = "xpath=//div[contains(@class, 'editor')]/p";
    private static final String MESSAGE_INPUT_FIELD_BOLD_BUTTON = "xpath=//button[contains(@class, 'bold')]";
    private static final String MESSAGE_INPUT_FIELD_ITALIC_BUTTON = "xpath=//button[contains(@class, 'italic')]";
    private static final String MESSAGE_INPUT_FIELD_UNDERLINE_BUTTON = "xpath=//button[contains(@class, 'underline')]";
    private static final String MESSAGE_INPUT_FIELD_STRIKETHROUGH_BUTTON = "xpath=//button[contains(@class, 'strike')]";
    private static final String MESSAGE_INPUT_FIELD_QUOTE_BUTTON = "xpath=//button[contains(@class, 'quote')]";
    private static final String MESSAGE_INPUT_FIELD_SEND_BUTTON = "xpath=//div[contains(@class, 'sendIcon')]";
    private static final String MESSAGE_INPUT_FIELD_CLEAN_STYLE_BUTTON = "xpath=//button[contains(@class, 'clean')]";
    private static final String MESSAGE_INPUT_FIELD_HEADING_1_OPTION_STYLE = "xpath=//span[contains(@class, 'picker-item')][@data-value='1']";
    private static final String MESSAGE_INPUT_FIELD_HEADING_2_OPTION_STYLE = "xpath=//span[contains(@class, 'picker-item')][@data-value='2']";
    private static final String MESSAGE_INPUT_FIELD_NORMAL_OPTION_STYLE = "xpath=//span[contains(@class, 'picker-item ql-selected')]";
    private Wait wait;

    public static String getTopicPlusIconButton() {
        return TOPIC_PLUS_ICON_BUTTON;}

    public static String getPlaceholderInputNewTopicName() {
        return PLACEHOLDER_INPUT_NEW_TOPIC_NAME;}

    public static String getCreateNewTopicCreateButton() {
        return CREATE_NEW_TOPIC_CREATE_BUTTON;}

    public static String getTopicCreationSuccessMessage() {
        return TOPIC_CREATION_SUCCESS_MESSAGE;}


    public void clickCreateTopicPlusButton() {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getTopicPlusIconButton()),
                "New Topic Plus Button");
        WebElement foundElement = driver.findElement(getByObject(getTopicPlusIconButton()));
        foundElement.click();
    }


    public void enterTopicNameOnInputPlaceholder(String uniqueTopicName) {
        wait.forElementToBeDisplayed(
                10,
                getByObject(getPlaceholderInputNewTopicName()),
                "Topic Name Input Placeholder");
        WebElement foundElement = driver.findElement(getByObject(getPlaceholderInputNewTopicName()));
        foundElement.sendKeys(uniqueTopicName);
    }
}