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
import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginTest {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
  
		System.setProperty("webdriver.chrome.driver","C:\\Viji\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver;

  
  
  //public void setUp() {
    driver = new ChromeDriver();
    

  //}

  //public void tearDown() {
    driver.quit();
  //}
 
 // public void login() {
    // Test name: Login
    // Step # | name | target | value
    // 1 | open | /test/newtours/ | 
    driver.get("http://demo.guru99.com/test/newtours/");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | click | name=userName | 
    driver.findElement(By.name("userName")).click();
    // 4 | type | name=userName | Selenium
    driver.findElement(By.name("userName")).sendKeys("Selenium");
    // 5 | click | name=password | 
    driver.findElement(By.name("password")).click();
    // 6 | type | name=password | selenium
    driver.findElement(By.name("password")).sendKeys("selenium");
    // 7 | click | css=div > input | 
    driver.findElement(By.cssSelector("div > input")).click();
 // }
	}
}
