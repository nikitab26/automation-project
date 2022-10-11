package org.example.pageActions;

import org.example.pageElements.AccountElements;
import org.example.pageElements.CustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AccountActions {

    private WebDriver driver;

    AccountElements accountElements;

    public AccountActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.accountElements = new AccountElements(driver);
    }

    public void clickOnNewAccount() {
        accountElements.newAccount.click();
    }

    public void fillFormAndClickOnSubmit(){
        accountElements.customerId.sendKeys("78554");
        accountElements.accType.sendKeys("Savings");
        accountElements.initialDeposit.sendKeys("5000");
        accountElements.accSubmitBtn.click();
    }

    public void clickOnDeleteAccount() throws InterruptedException {
        accountElements.deleteAccount.click();
        Thread.sleep(3000);
    }

    public void enterAccNoAndClickOnSubmit(){
        accountElements.accNo.sendKeys("112764");
        accountElements.deleteAccSubmitBtn.click();
    }

    public void clickOnOk(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}
