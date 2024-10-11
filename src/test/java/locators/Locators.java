package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String username="ecem";
        String userEmail="ecem@gmail.com";

        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys(username);

        //driver.findElement(By.id("userEmail")).sendKeys(userEmail); // can find id with id -> [id="userEmail"]
        WebElement element=driver.findElement(By.cssSelector("#userEmail")); // can find id with cssSelector -> #userEmail
        element.sendKeys(userEmail);

        element.clear();
        driver.findElement(By.cssSelector("input#userEmail")).sendKeys(userEmail+"2"); //<input id="userEmail/>
        driver.findElement(By.cssSelector("#userForm textarea.form-control ")).sendKeys("example address");
        driver.findElement(By.cssSelector("#permanentAddress-wrapper div textarea.form-control")).sendKeys("example address2");
        driver.findElement(By.cssSelector("label")); // <label>
        //driver.findElement(By.xpath("//div[@class='left-pannel']"));
        WebElement element2=driver.findElements(By.cssSelector("div.element-group ul.menu-list li ")).get(1);
        element2.click();
    }
}
