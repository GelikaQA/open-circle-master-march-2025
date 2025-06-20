package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.TopicsPage;

public class CreateTopicSteps {

    TopicsPage topicsPage = new TopicsPage();

    @And("click New Topic Plus Button")
    public void ClickCreateTopicPlusButton() {
        topicsPage.clickCreateTopicPlusButton();
    }

    @When("they enter {string} in Topic Name Input Placeholder")
    public void enterTopicNameOnInputPlaceholder(String uniqueTopicName) {
        topicsPage.enterTopicNameOnInputPlaceholder(uniqueTopicName);
    }
}
