package org.example.pageActions;

import org.example.pageElements.LogoutElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class LogoutActions {
    private WebDriver driver;

    LogoutElements logoutElements;

    public LogoutActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.logoutElements = new LogoutElements(driver);
    }

    public void clickOnLogout(){
        logoutElements.logOut.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
