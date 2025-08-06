package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NewToDoPage extends BasePage {
    public NewToDoPage(WebDriver driver) {
        super(driver);
    }
     public void load() {
          driver.get("https://qacart-todo.herokuapp.com/todos/new");
     }
        @FindBy(css = "[data-testid=\"title\"]")
        private org.openqa.selenium.WebElement titleInput;
        @FindBy(css = "[data-testid=\"description\"]")
        private org.openqa.selenium.WebElement descriptionInput;
        @FindBy(css = "[data-testid=\"submit\"]")
        private org.openqa.selenium.WebElement submitButton;
    public void addNewToDo(String title, String description) {
        titleInput.sendKeys(title);
        descriptionInput.sendKeys(description);
        submitButton.click();
    }

}
