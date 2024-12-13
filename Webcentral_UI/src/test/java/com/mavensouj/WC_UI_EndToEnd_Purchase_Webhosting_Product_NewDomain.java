package com.mavensouj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class WC_UI_EndToEnd_Purchase_Webhosting_Product_NewDomain extends SetUp {

	@Test
	public void MenuHoveringHosting() throws InterruptedException {
		Faker faker=new Faker();
		String firstName=faker.name().firstName();
		String lastName=faker.name().lastName();
		String email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@domain.com";
	Thread.sleep(2000);

		
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
        String newdomianreg=prop.getProperty("New_Domain");
		String newdomain_data=prop.getProperty("New_Domain_data");
		driver.findElement(By.xpath(newdomianreg)).sendKeys(newdomain_data);
		Thread.sleep(6000);
		
		String register=prop.getProperty("Register");
		String aabasket=prop.getProperty("Add_To_Basket");
		driver.findElement(By.xpath(register)).click();
		driver.findElement(By.xpath(aabasket)).click();
		Thread.sleep(6000);
		String confirmproceed=prop.getProperty("WebHoting_Confirm");
		
		driver.findElement(By.xpath(confirmproceed)).click();
	Thread.sleep(6000);
	
	String notes=prop.getProperty("Notes_Textarea");
	String notes_data=prop.getProperty("Notes_Data");
	driver.findElement(By.xpath(notes)).sendKeys(notes_data);
	System.out.println("before continue");
	Thread.sleep(6000);
	
	String proceed_chkout=prop.getProperty("Proceed_CheckOut");


	driver.findElement(By.xpath(proceed_chkout)).click();
	System.out.println("after continue");
	Thread.sleep(4000);
	
	
	String FirtsName=prop.getProperty("first_name");
	String FirstNData=prop.getProperty("FN_Data");
	driver.findElement(By.xpath(FirtsName)).sendKeys(FirstNData);
	String lastNamee=prop.getProperty("lastName");
	String lastNData=prop.getProperty("LN_Data");
	driver.findElement(By.xpath(lastNamee)).sendKeys(lastNData);
	
	
	String Email=prop.getProperty("Acct_Email");
	//String EmailD=prop.getProperty("Email_Data");
	driver.findElement(By.xpath(Email)).sendKeys(email);

	String Password=prop.getProperty("Acct_Pwd");
	String Pwd_Dataaa=prop.getProperty("Pwd_Data");
	driver.findElement(By.xpath(Password)).sendKeys(Pwd_Dataaa);
	
	String submit=prop.getProperty("Create_Submit");
	driver.findElement(By.xpath(submit)).click();
	Thread.sleep(19000);
	String billing_address=prop.getProperty("BillingDetails_add");
	String billing_add_data=prop.getProperty("Billing_add_data");
	driver.findElement(By.xpath(billing_address)).sendKeys(billing_add_data);

	String billing_address1=prop.getProperty("BillingDetails_add1");
	String billing_add1_data=prop.getProperty("BillingDetails_add1_data");
	driver.findElement(By.xpath(billing_address1)).sendKeys(billing_add1_data);
	
	String billing_address2=prop.getProperty("BillingDetails_add2");
	String billing_add2_data=prop.getProperty("BillingDetails_add2_data");
	driver.findElement(By.xpath(billing_address2)).sendKeys(billing_add2_data);
	
	String billing_city=prop.getProperty("BillingDetails_city");
	String billing_city_data=prop.getProperty("BillingDetails_city_Data");
	driver.findElement(By.xpath(billing_city)).sendKeys(billing_city_data);
	
	String billing_postcode=prop.getProperty("BillingDetails_Postcode");
	String billing_postcode_Data=prop.getProperty("BillingDetails_Postcode_Data");
	driver.findElement(By.xpath(billing_postcode)).sendKeys(billing_postcode_Data);
	Thread.sleep(4000);
	WebElement dropdownr=driver.findElement(By.xpath("//select[@id='#/properties/regionId']"));
	Select sel=new Select(dropdownr);
	sel.selectByIndex(2);
	
	Thread.sleep(3000);
	WebElement fff=	driver.findElement(By.xpath("//select[@id='#/properties/countryId']"));
	Select selc=new Select(fff);
	selc.selectByIndex(4);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button//span[text()='Confirm address']")).click();

	Thread.sleep(9000);
	}

}