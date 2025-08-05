package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css= "[data-testid=\"email\"]")
    private WebElement emailInput;

    @FindBy(css= "[data-testid=\"password\"]")
    private WebElement passwordInput;

    @FindBy(css= "[data-testid=\"submit\"]")
    private WebElement submit;



    public void login(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submit.click();
    }
    public void load(){
        driver.get("https://qacart-todo.herokuapp.com");
    }


}
