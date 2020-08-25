package com.viji.selenium.training;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProgram {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\Viji\\Selenium downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Viji\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
	   // DesiredCapabilities caps = new DesiredCapabilities();
	    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	    //caps.setCapability(CapabilityType.HAS_NATIVE_EVENTS, false);
	    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	   // FirefoxDriver driver = new FirefoxDriver(caps);
		
		
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println("actualTitle value :"  +actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
       // driver.close();
       
    }

}