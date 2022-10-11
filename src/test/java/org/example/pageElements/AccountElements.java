package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountElements {
    WebDriver driver;

    @FindBy(linkText = "New Account")
    public WebElement newAccount;

    @FindBy(linkText = "Edit Account")
    public WebElement editAccount;

    @FindBy(linkText = "Delete Account")
    public WebElement deleteAccount;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement accNo;

    @FindBy(name = "AccSubmit")
    public WebElement deleteAccSubmitBtn;

    @FindBy(name = "cusid")
    public WebElement customerId;

    @FindBy(name = "selaccount")
    public WebElement accType;

    @FindBy(name = "inideposit")
    public WebElement initialDeposit;

    @FindBy(name = "button2")
    public WebElement accSubmitBtn;

    public AccountElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
