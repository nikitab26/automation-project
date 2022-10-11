package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.CustomerActions;
import org.openqa.selenium.WebDriver;

public class CustomerSteps {

    WebDriver driver;

    CustomerActions customerActions;

    public CustomerSteps(CommonSteps commonSteps, CustomerActions customerActions) {
        this.driver = commonSteps.getDriver();
        this.customerActions = customerActions;
    }


    @When("Click on New Customer")
    public void click_on_new_customer() throws InterruptedException {
        customerActions.clickOnNewCustomer();
        Thread.sleep(5000);
    }

    @When("Fill customer details and click on submit")
    public void fill_customer_details_and_click_on_submit() throws InterruptedException {
        customerActions.fillCustomerDetailsAndSubmit();
    }

    @Then("New customer should be added")
    public void new_customer_should_be_added() {
        System.out.println("New customer has been added successfully");
    }

    @When("Click on Edit Customer and enter customer ID")
    public void click_on_edit_customer_and_enter_customer_id() throws InterruptedException {
        customerActions.clickOnEditCustomerandEnterCustId();
    }
    @When("Edit customer details and click on submit")
    public void edit_customer_details_and_click_on_submit() {
        customerActions.editCustDetailsAndClickOnSubmit();
    }
    @Then("Customer details should get edited")
    public void customer_details_should_get_edited() {
        System.out.println("Customer details has been edited successfully");
    }

    @When("Click on delete Customer and enter customer ID")
    public void click_on_delete_customer_and_enter_customer_id() throws InterruptedException {
        customerActions.clickOndeleteCustomerandEnterCustId();
    }
    @When("Click on Ok")
    public void click_on_ok() {
        customerActions.clickOnOk();
    }
    @Then("Customer should get deleted")
    public void customer_should_get_deleted() {
        System.out.println("Customer has been deleted successfully");
    }
}
