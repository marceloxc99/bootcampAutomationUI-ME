package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TaskSection {
    public Button addNewTaskButton = new Button(By.xpath("//button[text()='Add task']"));
    public TextBox nameTaskTextBox = new TextBox(By.xpath("//div[@role=\"textbox\"]/div/div/div"));
    public Button addTaskButton = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));

    public Button saveTaskButton = new Button(By.xpath("//span[contains(text(),'Save')]"));
    public Button closeTaskModal = new Button(By.xpath("//button[@aria-label='Close modal']"));
    public Button menuTask = new Button (By.xpath("//button[@data-testid='more_menu']"));
    public Button deleteTaskButton = new Button(By.xpath("//div[text()='Delete task']"));
    public Button confirmDeleteTask = new Button(By.xpath("//button/span[text()='Delete']"));

    public TaskSection(){}

    public boolean isTaskDisplayedInList(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated.isControlDisplayed();
    }

    public Label getTask(String nameTask) {
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated;
    }

    public void openEditTask(String nameTask){
        Button taskCreated = new Button(By.xpath("//div[text()='"+nameTask+"']"));
        taskCreated.click();
    }

    public void editTaskName(String nameTask){
        Button editTaskName = new Button(By.xpath("//div[@role='button']/div[text()='"+nameTask+"']"));
        editTaskName.click();
    }

    public void replaceTaskName(String oldTaskName, String newTaskName){
        TextBox setNewTask = new TextBox(By.xpath("//span[text()='"+oldTaskName+"']"));
        setNewTask.selectAllandReplace(newTaskName);
    }


}
