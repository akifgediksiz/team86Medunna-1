package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AyselPage {
public AyselPage(){

    PageFactory.initElements(Driver.getDriver(),this);
}

}
