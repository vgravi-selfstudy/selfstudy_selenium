package com.viji.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegisterDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Viji\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver;

 
 
 //public void setUp() {
   driver = new ChromeDriver();

   driver.get("http://demo.guru99.com/test/newtours/");
   driver.manage().window().setSize(new Dimension(1040, 744));
   driver.findElement(By.linkText("REGISTER")).click();
   driver.findElement(By.name("firstName")).click();
   driver.findElement(By.name("firstName")).sendKeys("Vijayalakshmi");
   
   driver.findElement(By.name("lastName")).click();
   driver.findElement(By.name("lastName")).sendKeys("Ravi");
   
   driver.findElement(By.name("phone")).click();
   
   driver.findElement(By.id("email")).click();
   driver.findElement(By.id("userName")).click();
   driver.findElement(By.id("userName")).sendKeys("vgravi@gmail.com");
   
   driver.findElement(By.id("email")).click();
   driver.findElement(By.id("email")).sendKeys("vgravi");
   
   driver.findElement(By.name("password")).click();
   driver.findElement(By.name("password")).sendKeys("viji");
   driver.findElement(By.name("confirmPassword")).sendKeys("viji");
   driver.findElement(By.name("submit")).click();
   
  // driver.quit();
	}

}
