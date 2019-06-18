package com.goibibo.Web.Goibibo_Desktop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bus_Vertical {
  @Test
  public void f() throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
		


      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.goibibo.com");
      
      driver.manage().window().maximize();
      
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	------------------ Click On Bus Icon --------------------------------	
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[4]/a/i")).click();
		
		
		Thread.sleep(2000);
		
//		------------------------------GO To Source point----------------------------------
		
		WebElement testDropDown = driver.findElement(By.id("gi_source"));
		
		testDropDown.sendKeys("Delhi");
		
		
	driver.findElement(By.xpath("//*[@id=\"gi_source_wrapper\"]/div/ul/li[1]")).click();
	
	Thread.sleep(2000);

//	-----------------------------------------Go to Destination Point-------------------

WebElement testDrop =	driver.findElement(By.id("gi_destination"));

testDrop.sendKeys("Agra");
	
	
	
	driver.findElement(By.xpath("//*[@id=\"gi_destination_wrapper\"]/div/ul/li[1]")).click();
	
	
//	---------------------------------------Select the Date---------------------------------
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("gi_onward_text")).click();
	
driver.findElement(By.xpath("//*[@id=\"jrdp_start-calen_5_29_2019\"]/div/span")).click();

Thread.sleep(2000);

//------------------------------------------Search Button-------------------------------------

driver.findElement(By.id("gi_search_btn")).click();



Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"opliner\"]/span/span")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"fltcrr-div\"]/li[1]/label")).click();

Thread.sleep(2000);


//-------------------------Click On Book button for Selecting the seat-----------------------

driver.findElement(By.xpath("//*[@id=\"cp\"]")).click();

Thread.sleep(5000);

driver.findElement(By.linkText("Cancellation Policy")).click();

Thread.sleep(5000);

driver.findElement(By.linkText("Seat Layout")).click();

driver.findElement(By.xpath("//*[@id=\"onw~redbusnew@1000011931012635100~2\"]")).click();

driver.findElement(By.xpath("//*[@id=\"bp-onw-redbusnew@1000011931012635100\"]/option[2]")).click();

Thread.sleep(2000);

driver.findElement(By.id("confirm")).click();

driver.findElement(By.linkText("Cancellation Policy")).click();

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"go_fareRulespopUp\"]/div/a")).click();

Thread.sleep(2500);

driver.findElement(By.xpath("//*[@id=\"adultchoose1\"]/option[2]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"adultfirstname1\"]")).sendKeys("Test");

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"adultlastname1\"]")).sendKeys("Booking");

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"adultage1\"]")).sendKeys("25");

driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"makePayment\"]")).click();

Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[7]")).click();

driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();

Thread.sleep(5000);

driver.close();

	}	

}
