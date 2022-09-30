package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public WebElement login;

    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement cokieButonu;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//*[@id='pass']")
    public WebElement sifre;
    @FindBy(name = "login")
    public WebElement logintusu;
    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement girisYapilmadi;

}
