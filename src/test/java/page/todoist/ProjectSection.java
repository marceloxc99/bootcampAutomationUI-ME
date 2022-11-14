package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSection {
    public Button addNewProjectButton = new Button(By.xpath("//button[@aria-label='Add project']"));
    public TextBox nameProjectTextBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addButton = new Button(By.xpath("//button[text()='Add']"));
    public  Button projectOptions = new Button(By.xpath("(//button[@aria-label='More project actions'])[last()]"));
    public  Button saveButton = new Button(By.xpath("//button[text()='Save']"));
    public Button deleteConfirm = new Button(By.xpath("//span[text()='Delete']"));
    public ProjectSection(){}

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject) {
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        return projectCreated;
    }

    public void addProject(String nameProject) {
        addNewProjectButton.click();
        nameProjectTextBox.setText(nameProject);
        addButton.click();
    }
}
