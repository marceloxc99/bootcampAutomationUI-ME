package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTest extends TestBase{

    @Test
    public void verifyCRUDTask() throws InterruptedException {
        String projectCreated="ProjectTask"+new Date().getTime();
        String taskCreated="NewTask"+new Date().getTime();
        String taskUpdated="TaskUpdated"+new Date().getTime();

        mainPage.loginLabel.click();
        loginPage.login(user, password);
        Assertions.assertTrue(menuSection.userOptions.isControlDisplayed(), "ERROR! Login failed");

        projectSection.addProject(projectCreated);
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated), "ERROR! Project was not created");

        taskSection.addNewTaskButton.click();
        taskSection.nameTaskTextBox.setText(taskCreated);
        taskSection.addTaskButton.click();
        Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskCreated), "ERROR! Task was not created");

        taskSection.openEditTask(taskCreated);
        taskSection.editTaskName(taskCreated);
        taskSection.replaceTaskName(taskCreated,taskUpdated);
        taskSection.saveTaskButton.click();
        taskSection.closeTaskModal.click();
        Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskUpdated), "ERROR! Task was not updated");

        taskSection.menuTask.click();
        taskSection.deleteTaskButton.click();
        taskSection.confirmDeleteTask.click();
        taskSection.getTask(taskUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(taskSection.isTaskDisplayedInList(taskUpdated), "ERROR! Task was not deleted");
    }
}
