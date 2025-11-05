package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();	
			driver.get("https://webdriveruniversity.com/Actions/index.html");
				driver.manage().window().maximize();
				Actions act=new Actions(driver);
				Thread.sleep(2000);
				WebElement doublec=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
				act.doubleClick(doublec).build().perform();
				
				WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
				WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	            act.dragAndDrop(from, to).build().perform();
		
	}

}
