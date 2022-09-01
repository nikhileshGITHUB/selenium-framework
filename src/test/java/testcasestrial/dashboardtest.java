import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basetrail.testbase;



public class dashboardtest extends testbase {
dashboardtest dash;
	loginpages login;
	
	@BeforeMethod
	public void before() throws Exception{
		
		
		initalization();
		
		login= new loginpages();
		dash = new DashBoardPage();
		login.zerodhalogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void  verifynicknametest()
	{
		
	dash.verifynickname();
	}
	
	@Test
	public void   verifylogotest ()
	{
		dash.verifylogo();
		
	}
	@Test
	public void verifyuseridTest()
	{
		dash.verifyuserid();
	}
	@Test
	public void verifyusernameTest()
	{
		dash.click();
		dash.verifyusername();
	}
	@Test
	public void  verifyemailTest()
	{
		dash.click();
		dash.verifyemail();
	}
	@Test
	public void logoutclickTEst()
	{
		dash.click();
		dash.logoutclick();
	}
	@AfterMethod
	public void after()
	{
		driver.close();
	}
}

