package specs;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	//Hello world 
	
WebDriver driver;
	
	By emailid     =By.xpath(".//*[@id='eLogin']");
	By password    =By.xpath(".//*[@id='pLogin']");
	By LoginButton =By.xpath(".//button[@value='Login']");
	By Mainemail      =By.xpath("//input[@id='email']");
	By MainRemail     =By.xpath("//input[@id='remail']");
	By Mainpassword   =By.xpath("//input[@id='pwd']");
	By MainloginButton      =By.xpath("//input[@id='sbtReg']");
	
	
	
	public loginpage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	public void TypeEmail()
	{
		driver.findElement(emailid).sendKeys("nikhilsinghz@gmail.com");
	}

	public void Typepassword()
	{
		driver.findElement(password).sendKeys("1234567");
		
	}
	
	public void ClickOnLoginButton(){
		
		driver.findElement(LoginButton).click();
		
	}
	public void MTypeEmail(String uid)
	{
		
		driver.findElement(Mainemail).sendKeys(uid);
		
	}
	
	public void RMTypeEmail(String Rmainemail)
	
	{
	driver.findElement(MainRemail).sendKeys(Rmainemail);
		
	}
	
	 
	
	
	public void Mpassword(String Mpaswd)
	{
		driver.findElement(Mainpassword).sendKeys(Mpaswd);		
	}
	
	
	public void MLoginButton()
	{
		driver.findElement(MainloginButton).click();
		
	}
	

}
