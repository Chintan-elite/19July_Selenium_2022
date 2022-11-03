package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MytestListener implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		
	}
	
	public void onStart(ITestContext context) {
		System.out.println("Test start");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("test finished");
	}
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("statrt");
	}
}
