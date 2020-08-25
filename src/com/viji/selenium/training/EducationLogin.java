package com.viji.selenium.training;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

public class EducationLogin {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
        
		System.setProperty("webdriver.chrome.driver","C:\\Viji\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		
        String baseUrl = "https://www.education.com/";
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        //Document document=new Document()
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.linkText("Log In"));
        
        login.click();
        
      /*  for (String windowName : driver.getWindowHandles()){
        	driver.switchTo().window(windowName);
        }
       */
        String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();	
            
        Iterator<String> i1=s1.iterator();
       
        // Tried to check that control is going to Popup Window. But this code is not required.
        while(i1.hasNext())			
        {	
        	System.out.println("Inside While");
            String ChildWindow=i1.next();		
            System.out.println("ChildWindow" + ChildWindow);	
            System.out.println("MainWindow" + MainWindow);
            Thread.sleep(1000);
            System.out.println("After Sleep");
            /*if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
            	System.out.println("Inside If");
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	   
                    WebElement emailOrPhone = driver.findElement(By.name("email"));
                    emailOrPhone.sendKeys("vgravi@gmail.com");
                    
                    WebElement password = driver.findElement(By.name("password"));
                    password.sendKeys("Arjun@2010");
                    System.out.println("Inside while");
                    
            }*/
        }
        
        
        WebElement emailOrPhone = driver.findElement(By.name("email"));
        emailOrPhone.sendKeys("vgravi@gmail.com");
        
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Arjun@2010");
        
        
        //WebElement loginClick = driver.findElement(ByCssSelector.className("btn btn-primary"));
        WebElement loginClick = driver.findElement(By.xpath("//*[@type='submit' and @value='Log In']"));
        loginClick.click();
        System.out.println("MainWindow" + MainWindow);
        
        
        List<WebElement> alllinks =driver.findElements(By.xpath("//*[@class='popular links hide-small']//a"));
        String a[]=new String[alllinks.size()];
        for(int i=0;i<alllinks.size();i++)
        {
            a[i]=alllinks.get(i).getText(); 
            if(a[i].equals("Worksheets"))
            {
                System.out.println("clicking on this link::"+driver.findElement(By.linkText(a[i])).getText());
                driver.findElement(By.linkText(a[i])).click();  

            }
            else
            {
                System.out.println("does not starts with B so not clicking");
            }
        }
        
        
        WebElement worksheets = driver.findElement(By.linkText("Worksheets"));
        worksheets.click();
        
        WebElement firstGradeWorksheets = driver.findElement(By.linkText("1st grade"));        
        firstGradeWorksheets.click();
        
        //System.out.println("emailOrPhone value :"  +emailOrPhone);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        /*if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       */
        //close Fire fox
       // driver.close();
       
    }

}
