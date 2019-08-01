package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPagePOM {
	
	private WebDriver driver; 

	public LoginPagePOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='My Account']")
	private WebElement drpAccount;
	
	public void clickDrpAccount() {
		this.drpAccount.click();
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBtn;
	
	public void clickLoginBtn() 
	{
		this.loginBtn.click();
	}
	
	@FindBy(id="input-email")
	private WebElement emailAddressEdt;
	
	public void sendEmailAddressEdt(String emailAdd) {
		this.emailAddressEdt.clear();
		this.emailAddressEdt.sendKeys(emailAdd);
	}
	
	@FindBy(id="input-password")
	private WebElement passwordEdt;
	
	public void sendPasswordEdt(String password) {
		this.passwordEdt.clear();
		this.passwordEdt.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@value='Login']")
private WebElement loginLogoBtn;
	
		public void clickLoginLogoBtn() 
	{
		this.loginLogoBtn.click();
	}
		
		@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
		private WebElement forgotPasswordBtn;
		
		public void clickForgotPasswordBtn(){
			this.forgotPasswordBtn.click();
		}
		
		@FindBy(id="input-email")
		private WebElement emailRecoverEdt;
		
		public void sendEmailRecoverEdt(String emailAddress) {
			this.emailRecoverEdt.clear();
			this.emailRecoverEdt.sendKeys(emailAddress);
		}
		
		@FindBy(xpath="//input[@class='btn btn-primary']")
		
	private WebElement continueBtn;
		
		public void clickContinueBtn(){
			this.continueBtn.click();
		}
		//1.Click on User Icon dropdown

		@FindBy(xpath="//span[contains(text(),'Sonam Dutta')]")
        private WebElement myAccountBtn;
		
		public void clickMyAccountBtn(){
			this.myAccountBtn.click();
		}
		//2. Click on Order History link
        @FindBy(xpath="//div[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a")
        private WebElement orderHistoryBtn;
		
		public void clickOrderHistoryBtn(){
			this.orderHistoryBtn.click();
		}
		
		
		
}