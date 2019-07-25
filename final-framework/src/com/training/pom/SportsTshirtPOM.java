package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsTshirtPOM {
	private WebDriver driver; 
	
	public SportsTshirtPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@id='product']//div[@class='radio']/label/input)[6]")
	private WebElement chestSizeBtn;

	public void clickChestSizeBtn() {
		this.chestSizeBtn.click();
		
		}
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCartBtn;

	public void clickAddToCartBtn() {
		this.addToCartBtn.click();
		
		}
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cartIcon;
	public void clickCartIcon() {
		Actions act = new Actions(driver);
	    act.moveToElement(this.cartIcon).build().perform();
	}
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
	private WebElement viewCartBtn;

	public void clickViewCartBtn() {
		this.viewCartBtn.click();
		
		}
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement checkoutBtn;

	public void clickCheckoutBtn() {
		this.checkoutBtn.click();
		
		}
	
	@FindBy(xpath="//input[@value='guest']")
	private WebElement guestCheckoutBtn;

	public void clickGuestCheckoutBtn() {
		this.guestCheckoutBtn.click();
		
		}
	
	@FindBy(id="button-account")
	private WebElement continueBtn;

	public void clickContinueBtn() {
		this.continueBtn.click();
		
		}
	
	@FindBy(name="firstname")
	private WebElement firstNameEdt;

	public void sendPassword(String firstName) {
		this.firstNameEdt.clear();
		this.firstNameEdt.sendKeys(firstName);
	} 	
	
	

}
	
	