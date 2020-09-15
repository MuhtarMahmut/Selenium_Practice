package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Library;

public class BasicNavigations {

    public static void main(String[] args) {
        /*
            to("URL"): opens the URL. faster than get()
            back()
            forward()
            refresh()
         */

        WebDriverManager.chromedriver().setup(); //set up the chrome browser

        ChromeDriver driver = new ChromeDriver();  // opens chrome browser

        Library.sleep(5);

        driver.navigate().to("https://www.google.com");

        Library.sleep(5);

        driver.navigate().to("https://www.google.com");





    }

}
