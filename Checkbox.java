package pack;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();//object created	
			driver.get("https://www.ironspider.ca/forms/checkradio.htm");//site to be test
				driver.manage().window().maximize();//
				WebElement bluecheck=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[3]"));
				bluecheck.click();
				System.out.println(bluecheck.isSelected());
				
				List<WebElement> chkList = driver.findElements(By.xpath("//input[@name='color']"));
                                                               //tagname[@attribute name='value'];
				for(int i=0;i<chkList.size();i++) {            //input[@type='checkbox'] or //input[@name='color']
		
		chkList.get(i).click();
		System.out.println(chkList.get(i).getAttribute("value"));
		//System.out.println(chkList.get(i).getDomAttribute("value")); if previous line is not working
					
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		 radio.click();	
		 System.out.println(radio.isSelected());
		
	}

	}
}
