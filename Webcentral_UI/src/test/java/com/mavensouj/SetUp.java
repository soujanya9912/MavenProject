package com.mavensouj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SetUp {
	

	WebDriver driver;
	Properties prop = new Properties();
	
	@BeforeClass
	public void Initalization() throws InterruptedException, IOException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties");
		prop.load(fis);
		
		driver=new ChromeDriver();
		System.out.println("Open Chrome Browser");
		driver.get(prop.getProperty("QA_Url"));
	
		//driver.get(prop.
		driver.manage().window().maximize();
		
	

	   
	}
	
	
	
	@AfterClass
	public void Cleanup()
	{
		driver.quit();
	}

}
