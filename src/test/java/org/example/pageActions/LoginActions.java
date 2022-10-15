package org.example.pageActions;

import org.apache.commons.io.FileUtils;
import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

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

    public void enterPassword(String password) throws IOException {
        loginElements.password.sendKeys(password);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();


//        String userExp = "User-ID must not be blank";
//        String userActual = driver.findElement(By.id("message23")).getText();
//        Assert.assertEquals(userExp,userActual);

        String passExp = "Password must not be blank";
        String passActual = driver.findElement(By.id("message18")).getText();
        Assert.assertEquals(passExp,passActual);




    }

    public void clickOnLogin() {
        loginElements.loginBtn.click();
    }
}
