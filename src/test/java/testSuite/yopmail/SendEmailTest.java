package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class SendEmailTest extends TestBase{

    @Test
    public void verifySendEmail() throws InterruptedException {
        String receiver;
        String subject = "testSubject "+ new Date().getTime();
        String body = "testBody "+ new Date().getTime();

        mainPage.mail.setText(user);
        mainPage.enter.click();

        receiver = basePage.mailLabel.getText();
        inboxSection.newMail.click();
        Session.getInstance().getBrowser().switchTo().frame("ifmail");
        newMessageSection.receiverTextBox.setText(receiver);
        newMessageSection.subjectTextBox.setText(subject);
        newMessageSection.bodyTextBox.setText(body);
        newMessageSection.sendMsg.click();

        Session.getInstance().getBrowser().switchTo().defaultContent();
        Thread.sleep(1000);
        inboxSection.refresh.click();
        Session.getInstance().getBrowser().switchTo().frame("ifinbox");
        Assertions.assertTrue(inboxSection.isLastEmailEqualToEmailSent(inboxSection.lastEmail.getText(),receiver), "ERROR! email was not sent");
        System.out.println(inboxSection.lastSubject.getText());
        Assertions.assertTrue(inboxSection.isLastSubjectEqualToSubjectSent(inboxSection.lastSubject.getText(),subject), "ERROR! subject is not correct");
        Thread.sleep(5000);
    }
}
