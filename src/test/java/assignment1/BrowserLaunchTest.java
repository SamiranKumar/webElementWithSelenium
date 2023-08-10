package assignment1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchTest {

    private static final String OPEN_URL = "https://www.google.com/";

    public static void main(String[] args) {
        browserOpen();
    }

    private static void browserOpen() {

        WebDriverManager.firefoxdriver().setup();  //WebDriverManager setup with firefox driver and create new session

        WebDriver driver = new FirefoxDriver(); // create webDriver object

        driver.get(OPEN_URL); //// Open google home page


        waitForResponse();
        // Threads can be used to perform complicated tasks in the background without interrupting the main program

        // Maximize the current window
        driver.manage().window().maximize();


        waitForResponse(); //

        driver.quit(); // close browser and session distroy
    }


    public static void waitForResponse() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
