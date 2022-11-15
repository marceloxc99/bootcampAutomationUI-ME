package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {

    public TextBox mail = new TextBox(By.id("login"));
    public Button enter = new Button(By.xpath("//button[@class='md']"));
}
