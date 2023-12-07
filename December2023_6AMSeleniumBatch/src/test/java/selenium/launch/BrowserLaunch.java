package selenium.launch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1 = new FirefoxDriver();
		
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
	}

}
