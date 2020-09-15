package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.TestBase;

public class TestCase3 extends TestBase {

    @Test(description = "search dog")
    public void Test1(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("dog"+ Keys.ENTER);
    }

    @Test(description = "search tiger")
    public void Test2(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("tiger"+ Keys.ENTER);
    }

    @Test(description = "search lion")
    public void Test3(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("lion"+ Keys.ENTER);
    }

    @Test(description = "search eagle")
    public void Test4(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("eagle"+ Keys.ENTER);
    }

    @Test(description = "search hazel")
    public void Test5(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("hazel"+ Keys.ENTER);
    }


}
