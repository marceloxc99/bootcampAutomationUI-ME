package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MenuSection {

    public Button userOptions = new Button(By.xpath("//button[@class='reactist_menubutton top_bar_btn settings_btn']"));
}
