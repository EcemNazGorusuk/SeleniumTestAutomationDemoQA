package manageMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
        // driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        // When we don't use maximize or fullscreen, we can manually set the width and height
        Dimension windowSize = new Dimension(1136, 664); // Width and Height
        driver.manage().window().setSize(windowSize);
        System.out.println(driver.manage().window().getSize());

        Thread.sleep(1000);

        // Adjusting the position where the window opens
        Point position = new Point(200, 20); // X and Y coordinates top 20,right 200
        driver.manage().window().setPosition(position);
        System.out.println(driver.manage().window().getPosition());

        Thread.sleep(1000);


    }
}
