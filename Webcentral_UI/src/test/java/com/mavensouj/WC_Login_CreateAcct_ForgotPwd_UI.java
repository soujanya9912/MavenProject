package com.mavensouj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class WC_Login_CreateAcct_ForgotPwd_UI extends SetUp{
@Test
	public void creatLoginacct() throws InterruptedException
	{
		
	String login=prop.getProperty("WC_login");
	driver.findElement(By.xpath(login)).click();
    Thread.sleep(5000);
    
	String login_UN=prop.getProperty("WC_login_UN");
	String login_UN_Data=prop.getProperty("WC_login_UN_Data");
 driver.findElement(By.xpath(login_UN)).sendKeys(login_UN_Data);
 
 
	String login_PWD=prop.getProperty("WC_Login_CPWD");
	String login_PWD_Data=prop.getProperty("WC_Login_CPWD_data");
driver.findElement(By.xpath(login_PWD)).sendKeys(login_PWD_Data);


String WC_Lo_Submit=prop.getProperty("WC_Login_Submit");
driver.findElement(By.xpath(WC_Lo_Submit)).click();
}



@Test
	public void forgotpassword() throws InterruptedException
	{
	String login=prop.getProperty("WC_login");
	driver.findElement(By.xpath(login)).click();
 
 
 Thread.sleep(5000);
 
 String FPWD=prop.getProperty("Forgot_PWD");
driver.findElement(By.xpath(FPWD)).click();

String PWDUN=prop.getProperty("FPWDUN");
String PWDUN_Data=prop.getProperty("FPWUN_Data");
driver.findElement(By.xpath(PWDUN)).sendKeys(PWDUN_Data);

String FPWD_Button=prop.getProperty("FPWD_button");
driver.findElement(By.xpath(FPWD_Button)).click();


	}

@Test
public void Createacct() throws InterruptedException
{
Faker faker=new Faker();
String firstName=faker.name().firstName();
String lastName=faker.name().lastName();
String email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@domain.com";
String WC_Loginv=prop.getProperty("WC_login");
driver.findElement(By.xpath(WC_Loginv)).click();
Thread.sleep(4000);

String Create_One_here=prop.getProperty("Create_acct_here");
driver.findElement(By.xpath(Create_One_here)).click();
Thread.sleep(4555);

String Cr_given_name=prop.getProperty("Create_acct_givenname");
String Cr_given_name_data=prop.getProperty("Cre_given_name_data");
driver.findElement(By.xpath(Cr_given_name)).sendKeys(Cr_given_name_data);
Thread.sleep(2000);


String Cre_Family_Na=prop.getProperty("Cre_Family_Name");
String Cre_Family_ndata=prop.getProperty("Cre_Family_Name_Data");
driver.findElement(By.xpath(Cre_Family_Na)).sendKeys(Cre_Family_ndata);
Thread.sleep(2000);

String Cre_Em=prop.getProperty("Cre_Email");
//String Cre_Family_da=prop.getProperty("Cre_Email_Data");
driver.findElement(By.xpath(Cre_Em)).sendKeys(email);
Thread.sleep(2000);

String Crepwd=prop.getProperty("Cre_pwd");
String Cre_pwd_da=prop.getProperty("Cre_pwd-data");
driver.findElement(By.xpath(Crepwd)).sendKeys(Cre_pwd_da);
Thread.sleep(3000);

String sub=prop.getProperty("submit");
Thread.sleep(2000);

driver.findElement(By.xpath(sub)).click();



}}