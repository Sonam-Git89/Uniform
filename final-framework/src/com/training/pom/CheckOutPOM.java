package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.trianing.waits.WaitTypes;

public class CheckOutPOM {
	private WebDriver driver; 
	public CheckOutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='account' and @value='guest']")
	private WebElement guestCheckoutBtn;

	public void clickGuestCheckoutBtn() {
	this.guestCheckoutBtn.click();
	}

	public WebElement getGuestCheckoutBtn() {
		return this.guestCheckoutBtn;

	}

	@FindBy(id="button-account")
	private WebElement continueBtn;

	public void clickContinueBtn() {
		this.continueBtn.click();

	}

	@FindBy(name="firstname")
	private WebElement firstNameEdt;

	public void sendFirstNameEdt(String firstName) {
		this.firstNameEdt.clear();
		this.firstNameEdt.sendKeys(firstName);
	} 	

	@FindBy(name="lastname")
	private WebElement lastNameEdt;

	public void sendLastNameEdt(String lastName) {
		this.lastNameEdt.clear();
		this.lastNameEdt.sendKeys(lastName);
	} 

	@FindBy(id="input-payment-email")
	private WebElement emailEdt;

	public void sendEmailEdt(String email) {
		this.emailEdt.clear();
		this.emailEdt.sendKeys(email);
	} 


	@FindBy(name="telephone")
	private WebElement telephoneEdt;

	public void sendTelephoneEdt(String telephone) {
		this.telephoneEdt.clear();
		this.telephoneEdt.sendKeys(telephone);
	} 

	@FindBy(name="address_1")
	private WebElement addressEdt;

	public void sendAddressEdt(String address) {
		this.addressEdt.clear();
		this.addressEdt.sendKeys(address);
	}

	@FindBy(name="city")
	private WebElement cityEdt;

	public void sendCityEdt(String city) {
		this.cityEdt.clear();
		this.cityEdt.sendKeys(city);
	}

	@FindBy(name="postcode")
	private WebElement postcodeEdt;

	public void sendPostcodeEdt(String postcode) {
		this.postcodeEdt.clear();
		this.postcodeEdt.sendKeys(postcode);
	}

	@FindBy(id="input-payment-country")
	private WebElement countryEdt;


	public void sendCountryName(String countryName) {
		WebElement element = this.countryEdt ;
		Select selCountryName = new Select (element);
		selCountryName.selectByVisibleText(countryName);
	} 	 

	@FindBy(id="input-payment-zone")
	private WebElement stateEdt;

	public void sendStateName(String stateName) {
		WebElement element = this.stateEdt;
		Select selStateName = new Select (element);
		selStateName.selectByVisibleText(stateName);
	}

	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/div[2]/label/input")
	private WebElement shippingAddress;

	public void clickShippingCheckbox() {
		this.shippingAddress.clear();
		this.shippingAddress.click();

	}

	@FindBy(id="button-guest")
	private WebElement continue1Btn;

	public void clickContinue1Btn() {
		this.continue1Btn.click();

	}

	@FindBy(name="comment")
	private WebElement addComment;

	public void sendAddComment(String comment) {
		this.addComment.clear();
		this.addComment.sendKeys(comment);
	}
	
	@FindBy(id="button-shipping-method")
	private WebElement shippingContinueBtn;

	public void clickShippingContinueBtn() {
		this.shippingContinueBtn.click();

	}

	@FindBy(name="agree")
	private WebElement agreeBtn;

	public void clickAgreeBtn() {
		this.agreeBtn.click();

	}
	@FindBy(id="button-payment-method")
	private WebElement continue2Btn;

	public void clickContinue2Btn() {
		this.continue2Btn.click();

	}


	@FindBy(id="button-confirm")
	private WebElement confirmOrderBtn;

	public void clickConfirmOrderBtn() {
		this.confirmOrderBtn.click();

	}



}


