package page.yopmail;

import control.Label;
import org.openqa.selenium.By;

public class BasePage {

    public Label mailLabel = new Label(By.xpath("//div[@class='bname']"));
}
