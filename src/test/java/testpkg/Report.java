package testpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report {

	WebDriver driver;
	String url = "https://automationteststore.com/";
	ExtentSparkReporter reporter;     // set path and configuration
	ExtentReports extent;            // generate report
	ExtentTest test;                // log prepare
	
	@BeforeTest
	public void sam()
	{
		reporter = new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\PROJECT\\Extended_Report");//set path
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows11");
		extent.setSystemInfo("tester name", "meera lalithambika");
		extent.setSystemInfo("browsername", "chrome");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void eg()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void titleverification()
	{
		test = extent.createTest("title verification");
		String exp = "A place to practice your automation skills!";
		String act = driver.getTitle();
		Assert.assertEquals(act, exp);
	}
	
	@Test
	
	public void buttontextverification()
	{
		test = extent.createTest("button verification");
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException //
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
			
			String screenshotpath = screeshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}
		else if(result.getStatus() == ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is " + result.getName());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"test case passed is " + result.getName());
		}
	}
	public static String screeshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String destination = "C:/Users/HP/eclipse-workspace/PROJECT/Extended_Report/Extended_Report_sub_folder/"
                + screenshotname + ".png";;
		// File finaldestination = new File(destination);
		// FileHandler.copy(src, finaldestination);
		FileHandler.copy(src, new File(destination));
		
		return destination;
	}
	
}
