package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        
        WebElement fullname = driver.findElement(By.id("userName"));
        fullname .sendKeys("Nimmy");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("nimmyjohnson123@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Camerinfolks Pvt Ltd, Kakkanad");

        // Select all text (Ctrl + A)
        currentAddress.sendKeys(Keys.CONTROL, "a");
        Thread.sleep(2000);

        // Copy text (Ctrl + C)
        currentAddress.sendKeys(Keys.CONTROL, "c");
        Thread.sleep(2000);

        // Paste into permanent address (Ctrl + V)
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL, "v");
        Thread.sleep(2000);

        driver.quit();
    }
}
