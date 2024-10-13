package elementsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TextBoxes {
    public static void main(String[] args) throws InterruptedException {
        int millisecond=2000;
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor jsx=(JavascriptExecutor) driver;
        driver.get("https://demoqa.com");

        Thread.sleep(millisecond);
        jsx.executeScript("window.scrollBy(0, 356)"); //jsx here is executing a JavaScript command to scroll the page down
        WebElement element=driver.findElement(By.cssSelector("div.category-cards div:first-child div.card-body h5")); //finds first div
        //driver.findElements(By.cssSelector("div.category-cards .card")).get(0).click();
        element.click();

        //getText() & assert
        String expectedMsg="Please select an item from left to start practice.";
        WebElement element2 = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]"));
        String actualText = element2.getText();
        Assert.assertEquals(actualText, expectedMsg);
        Thread.sleep(millisecond);


        WebElement element3 = driver.findElement(By.cssSelector("div.element-list.collapse.show ul li#item-0"));
        element3.click();
        Thread.sleep(millisecond);

        //fill fullname & email
        WebElement userNameInput=driver.findElement(By.id("userName"));
        WebElement userEmailInput=driver.findElement(By.id("userEmail"));
        WebElement submitBttn=driver.findElement(By.id("submit"));
        userNameInput.sendKeys("ecem");
        Thread.sleep(millisecond);

        userEmailInput.sendKeys("ecemnazgorusuk@gmail.com");
        Thread.sleep(millisecond);

        submitBttn.click();
        Thread.sleep(millisecond);
        driver.quit();
    }
}
