package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Library;

public class openURL {

    public static void main(String[] args)  {

         // set up browser
        WebDriverManager.chromedriver().setup();

        // open browser:
        ChromeDriver driver = new ChromeDriver();  // represents the browser

         Library.sleep(2.5);  // waits 2.5 seconds

       // open URL : get("url")
        driver.get("https://www.google.com");

        Library.sleep(3); // waits 3 seconds

      //  driver.close(); // closes a single tab

        driver.quit(); //closes all the tabs


    }

}