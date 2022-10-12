package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver;

    @FindBy(name = "uid")
    public WebElement userId;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "btnLogin")
    public WebElement loginBtn;



    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
