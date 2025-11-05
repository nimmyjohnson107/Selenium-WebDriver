package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver","C:\\Users\\NIMMY JOHNSON\\Desktop\\Selenium Drivers\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://in.musafir.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        int A=pageTitle.length();
        System.out.println("length of the Title is:"+A);	
        String pageurl = driver.getCurrentUrl();
       System.out.println(pageurl);
         if(pageurl.equals("https://in.musafir.co"))
  {
	  System.out.println("actual url is same as expected url");
  }
  else
  {
	  System.out.println("actual url is not same as expected url");
  }
  driver.close();

		
		
		
		
		
		
		
		
		
	}

}
