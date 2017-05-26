package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configuration {
	
	@Test
	public void testconfig()throws Exception  {
		
	
	
	File src=new File("./Configuration/config.property");
	FileInputStream fis = new FileInputStream(src);
	
    Properties pro= new Properties();
    pro.load(fis);
   String URLpath= pro.getProperty("URL");
   System.out.println("this is my URL"+  URLpath);
    
	}
	

}
