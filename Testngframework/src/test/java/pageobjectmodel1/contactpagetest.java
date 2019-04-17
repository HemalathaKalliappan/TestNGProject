package pageobjectmodel1;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Baseclass.TestBase;
import ScreenshotUtility.CaptureScreenshot;
import pageobjectmodel.contactpage;


//@Listeners(pageobjectmodel1.TestngListener.class)
public class contactpagetest extends TestBase  {
	
	contactpage contactsPage;
	CaptureScreenshot capturescreeenshot;
   
	public contactpagetest(){
			super();
			
	}
		
	@BeforeMethod
	public void setUp() throws InterruptedException {
		parameter();
		contactsPage = new contactpage();
		
	}
	
	@Test(priority=1)
	public void verifyContactsPageLabel() throws InterruptedException, IOException{
		capturescreeenshot = new CaptureScreenshot();
	
		driver.switchTo().frame("mainpanel");
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
		contactsPage.clickOnContactsLink();
		contactsPage.clickOnNewContactLink();
		//capturescreeenshot.capturescreenshot(driver, "Testpass");
		Thread.sleep(2000);
		contactsPage.createNewContact();
	}
	
	/*@Test(priority=2)
	public void clickoncontact(){
		driver.switchTo().frame("mainpanel");
		contactsPage.clickOnContactsLink();
	}
	@Test(priority=3)
	public void clickonnew(){
		driver.switchTo().frame("mainpanel");
		contactsPage.clickOnContactsLink();
		contactsPage.clickOnNewContactLink();
	}


	@Test(priority=4)
	public void validateCreateNewContact(){
		driver.switchTo().frame("mainpanel");
		contactsPage.clickOnContactsLink();
		contactsPage.clickOnNewContactLink();
		contactsPage.createNewContact();
	}*/
	


	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			capturescreeenshot.capturescreenshot(driver, result.getName());
		}
		
		if(ITestResult.SUCCESS==result.getStatus())
		{
			capturescreeenshot.capturescreenshot(driver, result.getName());
		}
		if(ITestResult.SKIP==result.getStatus())
		{
			capturescreeenshot.capturescreenshot(driver, result.getName());
		}
		
		
	}
	
	
	
	
}
