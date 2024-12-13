package com.mavensouj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WC_UI_EndToEnd_Purchase_Domain extends SetUp
{

	
	

	@Test
	public void domainshover() throws InterruptedException
	{

		String domain_Menu=prop.getProperty("Domain_Menu");
      
		WebElement domainsmenu = driver.findElement(By.xpath(domain_Menu));
		Actions nn = new Actions(driver);
		nn.moveToElement(domainsmenu).perform();

		String domiansmenu=prop.getProperty("Domains_Menu");
		driver.findElement(By.xpath(domiansmenu)).click();

		Thread.sleep(5000);
	    String domainsSearchXpath = prop.getProperty("Domains_search");
	    String domainserachdata=prop.getProperty("Domain_Serach_Data");
        
		 driver.findElement(By.xpath(domainsSearchXpath)).sendKeys(domainserachdata);
		 String domainSearchbutton=prop.getProperty("Search_button");
		 driver.findElement(By.xpath(domainSearchbutton)).click();

		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,390)", "");
		
		//looks like hidden element unable to add cant find xpath looks like shawdow root
	}
	
}
