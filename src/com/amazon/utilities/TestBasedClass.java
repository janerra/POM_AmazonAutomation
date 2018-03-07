package com.amazon.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBasedClass {
	
    protected WebDriver driver;
    
    @Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void setUp(@Optional String browser) {
    	//System.out.println(browser);
    	
		driver = Driver.getDriver(browser);
		//System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_PATH);
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(Configuration.getProperty("url"));
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
//		driver.quit();
	}
}
