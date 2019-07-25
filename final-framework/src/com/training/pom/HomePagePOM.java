package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.trianing.waits.WaitTypes;


public class HomePagePOM {
	private WebDriver driver; 
	private WaitTypes types = new WaitTypes(driver);

	public HomePagePOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement accountLaunch;
	
	public void clickAccountLaunch() {
		types.waitForElement(this.accountLaunch, 30);
		this.accountLaunch.click();
	}
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerBtn; 

	public void clickRegisterBtn() {
		this.registerBtn.click();
	}

	@FindBy(name="firstname")
	private WebElement firstNameEdt;

	public void sendFirstName(String firstName) {
		this.firstNameEdt.clear();
		this.firstNameEdt.sendKeys(firstName);
	}

	@FindBy(name="lastname")
	private WebElement lastNameEdt;

	public void sendLastName(String lastName) {
		this.lastNameEdt.clear();
		this.lastNameEdt.sendKeys(lastName);
	}

	@FindBy(name="email")
	private WebElement emailEdt;

	public void sendEmailId(String emailId) {
		this.emailEdt.clear();
		this.emailEdt.sendKeys(emailId);
	}

	@FindBy(name="telephone")
	private WebElement telephoneEdt;

	public void sendTelephone(String telephoneNo) {
		this.telephoneEdt.clear();
		this.telephoneEdt.sendKeys(telephoneNo);
	}

	@FindBy(name="address_1")
	private WebElement address1Edt;

	public void sendAddress1(String address1 ) {
		this.address1Edt.clear();
		this.address1Edt.sendKeys(address1);
	} 	 
	@FindBy(name="city")
	private WebElement cityNameEdt;

	public void sendcityName(String cityName) {
		this.cityNameEdt.clear();
		this.cityNameEdt.sendKeys(cityName);
	} 	 

	@FindBy(name="postcode")
	private WebElement postcodeEdt;

	public void sendPostcode(String postCode) {
		this.postcodeEdt.clear();
		this.postcodeEdt.sendKeys(postCode);
	} 	 
	@FindBy(id="input-country")
	private WebElement countryNameEdt;
	

	public void sendCountryName(String countryName) {
		WebElement element = this.countryNameEdt ;
		Select selCountryName = new Select (element);
		selCountryName.selectByVisibleText(countryName);
	} 	 

	@FindBy(id="input-zone")
	private WebElement stateNameEdt;

	public void sendStateName(String stateName) {
		WebElement element = this.stateNameEdt;
		Select selStateName = new Select (element);
		selStateName.selectByVisibleText(stateName);
	} 	


	@FindBy(name="password")
	private WebElement passwordEdt;

	public void sendPassword(String password) {
		this.passwordEdt.clear();
		this.passwordEdt.sendKeys(password);
	} 	

	@FindBy(name="confirm")
	private WebElement passwordConfirmEdt;

	public void sendPasswordConfirm(String passwordC) {
		this.passwordConfirmEdt.clear();
		this.passwordConfirmEdt.sendKeys(passwordC);
	} 

	@FindBy(xpath="//input[@name='newsletter' and @value='0']")
	private WebElement radioBtnEdt;

	public void clickRadioBtn() {
		this.radioBtnEdt.click();
	} 


	@FindBy(name="agree")
	private WebElement privacyPolicyEdt;

	public void clickPrivacyPolicy() {
		this.privacyPolicyEdt.click();
	} 										 	 

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBtn;

	public void clickContinueBtn() {
		this.continueBtn.click();
	}
		
		@FindBy(xpath="//img[@alt='banner1']")
		private WebElement shopUniformBtn;

		public void clickShopUniformBtn() {
			this.shopUniformBtn.click();
			
			} 	
		
		@FindBy(xpath ="//*[@id=\"featured-grid\"]/div[2]/div/div/div[1]/a/img")
		private WebElement sportsTshirtBtn;

		public void clickSportsTshirtBtn() {
			this.sportsTshirtBtn.click();
			
			} 
		
		
		
}
