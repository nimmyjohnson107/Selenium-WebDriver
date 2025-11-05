package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement choose=driver.findElement(By.id("file-upload"));
        choose.sendKeys("C:\\Users\\NIMMY JOHNSON\\Downloads\\Nimmy_scenario.pdf");

        Thread.sleep(1000);
        WebElement upload=driver.findElement(By.id("file-submit"));
        upload.click();

	}

}
