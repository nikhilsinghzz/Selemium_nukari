package specs;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import www.naukri.com.BaseClass;

public class TC_PopUpClose extends BaseClass {
	
	@Test(priority=1)
	public void popClose (){
		String homepage =driver.getWindowHandle();
		System.out.println("this is my home page" + " = " + homepage);	
	}

	@Test(priority=2)
	public void ClosepopClose (){
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
	        @Test(priority=2)
	        public void registration () throws InterruptedException{
	        	
	        driver.get("https://login.naukri.com/nLogin/Login.php");
		    driver.findElement(By.xpath("//a[@id='pWdgTab_register']")).click();
		    Thread.sleep(10000);
		    
		    //Enter Email id for Registration with existing mail id
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikhilsingz@gmail.com");
		    driver.findElement(By.xpath("//input[@id='remail']")).sendKeys("nikhilsingz@gmail.com");
		    driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("1234567");
		    driver.findElement(By.xpath("//input[@id='sbtReg']")).click();
		    
		    //Checking if Existing mail id validation  text label is present
		    
		    String bodyText = driver.findElement(By.xpath("//label[@id='exstUsr']")).getText();
		    Thread.sleep(5000);
		    Assert.assertTrue(bodyText.contains("nikhilsingz@gmail.com is already registered with us"), "Text not found!");
		
		
	}
	        
	        @Test(priority=3)
	        public void Freshregistration ()
	       
	        {
	        //Registration with fresh mail id 
	       
	        driver.get("https://login.naukri.com/nLogin/Login.php");
	        driver.findElement(By.xpath("//a[@id='pWdgTab_register']")).click();
            LoginPage objects=new LoginPagObje();
	        objects.TypeEmail();	       
	        objects.Typepassword();
	        objects.ClickOnLoginButton();
	        
	        
	        // For Unique Email id
//	        Date d = new Timestamp(System.currentTimeMillis());
	        String n = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));
	        

	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(n + "abc@gmail.com");
	        driver.findElement(By.xpath("//input[@id='remail']")).sendKeys(n + "abc@gmail.com");
	        driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("1234567");
	        driver.findElement(By.xpath("//input[@id='sbtReg']")).click();
	        
	        	
	        	
	        }
	
	                       
}











