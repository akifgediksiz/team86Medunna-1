package pojos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AyselPage {
public AyselPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeanAppointmentWebelement;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnameBox;


    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@id='phone'])[1]")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement appointmentdateBox;





}
