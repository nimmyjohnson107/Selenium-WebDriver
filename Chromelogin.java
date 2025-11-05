package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelogin {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();//object created	
				driver.get("https://www.google.com/");//site to be test
					driver.manage().window().maximize();//

	}

}
