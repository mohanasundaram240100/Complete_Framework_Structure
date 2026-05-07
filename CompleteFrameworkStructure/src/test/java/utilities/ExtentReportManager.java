package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extentreport;
	public ExtentTest extenttest;
	
	
	public void onStart(ITestContext context)
	{
		sparkreporter = new ExtentSparkReporter("ExtentReport.html");
		sparkreporter.config().setDocumentTitle("Automation Report");
		sparkreporter.config().setReportName("Functional Testing");
		
		extentreport = new ExtentReports();
		extentreport.attachReporter(sparkreporter);
		extentreport.setSystemInfo("Tester", "Selenium WebDriver");
		
		
				
	}
	
	public void onTestSuccess(ITestResult result)
	{
		extenttest = extentreport.createTest(result.getName());
		extenttest.pass("Test is Passed");
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		extenttest = extentreport.createTest(result.getName());
		extenttest.fail("Test is Failed");
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		extenttest = extentreport.createTest(result.getName());
		extenttest.skip("Test is Skipped");
		
	}
	
	
	public void onFinish(ITestContext context)
	{
		extentreport.flush();
		
	}
	
	
	

}
