package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.AccountActions;
import org.openqa.selenium.WebDriver;

public class AccountSteps {
    WebDriver driver;

    AccountActions accountActions;

    public AccountSteps(CommonSteps commonSteps, AccountActions accountActions) {
        this.driver = commonSteps.getDriver();
        this.accountActions = accountActions;
    }
//Account addition
    @When("Click on New Account")
    public void click_on_new_account() throws InterruptedException {
        accountActions.clickOnNewAccount();
        Thread.sleep(3000);
    }
    @When("Fill form and click on submit")
    public void fill_form_and_click_on_submit() {
        accountActions.fillFormAndClickOnSubmit();
    }
    @Then("New account should be added")
    public void new_account_should_be_added() {
        System.out.println("Account added successfully");
    }

// Account deletion
    @When("Click on delete Account")
    public void click_on_delete_account() throws InterruptedException {
        accountActions.clickOnDeleteAccount();
    }
    @When("Enter account no and click on submit")
    public void enter_account_no_and_click_on_submit() {
        accountActions.enterAccNoAndClickOnSubmit();
    }
    @When("click on Ok")
    public void click_on_ok() {
       accountActions.clickOnOk();
    }
    @Then("Account should get deleted")
    public void account_should_get_deleted() {
        System.out.println("Account has been deleted successfully");
    }
}
