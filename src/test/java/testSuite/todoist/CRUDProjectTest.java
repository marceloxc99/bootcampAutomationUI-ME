package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDProjectTest extends TestBase{

    @Test
    public void verifyCRUDProject(){

        String projectCreated="MarceloEquise"+new Date().getTime();
        String projectUpdated="NewProjectName"+new Date().getTime();

        mainPage.loginLabel.click();
        loginPage.emailTextBox.setText(user);
        loginPage.passwordTextBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(menuSection.userOptions.isControlDisplayed(), "ERROR! Login failed");

        projectSection.addNewProjectButton.click();
        projectSection.nameProjectTextBox.setText(projectCreated);
        projectSection.addButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated), "ERROR! Project was not created");

        projectSection.projectOptions.click();
        menuProjectSection.editProject.click();
        projectSection.nameProjectTextBox.cleanSetText(projectUpdated);
        projectSection.saveButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated), "ERROR! Project was not updated");

        projectSection.projectOptions.click();
        menuProjectSection.deleteProject.click();
        projectSection.deleteConfirm.click();
        projectSection.getProject(projectUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated), "ERROR! Project was not deleted");
    }
}
