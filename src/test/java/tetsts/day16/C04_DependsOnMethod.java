package tetsts.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

import java.time.Duration;


public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {


    @Test
    public void test1()  {
        // amazon ana sayfasına gidelim
        driver.get("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() throws InterruptedException {
        //Nutella aratalım
        Thread.sleep(3000);

         driver.findElement(By.id("twotabsearchtextbox"))
         .sendKeys("Nutella"+Keys.ENTER);


    }



    @Test (dependsOnMethods = "test2")
    public void test3() {
        //Sonuc yazısının amazon içerdiğini test edelim
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.getText().contains("Nutella"));
    }
}
