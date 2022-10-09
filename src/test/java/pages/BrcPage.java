package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;

public class BrcPage {
    public WebElement userEmail;
    public Label basariliGiris;

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brclogin;
}
