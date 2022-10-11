package org.example.pageActions;

import org.example.pageElements.CustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;


public class CustomerActions {
    private WebDriver driver;

    CustomerElements customerElements;

    public CustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.customerElements = new CustomerElements(driver);
    }

    public void clickOnNewCustomer() {
        customerElements.newCustomer.click();
    }

    public void fillCustomerDetailsAndSubmit() throws InterruptedException {
        customerElements.customerName.sendKeys("Yogita");
        customerElements.gender.click();
        customerElements.dateOfBirth.sendKeys("05-05-1996");
        customerElements.address.sendKeys("Mumbai");
        customerElements.city.sendKeys("Mumbai");
        customerElements.state.sendKeys("Maharashtra");
        customerElements.pin.sendKeys("123456");
        customerElements.telephoneNumber.sendKeys("123456789");
        customerElements.emailId.sendKeys("test789@testing.com");
        customerElements.submitBtn.click();
    }

    public void clickOnEditCustomerandEnterCustId() throws InterruptedException {
        customerElements.editCustomer.click();
        Thread.sleep(3000);
        customerElements.customerId.sendKeys("69942");
        customerElements.custIdSubmitBtn.click();
    }

    public void editCustDetailsAndClickOnSubmit() {
        customerElements.city.clear();
        customerElements.city.sendKeys("Thane");
        customerElements.submitBtn.click();
    }


    public void clickOndeleteCustomerandEnterCustId() throws InterruptedException {
        customerElements.deleteCustomer.click();
        Thread.sleep(3000);
        customerElements.customerId.sendKeys("69942");
        customerElements.custIdSubmitBtn.click();
        }

    public void clickOnOk(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
