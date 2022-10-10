package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;

    LoginActions loginActions;

    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions = loginActions;
    }

    @When("Enter {string},{string} and click on login")
    public void enter_and_click_on_login(String userId, String password) {
        loginActions.enterUserId(userId);
        loginActions.enterPassword(password);
        loginActions.clickOnLogin();
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("Manager Login Successful");
    }
}
