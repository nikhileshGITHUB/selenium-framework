

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagestrial.Loginpages;

public class logintest  extends Loginpages {
	
		Loginpages login;
		
		
		@BeforeMethod
		public void before() throws Exception
		{
			initalization();
			login = new Loginpages();
		//.	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		

		
		@Test
		public void zerodhalogintest() throws Exception{
			
			//Thread.sleep(1000);
			login.zerodhalogin();
			
		}
//		@Test
//		public void verifyTitleTest() throws Exception
//		{
//
//			
//			//Thread.sleep(2000);
//			String acttitle =login.verifytittle();
//		//	String expTittle ="Kite - Zerodha's fast and elegant flagship trading platform";
//			System.out.println(acttitle);
//			
//		}
//		
	@AfterMethod
		public void after()
		{
			
			driver.quit();
		}
		
		
}


