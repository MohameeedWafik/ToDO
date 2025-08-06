package com.qacart.todo.testcases;

import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ToDoTest extends BaseTest {
    @Test
    public void addNewToDo (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("mohamedwafik5445@gmail.com","123123123");
//        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
//        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn selenium");
//        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        String actualResult = driver.findElement(By.cssSelector("[data-testid=\"todo-item\"]")).getText();
        Assert.assertEquals(actualResult, "Learn selenium");
    }
    @Test
    public void DeleteToDo(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("mohamedwafik5445@gmail.com","123123123");
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();
        boolean isNotMessageDisplayed = driver.findElement(By.cssSelector("[data-testid=\"no-todos\"]")).isDisplayed();
        Assert.assertTrue(isNotMessageDisplayed);
    }
}
