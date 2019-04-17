package ScreenshotUtility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Baseclass.TestBase;
import pageobjectmodel1.contactpagetest;


public class CaptureScreenshot extends TestBase{
	
	
	public void capturescreenshot(WebDriver driver, String screenshotname) throws IOException {
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String dest = "C:\\Users\\khemalatha\\git\\TestProject\\Testngframework\\Snapshot\\screenshot"+screenshotname+".png";
		File target = new File(dest);
		FileUtils.copyFile(scr, target);
		
	}

}
