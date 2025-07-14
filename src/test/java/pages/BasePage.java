package pages;

import hooks.Setup;
import hooks.Wait;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static tools.CommonTools.getByObject;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;
    HashMap<String, Object> context;

    public static final String POP_UP_WINDOW_MESSAGE_LOCATOR = "xpath=//div[@class='ant-notification-notice-message']";
    public static final String PASSWORD_INPUT_FIELD = "name=password";

    public static String getPopUpWindowMessageLocator(){
        return POP_UP_WINDOW_MESSAGE_LOCATOR;
    }
    public static String getPasswordInputField() { return PASSWORD_INPUT_FIELD; }

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
        context = new HashMap<>();
    }

    public void clickElement(String targetElement) {
        wait.forElementToBeDisplayed(10, getByObject(targetElement), "Element");
        WebElement foundElement = driver.findElement(getByObject(targetElement));
        foundElement.click();
    }

    public void openWebPage(String address) {
        driver.get(address);
    }

    public void sendKeyToElement(String keyParam, String targetElement) {
        wait.forElementToBeDisplayed(10, getByObject(targetElement), "Element");
        WebElement foundElement = driver.findElement(getByObject(targetElement));
        foundElement.sendKeys(keyParam);
    }

    public void assertElementIsDisplayed(String targetElement) {
        wait.forElementToBeDisplayed(10, getByObject(targetElement), "Element");
        WebElement foundElement = driver.findElement(getByObject(targetElement));
        assertTrue(foundElement.isDisplayed());
    }

    public void assertElementIsNotDisplayed(String targetElement) {
        wait.forElementToBeDisplayed(10, getByObject(targetElement), "Element");
        WebElement foundElement = driver.findElement(getByObject(targetElement));
        assertFalse(foundElement.isDisplayed());
    }

    protected String extractMultiLineText(WebElement webElement) {
        String originalText = webElement.getText();
        return originalText.replaceAll("\\s+", " ").trim();
    }

    public void clearField(String element) {
        WebElement foundElement = driver.findElement(getByObject(element));
        foundElement.clear();
    }

    protected void clearFieldAndType(String element, String text, boolean hitEnter) {
        WebElement foundElement = driver.findElement(getByObject(element));
        foundElement.clear();
        foundElement.sendKeys(text);

        if (hitEnter) {
            foundElement.sendKeys(Keys.RETURN);
        }
    }

    protected void selectAndHitEnter(String element) {
        wait.forElementToBeDisplayed(20, getByObject(element), "Item Quantity field");
        WebElement foundElement = driver.findElement(getByObject(element));

        String value = foundElement.getAttribute("value");
        if (value != null) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].select();", foundElement);

            foundElement.sendKeys(Keys.RETURN);
        }
    }

    public void reloadPage() {
        driver.navigate().refresh();
    }

    public void openNewTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void switchToTheFirstBrowserTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public void closeTabAndOpenNewTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.switchTo().window(tabs.get(1));
    }

    public void closeWindowAndOpenNewWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('about:blank', '_blank');");
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.switchTo().window(windows.get(0));
        driver.close();
        driver.switchTo().window(windows.get(1));
    }

    public void assertTextPresentedIn(String text, String target) {
        WebElement foundElement = driver.findElement(getByObject(target));
        String elementText = foundElement.getText();

        String message = "Text '" + text + "' 'in " + target + " is not presented. 'Actual text is '" + elementText + "'";
        assertTrue(message, elementText.contains(text));
    }

    public void waitForElementIsVisible(String target) {
        wait.forElementToBeDisplayed(10, getByObject(target), "Element");
        wait.forElementToBeInteractable(10, getByObject(target), "Element");
    }

    public void assertMessageIsDisplayed(String message) {
        wait.forElementToBeDisplayed(10,
                getByObject(getPopUpWindowMessageLocator()), "PopUp Message");
        WebElement foundElement = driver.findElement(getByObject(getPopUpWindowMessageLocator()));
        String elementText = foundElement.getText();
        assertTrue(elementText.contains(message));
        wait.forElementToBeNotDisplayed(10,
                getByObject(getPopUpWindowMessageLocator()), "PopUp Message");
    }

    public static String generateUniqueName(String name) {
        String timestamp = String.valueOf(System.currentTimeMillis());
        return name + timestamp;
    }
    public void PasswordIsMasked() {
        wait.forElementToBeDisplayed(10, getByObject(getPasswordInputField()),
                "Password is masked");
        WebElement passwordField = driver.findElement(getByObject(getPasswordInputField()));
        String typeAttribute = passwordField.getAttribute("type");
        assertTrue("The password field is not masked. Can't find attribute in tag 'type=password' ", typeAttribute.equals("password"));
    }
}