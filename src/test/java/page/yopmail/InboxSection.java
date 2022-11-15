package page.yopmail;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class InboxSection {
    public Button newMail = new Button(By.id("newmail"));
    public Button refresh = new Button(By.id("refresh"));

    public Label lastEmail = new Label(By.xpath("(//span[@class='lmf'])[1]"));
    public Label lastSubject = new Label(By.xpath("(//div[@class='lms'])[1]"));

    public boolean isLastEmailEqualToEmailSent(String emailSent, String emailReceive){
        if (emailSent.equals(emailReceive))
            return true;
        return false;
    }

    public boolean isLastSubjectEqualToSubjectSent(String subjectSent, String subjectReceive){
        if (subjectSent.equals(subjectReceive))
            return true;
        return false;
    }
}
