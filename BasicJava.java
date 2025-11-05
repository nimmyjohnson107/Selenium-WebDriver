package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicJava {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();//object created	
	driver.get("https://www.saucedemo.com/");//site to be test
		driver.manage().window().maximize();//
		Thread.sleep(2000);// when error comes ,keep mouse on thread,then add throw declaration
		
		//driver.findElement(By.id("user-name")).click();
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement user=driver.findElement(By.id("user-name"));
		user.click();
		user.sendKeys("standard_user");
		
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.click();
		pass.sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		
		WebElement addtocart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		cart.click();
		WebElement checkout=driver.findElement(By.id("checkout"));
		 checkout.click();
		 WebElement firstname=driver.findElement(By.id("first-name"));
		 firstname.click();
		 
		 firstname.sendKeys("Megha");
		 WebElement lastname=driver.findElement(By.id("last-name"));
		 lastname.click();
		 lastname.sendKeys("Babu");
		 WebElement postalcode=driver.findElement(By.id("postal-code"));
		 postalcode.click();
		 postalcode.sendKeys("62035");
		 		 WebElement continues=driver.findElement(By.id("continue"));
		 continues.click();
		 
		 WebElement finish=driver.findElement(By.xpath("//*[@id=\"finish\"]"));
			finish.click();
		
	}

}
