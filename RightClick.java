package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();	
			driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
				Actions act=new Actions(driver);
				Thread.sleep(2000);
				WebElement electronics=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
				act.contextClick(electronics).build().perform();//contentClick is used for right click the electronics
				
				WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));		
	            act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();//movetoElement for mousehover
//keydown is for pressing a key 
	            //keyup is for after pressing a key and releasing it
		
	            act.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("cover").build().perform();
	}
}

