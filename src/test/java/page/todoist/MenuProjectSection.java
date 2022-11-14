package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MenuProjectSection {

    public Button editProject = new Button(By.xpath("//div[text()='Edit project']"));
    public Button deleteProject = new Button(By.xpath("//div[text()='Delete project']"));

}
