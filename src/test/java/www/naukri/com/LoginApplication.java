package www.naukri.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginApplication extends BaseClass {
	
	@Test(description="This TC will perform valid login")
	public void LoginApplicaton () throws InterruptedException{
		
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys("nikhilsingz@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("n9875033620");
		driver.findElement(By.xpath(".//button[@value='Login']")).click();
		
	}
	
	@Test(description="This TC will perform invalidvalid login")
	public void LoginApplicatonInvalid () throws InterruptedException{
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys("nikhilsingz@gmailc.com");
		driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("n9875033620");
		driver.findElement(By.xpath(".//button[@value='Login']")).click();

		
	}

}
