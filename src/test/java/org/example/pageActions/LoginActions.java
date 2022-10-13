package org.example.pageActions;

import org.apache.commons.io.FileUtils;
import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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


        String exp = "User-ID must not be blank";
        String actual = driver.findElement(By.id("message23")).getText();

        Assert.assertEquals(exp,actual);

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("src/test/resources/invalidUsername-screenshot.png"));
    }

    public void clickOnLogin() {
        loginElements.loginBtn.click();
    }
}
