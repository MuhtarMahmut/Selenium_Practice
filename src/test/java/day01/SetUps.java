package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUps {

    public static void main(String[] args) {

        // setup: browser
        WebDriverManager.chromedriver().setup();

        // opening browser
       ChromeDriver driver = new ChromeDriver();



    }
}
