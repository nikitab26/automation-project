package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerElements {
    WebDriver driver;

    @FindBy(linkText = "New Customer")
    public WebElement newCustomer;

    @FindBy(linkText = "Edit Customer")
    public WebElement editCustomer;

    @FindBy(linkText = "Delete Customer")
    public WebElement deleteCustomer;

    @FindBy(name = "cusid")
    public WebElement customerId;

    @FindBy(name = "AccSubmit")
    public WebElement custIdSubmitBtn;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(xpath = "//input[@name='rad1'][2]")
    public WebElement gender;

    @FindBy(name = "dob")
    public WebElement dateOfBirth;

    @FindBy(name = "addr")
    public WebElement address;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "pinno")
    public WebElement pin;

    @FindBy(name = "telephoneno")
    public WebElement telephoneNumber;

    @FindBy(name = "emailid")
    public WebElement emailId;

    @FindBy(name = "sub")
    public WebElement submitBtn;

    public CustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
