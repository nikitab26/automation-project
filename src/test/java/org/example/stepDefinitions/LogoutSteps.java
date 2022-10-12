package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.pageActions.LogoutActions;
import org.openqa.selenium.WebDriver;

public class LogoutSteps {
    WebDriver driver;

    LogoutActions logoutActions;

    public LogoutSteps(CommonSteps commonSteps, LogoutActions logoutActions) {
        this.driver = commonSteps.getDriver();
        this.logoutActions = logoutActions;
    }

    @Then("Click on Logout and manager should be logged out")
    public void click_on_logout_and_manager_should_be_logged_out() {
        logoutActions.clickOnLogout();
        System.out.println("Logged out");
    }
}
