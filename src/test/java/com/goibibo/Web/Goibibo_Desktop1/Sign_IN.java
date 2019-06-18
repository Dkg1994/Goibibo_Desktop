package com.goibibo.Web.Goibibo_Desktop1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_IN {
  @Test
  public void f() throws InterruptedException {
	  
		

		System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.goibibo.com");
      
      driver.manage().window().maximize();
		
      driver.findElement(By.id("get_sign_in")).click();
      
      Thread.sleep(2000);
      
      driver.switchTo().frame("authiframe");
     Thread.sleep(1000);
      
     driver.findElement(By.id("authMobile")).sendKeys("8858558819");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//*[@id=\"mobileSubmitBtn\"]")).click();
     
     Thread.sleep(2000);
     
     driver.findElement(By.id("authCredentialPassword")).sendKeys("8858558819");
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//*[@id=\"passwordEyeMobilePassword\"]")).click();
     
     Thread.sleep(2000);
     
     driver.findElement(By.id("authCredentialPasswordSignInBtn")).click();
     
     Thread.sleep(5000);
      
  
   driver.quit();
   
	
   }


	}
	
	


