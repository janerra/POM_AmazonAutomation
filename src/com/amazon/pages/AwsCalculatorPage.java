package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utilities.Driver; 

public class AwsCalculatorPage {
	
	private WebDriver driver;
	
	public AwsCalculatorPage() {
		this.driver = Driver.getDriver(null);
		PageFactory.initElements(driver, this);
	}
	
	// find elelment with text = Estimate of your Monthly Bill ($ 0.00)
	@FindBy (className = "billLabel")
	public WebElement billLabel;
	
	@FindBy (xpath="(//*[@class='gwt-PushButton small gwt-PushButton-up'])[1]/img")
	public WebElement addEc2;
	
	// first field
	@FindBy (xpath="//tr[@class=\"EC2InstanceRow itemsTableDataRow table\"]//input[@class=\"gwt-TextBox input\"]")
	public WebElement description; 
	
	
	@FindBy(xpath="//tr[@class='EC2InstanceRow itemsTableDataRow table']//table[@class='SF_EC2_INSTANCE_FIELD_INSTANCES field integerNumericField']//input[@class='gwt-TextBox numericTextBox input']")
	public WebElement instanceCount;
	
	public int getInstanceCount() {
		return Integer.parseInt(instanceCount.getAttribute("value"));
	}
	
	public boolean isAt() {
		System.out.println(driver.getTitle().toString());
		return driver.getTitle().equals("Amazon Web Services Simple Monthly Calculator");
	}
	
	// take money from string = Estimate of your Monthly Bill ($ 0.00)
	public double getMonthlyBillAmount() {
		String billText = billLabel.getText();
		
		String[] arrText = billText.split("\\$ ");
		String bill = arrText[1].replace(")", "");
		
		return Double.parseDouble(bill);
		
	}

}
