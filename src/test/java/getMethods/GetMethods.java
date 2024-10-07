package getMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/");

        //We can access some properties of the URL obtained via GET methods like this:
        System.out.println("current window url:" + driver.getCurrentUrl());
        System.out.println("get hash code:" + driver.getWindowHandle());
        System.out.println("get page's title :" + driver.getTitle());
        System.out.println("get page's source\n :" + driver.getPageSource());
    }
}
