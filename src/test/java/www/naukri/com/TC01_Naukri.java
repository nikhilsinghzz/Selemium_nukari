package www.naukri.com;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TC01_Naukri {
WebDriver driver;
	
	@BeforeClass
	 public void start(){
		ConfigReader config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver =new ChromeDriver();
		
		String homepage =driver.getWindowHandle();	}
	    @Test(priority=1)
	    public void Applaunchapp(){
	    ConfigReader config=new ConfigReader();	
	    driver.get(config.getURLPath());	
	
	
	}
	
	@Test(priority=2)
	public void closepopUp (){
	String homepage =driver.getWindowHandle();
	System.out.println("this is my home page" + " = " + homepage);
	
	}
	
	@Test(priority=3)
	public void closepopup(){
		
		//Handling Naukri Pop up Here
		
		//Getting Current window ID 
		 String homepage =driver.getWindowHandle();
	     System.out.println("this is my home page" + " = " + homepage);
		
	     //Getting how many pop ups are there
		 Set<String> window=driver.getWindowHandles();
		 System.out.println(window.size());
		
		 
		 Iterator Iterator=window.iterator();
		 String CurrentwindowID;
		 while(Iterator.hasNext()){
		 CurrentwindowID=Iterator.next().toString();
		 System.out.println("this is my" + CurrentwindowID);
			
			
			
			if(!CurrentwindowID.equals(homepage)){
				driver.switchTo().window(CurrentwindowID);
				driver.close();
			   
				
				//Coming back to parent parent window home page
				driver.switchTo().window(homepage);
				
			}
			
		 }
		 
	}
		 @Test(priority=4)
		 
			public void LoginNaukriPage() throws InterruptedException
			
			{
				driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
				Thread.sleep(10000);
				
				//driver.switchTo().frame(driver.findElement(By.className("loginLay")));
				
				driver.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys("nikhilsingz@gmail.com");
				driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("n9875033620");
				driver.findElement(By.xpath(".//button[@value='Login']")).click();
				
			}
		 
		 
		 @Test(priority=5)
			public void LogOut() throws InterruptedException{
			 TC01_Naukri lgn=new TC01_Naukri();
			 Actions act=new Actions(driver);
			 
			 
			 //Mouse over event
			 act.moveToElement(driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]"))).perform();
			 Thread.sleep(1000);
	
			 driver.findElement(By.xpath("//a[@title='Log Out']")).click();
				
			// driver.quit();
				
				
             System.out.println("hello hi ");
			 
		
			 lgn.Applaunchapp();
			 lgn.LoginNaukriPage();
			 System.out.println("hello hi2 ");
		boolean Username = driver.findElement(By.xpath(".//*[@id='eLogin']")).isDisplayed();
		boolean Password = driver.findElement(By.xpath(".//*[@id='pLogin']")).isDisplayed();
		boolean LoginButton = driver.findElement(By.xpath(".//button[@value='Login']")).isDisplayed();
		
		if (Username== true && Password==true && LoginButton==true){
			System.out.println("The required Login Page Elements are present. pass");	
		}
		else System.out.println("The required Login Page Elements are not present. fail");
		driver.close();
		{
			
		}
		 
	}
	
}
	

	
	
