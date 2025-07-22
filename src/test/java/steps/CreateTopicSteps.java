package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TopicsPage;

public class CreateTopicSteps {

    TopicsPage topicsPage = new TopicsPage();

    @When("they click New Topic Plus Button")
    public void ClickCreateTopicPlusButton() {
        topicsPage.clickCreateTopicPlusButton();
    }

    @When("they enter {string} and create New Topic")
    public void CreateNewTopic(String NewTopicName) {
        topicsPage.clickCreateTopicPlusButton();
        topicsPage.enterNewTopicName(NewTopicName);
        topicsPage.clickCreateButtonOnTopicPage();
    }

    @And("they enter {string} in new topic name input field")
    public void enterNewTopicNameInputField(String NewTopicName) {
        topicsPage.enterNewTopicNameInputField(NewTopicName);
    }

    @And("they enter {string} in topic name input field")
    public void enterExistsTopicNameInputField(String ExistsTopicName) {
        topicsPage.enterNewTopicName(ExistsTopicName);
    }

    @And("they click on Create button on topic page")
    public void clickOnCreateButton() {
        topicsPage.clickCreateButtonOnTopicPage();
    }

    @Then("success message {string} pops-up on Topic page")
    public void successMessagePopsUpOnTopicPage(String TopicHasBeenCreated) {
        topicsPage.assertSuccessMessageOnTopicPageIsDisplayed(TopicHasBeenCreated);
    }

    @And ("warning message {string} pop-up on Topic Page")
    public void warningMessagePopUpOnTopicPage(String TopicWithThisNameExists) {
        topicsPage.assertWarningMessageOnTopicPageIsDisplayed(TopicWithThisNameExists);
    }
}