package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.ChangePasswordPage;
import tools.PropertiesLoader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static tools.CommonTools.getFromContext;

public class TearDown {
    private final WebDriver driver;
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    public TearDown() {
        this.driver = Setup.driver;
    }

    @After(value = "@changePassword", order = 2)
    public void revertPasswordIfChanged() {
        Boolean passwordWasChanged = (Boolean) getFromContext("passwordWasChanged");
        if (passwordWasChanged != null && passwordWasChanged) {
            try {
                changePasswordPage.enterPasswordInCurrentPasswordInputFieldOnChangePasswordPage((String) getFromContext("newPassword"));
                changePasswordPage.enterPasswordInNewPasswordInputFieldOnChangePasswordPage(PropertiesLoader.getProperties("password"));
                changePasswordPage.clickSaveButtonOnChangePasswordPage();
            } catch (Exception e) {
                System.err.println("Failed to revert password: " + e.getMessage());
            }
        }
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
//        if (scenario.isFailed()) {
//            sleep(2000);
//            saveScreenshotsForScenario(scenario);
//        }
        this.driver.quit();
    }

    private void saveScreenshotsForScenario(final Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenShot");

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
            String filePath = "./screenshots/" + scenario.getName().replaceAll("[^a-zA-Z0-9]", "_") + "_" + timestamp + ".png";

            File directory = new File("./screenshots");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            FileUtils.copyFile(screenshotFile, new File(filePath));
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}