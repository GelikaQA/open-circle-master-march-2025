package pages;

public class AlbumsPage {
    private static final String ALBUMS_BUTTON_ON_THE_MAIN_PAGE = "xpath=//div[text()='Albums']";
    private static final String CREATE_NEW_ALBUM_BUTTON = "xpath=//b[text()='Create new']";
    private static final String LABEL_CREATE_NEW_ALBUM_WINDOW = "xpath=//div[text()='Create a new Album']";
    private static final String INPUT_CREATE_NEW_ALBUM_WINDOW = "xpath=//input[@id='form_in_modal_title']";
    private static final String CLOSE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[@role='img']";
    private static final String CANCEL_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Cancel']";
    private static final String CREATE_BUTTON_NEW_ALBUM_WINDOW = "xpath=//span[text()='Create']";
    private static final String POP_UP_MSG_IF_ALBUM_ALREADY_EXISTS = "xpath=//span[text()='Album with this name exists']";
    private static final String POP_UP_MSG_WHEN_ALBUM_IS_CREATED = "xpath=//div[@class='ant-notification-notice-with-icon']";
}
