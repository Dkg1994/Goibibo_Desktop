package com.goibibo.Web.Goibibo_Desktop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Train_Vertical {
  @Test
  public void f() throws InterruptedException {
	  

System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.goibibo.com/trains/results?src=AGC&dst=DEC&date=20190801&class=All&srcname=Agra%20Cantt.%20Railway%20Station&dstname=Delhi%20Cantt.%20Railway%20Station");
        
        driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/section/div[1]/div[3]/a/span")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/section/div[2]/div[2]/div[1]/div/div[2]/button")).click();
		
	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div/div[2]/button")).click();
		
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Devg");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div[1]/div[2]/button")).click();
	
	Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div[1]/select/option[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div[2]/input")).sendKeys("Test");
		
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/input")).sendKeys("22");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[7]/div[2]/div[2]/div[1]/input")).sendKeys("testnoc009@gmail.com");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[7]/div[3]/div[2]/div[1]/div[2]/input")).sendKeys("9999999999");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[8]/div[2]/input")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div[2]/input")).click();
		
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div/div[2]/button")).click();
	
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[6]")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
	
	Thread.sleep(6000);
	
	driver.quit();
	
	
	
	}
	

}

