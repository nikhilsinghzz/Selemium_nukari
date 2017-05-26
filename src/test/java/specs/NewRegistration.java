package specs;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import www.naukri.com.BaseClass;


public class NewRegistration extends BaseClass {
	
	@Test
	public void NewRegistration (){
	
	//Registration with fresh mail id 
    
    driver.get("https://login.naukri.com/nLogin/Login.php");
    driver.findElement(By.xpath("//a[@id='pWdgTab_register']")).click();
    loginpage login=new loginpage(driver);
    login.MTypeEmail();	       
    login.RMTypeEmail();
    login.Mpassword();
    login.MLoginButton();
    
    
    
    
    
   
//    
//    // For Unique Email id
////    Date d = new Timestamp(System.currentTimeMillis());
//    String n = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));
//    
//
//    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(n + "abc@gmail.com");
//    driver.findElement(By.xpath("//input[@id='remail']")).sendKeys(n + "abc@gmail.com");
//    driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("1234567");
//    driver.findElement(By.xpath("//input[@id='sbtReg']")).click();
    
}
}