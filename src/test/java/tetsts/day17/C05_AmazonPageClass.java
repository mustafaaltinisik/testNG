package tetsts.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonPageClass {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);

        String actuelSonuc=amazonPage.aramaSonucWE.getText();
        String arananKleime="nutella";
        Assert.assertTrue(actuelSonuc.contains(arananKleime));
        Driver.closeDriver();
    }
}