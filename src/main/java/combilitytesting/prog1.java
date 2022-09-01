package combilitytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//public class prog1 {
	//@Parameters
	//@Test
	//
	//
	//public void tc(String browserName)
	//{
//		WebDriver driver =null;
//		if(browserName.equals(("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
//			driver = new ChromeDriver();
//		}
	//}
	//}

public class prog1 {
	@Parameters("browserName")
	@Test
	public void TC(String browserName)
	 {
	 WebDriver driver = null;
	 if(browserName.equals("Chrome"))
	 {
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	 driver = new ChromeDriver();
	org.openqa.selenium.Point p = new org.openqa.selenium.Point(500, 700);
	 driver.manage().window().setPosition(p);
	 }
	 else if(browserName.equals("Firefox"))
	 {
	System.setProperty("webdriver.gecko.driver","D://chromedriver.exe");
	 driver = new FirefoxDriver();
	 }
	 else if(browserName.equals("Edge"))
	 {
	System.setProperty("webdriver.edge.driver","D://chromedriver.exe");
	 driver = new EdgeDriver();
	 }
	 driver.get("https://www.facebook.com/"); 
	 } 

	}

