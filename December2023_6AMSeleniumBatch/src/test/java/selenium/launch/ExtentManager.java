package selenium.launch;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseTest
{
	
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		
		if(htmlReport == null)
		{
			htmlReport = new ExtentHtmlReporter(projectpath+"\\reports\\report.html");
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Functional Report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "Windows10");
			report.setSystemInfo("TesterName", "Ravikanth Lella");
			report.setSystemInfo("Browser", "chrome");
		}
		
		return report;	
	}

}
