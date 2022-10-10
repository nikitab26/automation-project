package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {
        System.out.println("one");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);
    }

    @Given("Open application in browser")
    public void open_application_in_browser() {
       driver.get("https://demo.guru99.com/V1/index.php");
    }
}
