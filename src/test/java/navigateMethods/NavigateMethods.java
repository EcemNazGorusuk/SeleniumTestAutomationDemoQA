package navigateMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods  {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
        Thread.sleep(2000);

        //Navigation to the specified address, Use navigate to go forward(->) and backward (<-) in the browser history
        driver.navigate().to("https://www.toolsqa.com/selenium-training/");
        Thread.sleep(2000);

        driver.navigate().back();  // Go back to the previous page
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.navigate().forward(); // Go forward to the next page
        driver.navigate().refresh();

        driver.close(); //close chrome
        driver.quit();  //quit
    }
}
