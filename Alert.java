package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		String url="https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
        Thread.sleep(2000);
        //AlertBox
        WebElement clickme1 =driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
        clickme1.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        //confirm pop-up
        WebElement clickme3 =driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
        clickme3.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        
        //Prompt Box
        WebElement clickme4 =driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
        clickme4.click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Nimmy");
        driver.switchTo().alert().accept();
        //Alert promobj =driver.switchTo().alert();
        Thread.sleep(2000);
        
        
        
       
	}

}
