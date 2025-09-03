package steps;

import io.cucumber.java.en.Then;
import page_objects.NavigationPageRPLSelenide;
import page_objects.NavigationPageRplCommandName;

public class CategoryPageSteps {

    private NavigationPageRPLSelenide navigationPageRPLSelenide = new NavigationPageRPLSelenide();
    private NavigationPageRplCommandName navigationPageRplCommandName = new NavigationPageRplCommandName();
    @Then("Main page should be appear")
    public void waitUntilTextRplVisible() {navigationPageRPLSelenide.waitUntilTextRplVisible();
        navigationPageRPLSelenide.getCommandAndScrollToThePoint();
        navigationPageRplCommandName.getCommandToThePoint();
    }

}
