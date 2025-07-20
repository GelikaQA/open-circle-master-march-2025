package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TopicsPage;

public class CreateTopicSteps {

    TopicsPage topicsPage = new TopicsPage();

    @When("they lick New Topic Plus Button")
    public void ClickCreateTopicPlusButton() {
        topicsPage.clickCreateTopicPlusButton();
    }

    @And("they enter {string} in new topic name input field")
    public void enterNewTopicNameInputField(String NewTopicName) {
        topicsPage.enterNewTopicNameInputField(NewTopicName);
    }

    @And("they enter {string} in topic name input field")
    public void enterExistsTopicNameInputField(String ExistsTopicName) {
        topicsPage.enterExistsTopicNameInputField(ExistsTopicName);
    }

    @And("they click on Create button on topic page")
    public void clickOnCreateButton() {
        topicsPage.clickCreateButtonOnTopicPage();
    }

    @Then("success message {string} pops-up on Topic page")
    public void successMessagePopsUpOnTopicPage(String TopicHasBeenCreated) {
        topicsPage.assertSuccessMessageOnTopicPageIsDisplayed(TopicHasBeenCreated);
    }

//    @Then("they see warning message {string} pop-up on Topic page")
//    public void warningMessagePopUpOnTopicPage(String TopicWithThisNameExists) {
//        topicsPage.assertWarningMessageOnTopicPageIsDisplayed(TopicWithThisNameExists);
//    }
}