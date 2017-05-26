package www.naukri.com;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_LaunchNaukri {
WebDriver driver;
	
	@BeforeClass 
	 public void start(){
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSetups\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		
		String homepage =driver.getWindowHandle();
	}
	@Test(priority=1)
	public void Applaunchapp(){
	driver.get("https://www.naukri.com/");	
	
	
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
			public void LogOut(){
		
			 Actions act=new Actions(driver);
			 
			 
			 //Mouse over event
			 act.moveToElement(driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]"))).perform();
	
			 driver.findElement(By.xpath("//a[@title='Log Out']")).click();
			
				
			 
				
				
				
		}
		 @Test(priority=6)
	    public void VerifyLoginpage(){
			 
			 driver.findElement(By.xpath("//a[@href='https://my.naukri.com']")).click();
			 boolean EmailID = driver.findElement(By.xpath("//input[@id='emailTxt']")).isDisplayed();
			 boolean Password = driver.findElement(By.xpath("//input[@id='pwd1']")).isDisplayed();
			 boolean LoginButton = driver.findElement(By.xpath("//input[@name='submit12']")).isDisplayed();
				
			if (EmailID== true && Password==true && LoginButton==true){
			System.out.println("The required Login Page Elements are present. pass");	
				
			}			
			else 
			System.out.println("The required Login Page Elements are not present. fail");
		{
			
			
//			@AfterClass
//			public void Logoot (){
//				
				
				
//		}
		}
		 
	}
	
}
	

	
	
