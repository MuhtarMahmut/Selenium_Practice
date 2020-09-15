package utility;

import com.sun.javafx.geom.Edge;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static String browserName = "firefox";

    public static WebDriver getDriver(){
        WebDriver driver;

        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
        }else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
           driver = null;
          throw new RuntimeException("Are you kidding, Invalid Browser");
        }

        return driver;
    }


}
