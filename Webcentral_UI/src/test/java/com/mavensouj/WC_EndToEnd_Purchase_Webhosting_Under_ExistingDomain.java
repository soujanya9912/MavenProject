
	package com.mavensouj;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class WC_EndToEnd_Purchase_Webhosting_Under_ExistingDomain extends SetUp {

		@Test
		public void MenuHoveringHosting() throws InterruptedException {

		
		
		System.out.println("welcome Main Menu--> Hosting");
	    String Hosting_MenuTabval=prop.getProperty("Hosting_MenuTab");
		WebElement hostmenu = driver.findElement(By.xpath(Hosting_MenuTabval));

			Actions nn = new Actions(driver);
			nn.moveToElement(hostmenu).perform();
			
			System.out.println("welcome Sub Menu--> Web Hosting");
			
			String webhosting_submenu=prop.getProperty("Web_Hosting");
			driver.findElement(By.xpath(webhosting_submenu)).click();
			Thread.sleep(4000);
         
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(554,4360)", "");
			Thread.sleep(3000);
			String buywebshosting=prop.getProperty("Buy_Webhosting");
			driver.findElement(By.xpath(buywebshosting)).click();
			Thread.sleep(3000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,390)", "");
			
			Thread.sleep(2000);
	
			String Domain_ExistingDomain=prop.getProperty("Domain_ExistingDomain");
			driver.findElement(By.xpath(Domain_ExistingDomain)).click();
			Thread.sleep(5000);
			
		    String existing_Domain_input=prop.getProperty("Existing_Domain_Input");
	        String existing_Domain_Data=prop.getProperty("Existing_Domain");
		    driver.findElement(By.xpath(existing_Domain_input)).sendKeys(existing_Domain_Data);
			Thread.sleep(5000);
			String Domain_Confirm=prop.getProperty("WebHoting_Confirm");
			driver.findElement(By.xpath(Domain_Confirm)).click();
			Thread.sleep(6000);
			
			String notes=prop.getProperty("Notes_Textarea");
			String notes_data=prop.getProperty("Notes_Data");
			driver.findElement(By.xpath(notes)).sendKeys(notes_data);
		
			Thread.sleep(4000);
			String proceed=prop.getProperty("Proceed_CheckOut");
			driver.findElement(By.xpath(proceed)).click();
	
			Thread.sleep(6000);
			
			String FirtsName=prop.getProperty("first_name");
			String FirstNData=prop.getProperty("FN_Data");
			driver.findElement(By.xpath(FirtsName)).sendKeys(FirstNData);
			//driver.findElement(By.xpath("//input[@id='#/properties/firstname']")).sendKeys("altonavv north");
			String lastName=prop.getProperty("lastName");
			String lastNData=prop.getProperty("LN_Data");
			driver.findElement(By.xpath(lastName)).sendKeys(lastNData);
			
			//driver.findElement(By.xpath("//input[@id='#/properties/lastname']")).sendKeys("ffestlvvvastname");
			
			String Email=prop.getProperty("Acct_Email");
			String EmailD=prop.getProperty("Email_Data");
			driver.findElement(By.xpath(Email)).sendKeys(EmailD);
		
			String Password=prop.getProperty("Acct_Pwd");
			String Pwd_Dataaa=prop.getProperty("Pwd_Data");
			driver.findElement(By.xpath(Password)).sendKeys(Pwd_Dataaa);
			
			String submit=prop.getProperty("Create_Submit");
			driver.findElement(By.xpath(submit)).click();
			Thread.sleep(9000);
			driver.findElement(By.xpath("//input[@placeholder='Search for address ...']")).sendKeys("karimnagar");
			//Error domain field is required
		}
}