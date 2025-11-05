package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	private static final String List = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();	
			driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();//
				
				
				WebElement user=driver.findElement(By.id("user-name"));
				user.click();
				user.sendKeys("standard_user");
			
				WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				pass.click();
				pass.sendKeys("secret_sauce");
				
				driver.findElement(By.name("login-button")).click();
				//driver.navigate().back();
				//driver.navigate().forward();
				WebElement list=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
			    Thread.sleep(2000);
			    Select obj=new Select(list);
			   // obj.selectByIndex(2);//selectByIndex is for selecting dropdown by index
				//obj.selectByValue("hilo");//take dropdown then inspect ,then in select section expand then option value 
				obj.selectByVisibleText("Name (Z to A)");
	}
}
