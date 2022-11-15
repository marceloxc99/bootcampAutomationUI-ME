package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewMessageSection {
    public TextBox receiverTextBox = new TextBox(By.id("msgto"));
    public TextBox subjectTextBox = new TextBox(By.id("msgsubject"));
    public TextBox bodyTextBox = new TextBox(By.id("msgbody"));
    public Button sendMsg = new Button(By.id("msgsend"));
}
