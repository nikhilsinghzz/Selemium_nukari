package specs;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import www.naukri.com.BaseClass;

public class RegistrationNaukri extends BaseClass {
	
	@Test
	public void Registartion() throws InterruptedException{
	 	
        driver.get("https://login.naukri.com/nLogin/Login.php");
	    driver.findElement(By.xpath("//a[@id='pWdgTab_register']")).click();
	    Thread.sleep(10000);
        
	    //Enter Email id for Registration with existing mail id
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikhilsingz@gmail.com");
	    driver.findElement(By.xpath("//input[@id='remail']")).sendKeys("nikhilsingz@gmail.com");
	    driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("1234567");
	    driver.findElement(By.xpath("//input[@id='sbtReg']")).click();
	    Thread.sleep(5000);
	    //Checking if Existing mail id validation  text label is present
	    
	    String bodyText = driver.findElement(By.xpath("//label[@id='exstUsr']")).getText();
	    //Thread.sleep(5000);
	    Assert.assertTrue(bodyText.contains("nikhilsingz@gmail.com is already registered with us"), "Text not found!");
	    System.out.println("My na sir jhon");
			
	}

}
