package pagestrial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basetrail.testbase;

;

public	class	Loginpages	extends	testbase	{
	
	//Object Resositary
	
	@FindBy(xpath="//input[@id='userid']") private WebElement useridtextbox;
	@FindBy(xpath="//input[@type='password']")private WebElement password ;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath ="//button[@type='submit']")private WebElement Continue;
	@FindBy(xpath="//img[@alt='Kite']")private WebElement logo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhalogo;
	
	
	public Loginpages()
	{
		
	PageFactory.initElements(driver, this);
	}
	public String verifytittle(){
		
		return driver.getTitle();
	}
	public void zerodhalogin() throws Exception
	
	{
		useridtextbox.sendKeys("KYP058");
		//Thread.sleep(1000);
	password.sendKeys("sangita9922");
		submit.click();
		Thread.sleep(1000);
		PIN.sendKeys("992233");
		Continue.click();
}
	
	
}
