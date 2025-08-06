package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;

public class NewToDoPage extends BasePage {
    public NewToDoPage(WebDriver driver) {
        super(driver);
    }
    public void load() {
        driver.get("https://qacart-todo.herokuapp.com/todos/new");
    }
    public void createToDo(String title, String description) {
        // Implement the logic to create a new ToDo item
        // This might involve finding input fields for title and description,
        // entering the provided values, and submitting the form.
    }
    public void deleteToDo(String todoId) {
        // Implement the logic to delete a ToDo item by its ID
        // This might involve finding the delete button for the specific ToDo item
        // and clicking it.
    }
    public String getToDoText(String todoId) {
        // Implement the logic to retrieve the text of a ToDo item by its ID
        // This might involve finding the element that contains the ToDo text
        // and returning its text content.
        return "";
    }
}
