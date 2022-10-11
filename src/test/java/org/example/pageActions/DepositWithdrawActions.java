package org.example.pageActions;

import org.example.pageElements.DepositWithdrawElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class DepositWithdrawActions {
    private WebDriver driver;

    DepositWithdrawElements depositWithdrawElements;

    public DepositWithdrawActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.depositWithdrawElements = new DepositWithdrawElements(driver);
    }

    public void clickOnDeposit(){
        depositWithdrawElements.deposit.click();
    }

    public void clickOnWithdraw(){
        depositWithdrawElements.withdraw.click();
    }

    public void enterDetailsAndClickSubmit(){
        depositWithdrawElements.accNo.sendKeys("112764");
        depositWithdrawElements.amount.sendKeys("5000");
        depositWithdrawElements.description.sendKeys("Personal");
        depositWithdrawElements.depositWithdrawSubmit.click();
    }
}
