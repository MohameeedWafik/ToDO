package com.qacart.todo.testcases;

import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class LoginTest extends BaseTest {
    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("mohamedwafik5445@gmail.com","123123123");
        boolean isWelcomeDisplayed= driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
        //Test

    }
}
