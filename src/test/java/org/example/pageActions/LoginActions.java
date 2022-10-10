package org.example.pageActions;

import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LoginActions {
    private WebDriver driver;

    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }

    public void enterUserId(String userId) {
        loginElements.userId.sendKeys(userId);
    }

    public void enterPassword(String password) {
        loginElements.password.sendKeys(password);
    }

    public void clickOnLogin() {
        loginElements.loginBtn.click();
    }
}
