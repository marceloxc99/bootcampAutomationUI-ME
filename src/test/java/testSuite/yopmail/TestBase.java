package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.BasePage;
import page.yopmail.InboxSection;
import page.yopmail.MainPage;
import page.yopmail.NewMessageSection;
import session.Session;
import util.GetProperties;

public class TestBase {
    MainPage mainPage = new MainPage();
    BasePage basePage = new BasePage();
    InboxSection inboxSection = new InboxSection();
    NewMessageSection newMessageSection = new NewMessageSection();

    String user = GetProperties.getInstance().getUser();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
