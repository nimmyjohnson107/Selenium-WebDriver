package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CamerinLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();//object created	
			driver.get("https://www.google.com/");//site to be test
				driver.manage().window().maximize();//
				WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
				searchbox.click();
				searchbox.sendKeys("Camerinfolks Pvt. Ltd");
				searchbox.submit();
	}

}
