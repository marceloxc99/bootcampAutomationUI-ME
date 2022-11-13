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
        Assertions.assertTrue(menuSection.userOptions.isControlDisplayed());
    }
}
