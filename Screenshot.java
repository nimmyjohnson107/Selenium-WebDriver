package pack;


import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file1,new File("C:\\Users\\NIMMY JOHNSON\\Pictures\\Screenshots\\scrnsht.png"));
	System.out.println("screenshot saved successfully");

	}

}
