package com.github.lizzie.sandbox.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver;

    @BeforeClass
    private void setUp() {
        driver = new FirefoxDriver();
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void openHomePage() {
        driver.get("http://www.amazon.com");
    }

    @Test
    public void test(){
        //TODO
    }


}

