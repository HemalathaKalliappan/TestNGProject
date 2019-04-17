package pageobjectmodel1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Baseclass.TestBase;
public class TestngListener extends TestBase implements ITestListener {

	
public void onTestStart(ITestResult result) {
		System.out.println("Test has been started");
		log.info("<----"+result.getName()+ "  is Started---->");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test got passed are "+ result.getName());
		log.info("<----"+result.getName()+ "  was Passed---->");
	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test got failed");
		log.error("<----"+result.getName()+ "  was Failed---->");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has been skipped");
		log.warn("<----"+result.getName()+ "  was Skipped---->");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

