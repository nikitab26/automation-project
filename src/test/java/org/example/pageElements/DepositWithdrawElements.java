package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositWithdrawElements {
    WebDriver driver;

    @FindBy(linkText = "Deposit")
    public WebElement deposit;

    @FindBy(linkText = "Withdrawal")
    public WebElement withdraw;

    @FindBy(name = "accountno")
    public WebElement accNo;

    @FindBy(name = "ammount")
    public WebElement amount;

    @FindBy(name = "desc")
    public WebElement description;

    @FindBy(name = "AccSubmit")
    public WebElement depositWithdrawSubmit;

    public DepositWithdrawElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
