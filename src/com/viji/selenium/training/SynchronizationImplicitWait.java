package com.viji.selenium.training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Viji\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Flights")).click();
		 
		 WebElement radio1 = driver.findElement(By.name("tripType"));							
	       						
		 if(radio1.isSelected()){		
	        //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("Radio Button Option 1 Selected");					
		 }
		 
		 WebElement passengerDropdwon = driver.findElement(By.name("passCount"));	
		 passengerDropdwon.sendKeys("3");
		 
		 WebElement departingFrom = driver.findElement(By.name("fromPort"));	
		 departingFrom.sendKeys("London");
	        				
		 WebElement fromMonth = driver.findElement(By.name("fromMonth"));	
		 fromMonth.sendKeys("8");
		 
		 WebElement fromDay = driver.findElement(By.name("fromDay"));	
		 fromDay.sendKeys("29");
		 
		 WebElement arivingIn = driver.findElement(By.name("toPort"));	
		 arivingIn.sendKeys("Seattle");
		 
		 WebElement toMonth = driver.findElement(By.name("toMonth"));	
		 toMonth.sendKeys("9");
		 
		 WebElement toDay = driver.findElement(By.name("toDay"));	
		 toDay.sendKeys("20");
		 
				 
		 List<WebElement> list = driver.findElements(By.name("servClass"));    
		 ((WebElement) list.get(1)).click();
			 
		 WebElement airline = driver.findElement(By.name("airline"));	
		 airline.sendKeys("Unified Airlines");
		 
		 WebElement findFlights = driver.findElement(By.name("findFlights"));
		 findFlights.click();
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		 
		 driver.findElement(By.xpath("//img[@src='images/home.gif']")).isEnabled();
		 
		 if( driver.findElement(By.xpath("//img[@src='images/home.gif']")).isEnabled())
		 {
		 System.out.println("Inside if ");
		 }
	}

}
