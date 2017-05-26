package www.naukri.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utility.ConfigReader;

public class BaseClass {
	
	public WebDriver driver;

	@BeforeClass
	public void StartApplication() throws InterruptedException{
		Reporter.log("=====Browser Session Started=====", true);
		
		ConfigReader config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		Thread.sleep(3000);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(config.getURLPath());
		
		Reporter.log("=====Application Started=====", true);
		
	}

	
//	@AfterClass
//	public void closeApplication()
//	{
//		driver.quit();
//		Reporter.log("=====Browser Session End=====", true);
//		
//	}
	
}
