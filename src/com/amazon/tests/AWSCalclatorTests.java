package com.amazon.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.amazon.pages.AwsCalculatorPage;
//import com.prestashop.utilities.TestBasedClass;
import com.amazon.utilities.TestBasedClass;



public class AWSCalclatorTests extends TestBasedClass{
	
	AwsCalculatorPage calculatorPage = new AwsCalculatorPage();
	
	@Test(priority=0, description="Monthly bill should be $0.00 by default")
	public void defaultMonthlyBillTest() {
		
		System.out.println("LabelText = "+calculatorPage.billLabel.getText());
		System.out.println("money in Lable = "+calculatorPage.getMonthlyBillAmount());
		
		assertTrue(calculatorPage.isAt());
		assertEquals(0.0, calculatorPage.getMonthlyBillAmount());
		
		
	}
	
	@Test(priority=1)
	public void addedEc2DefaultValuesTest() throws InterruptedException{
		// click on green round button +
		calculatorPage.addEc2.click();
		//calculatorPage.description.sendKeys("test");
		assertTrue(calculatorPage.description.getAttribute("value").isEmpty());
		// 1 in the cell with number
		assertEquals(1, calculatorPage.getInstanceCount());
		
	}
	

}
