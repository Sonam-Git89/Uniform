package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.training.generics.GenericMethods;
import com.trianing.waits.WaitTypes;


public class OrderHistoryPOM {
	private WebDriver driver; 
	private WaitTypes types = new WaitTypes(driver);

	public OrderHistoryPOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	// Click on view icon
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement viewIcon;
	
	public void clickViewIcon(){
		this.viewIcon.click();
	}
	//Click on Return icon
	@FindBy(xpath="//div[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a[2]/i")
    private WebElement returnBtn;
	
	public void clickReturnBtn(){
		this.returnBtn.click();
	}
	
	//Click on valid Reason for Return radio button
	@FindBy(xpath="//input[@name='return_reason_id' and @value='3']")
    private WebElement reasonReturnBtn;
	
	public void clickReasonReturnBtn(){
		this.reasonReturnBtn.click();
	}
	
	//Click radio button of Product is opened 
	@FindBy(xpath="//input[@name='opened' and @value = '1']")
    private WebElement productOpenBtn;
	
	public void clickProductOpenBtn(){
		this.productOpenBtn.click();
	}
	
	//Enter reason for return in Faulty or other details textbox
	
	@FindBy(id="input-comment")
	private WebElement faultyDetailsEdt;
	
	public void sendFaultyDetailsEdt(String faultyEdt) {
		this.faultyDetailsEdt.clear();
		this.faultyDetailsEdt.sendKeys(faultyEdt);
	}
	
	// Check "I have read and agree to the Exchange/Return Policy"
	@FindBy(name="agree")
    private WebElement agreeCheckBtn;
	
	public void clickAgreeCheckBtn(){
		this.agreeCheckBtn.click();
	}
	
	//Click on Submit button
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
private WebElement submitBtn;
	
	public void clickSubmitBtn(){
		this.submitBtn.click();
	}
	
	
	

}
