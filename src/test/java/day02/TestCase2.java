package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.TestBase;

import java.util.concurrent.TimeUnit;

public class TestCase2 extends TestBase {

    @Test(description = "Search Hazel Hates Muhtar On Google")
    public void method1() throws Exception{
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Hazel Hates Muhtar" + Keys.ENTER);
    }

    @Test(description = "Search Apple on google website")
    public void method2(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Apple"+Keys.ENTER);
    }

    @Test(description = "Search Cat on google website")
    public void method3(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Cat"+Keys.ENTER);
    }




}
