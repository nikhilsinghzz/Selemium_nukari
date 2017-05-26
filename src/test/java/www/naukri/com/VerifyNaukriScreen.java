package www.naukri.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class VerifyNaukriScreen {
	
	WebDriver driver ;
	
	@Test 
	public void checkLoginscreen(){
		
		
		 TC01_LaunchNaukri lgn=new TC01_LaunchNaukri();
		 lgn.start();
		 lgn.Applaunchapp();
		 lgn.closepopup();
		 
		 boolean Username = driver.findElement(By.xpath(".//*[@id='eLogin']")).isDisplayed();
		 boolean Password = driver.findElement(By.xpath(".//*[@id='pLogin']")).isDisplayed();
		 boolean LoginButton = driver.findElement(By.xpath(".//button[@value='Login']")).isDisplayed();
			
			if (Username== true && Password==true && LoginButton==true){
				System.out.println("The required Login Page Elements are present. pass");	
			}			else System.out.println("The required Login Page Elements are not present. fail");
		 //driver.quit();
		
		
		
	}

}
