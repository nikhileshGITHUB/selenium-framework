package pagestrial;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basetrail.testbase;




	public class Dashboardpages extends testbase {

		@FindBy(xpath="//span[@class='nickname']")private  WebElement nickname;
		@FindBy(xpath="//img[@alt='Kite logo']")private  WebElement logo;
		@FindBy(xpath="//span[@class='user-id']")private  WebElement  click;
		@FindBy(xpath="//span[@class='user-id']")private  WebElement  userid;
		@FindBy(xpath="//h4[@class='username']")private  WebElement  username;
		@FindBy(xpath="//div[@class='email']")private  WebElement email;
		@FindBy(xpath="//a[@target='_self']")private  WebElement  logout;
		@FindBy(xpath="//div[@class='app-nav']//span[text()='Orders']")private  WebElement  order;
		
		
		//button[@type='button']
		public Dashboardpages()
		{
			PageFactory.initElements( driver, this);
		}
		
		
		
		public String verifynickname(){
			
			return nickname.getText();
			
		}
		 public boolean verifylogo ()
		 {
			 return logo.isDisplayed();
		 }
		 public void click()
		 {
			 click.click();
		 }
		 public String verifyuserid()
		 {
			 
			 return userid.getText();
		 
		 }
		 public String verifyusername()
		 {
			 return username.getText();
		 }
		 
		 public String verifyemail()
		 {
			 return email.getText();
		 }
		 public void logoutclick()
		 {
			 logout.click();
}
	}
